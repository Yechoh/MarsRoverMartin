package robot.generator

import robot.dSL.RobotBehavior

class SlaveGenerator {
	
	def static MainToText(RobotBehavior behavior) {
		return '''
		import lejos.remote.nxt.BTConnector;
		import lejos.remote.nxt.NXTConnection;
		
		public class Main {
		
			public static void main(String[] args) {
				BTConnector connector = new BTConnector();
			 	NXTConnection connection = connector.waitForConnection(60000,NXTConnection.RAW);
				Model m = new Model();
				GetMessage gm = new GetMessage(connection,m);
				gm.start();
				ReadSensors rs = new ReadSensors(connection,m);
			}
		'''
	}
	
	def static ModelToText(robot.dSL.RobotBehavior behavior) {
		return '''
		public class Model {
			public boolean end=false;
			public boolean doneturning=false;
			
			
			public ModelSlave(){
			}
		}
		'''
	}
	
	def static GetMesageToText(robot.dSL.RobotBehavior behavior) {
		return '''
		import java.io.DataInputStream;
		import java.io.IOException;
		
		import lejos.hardware.lcd.LCD;
		import lejos.hardware.port.SensorPort;
		import lejos.hardware.sensor.EV3GyroSensor;
		import lejos.remote.nxt.NXTConnection;
		import lejos.robotics.SampleProvider;
		
		public class GetMessage extends Thread {
			
			private boolean bll;
			public DataInputStream reader;
			private Byte b;
			public Model m;
			public EV3GyroSensor gyrosensor;
			private SampleProvider gyro;
			private float[] gyroSamples;
		
			public GetMessage(NXTConnection connection, Model m){
			reader = connection.openDataInputStream();
			this.m=m;
			gyrosensor = new EV3GyroSensor(SensorPort.S4);
			gyro = gyrosensor.getAngleMode();
			gyroSamples = new float[gyro.sampleSize()];
			}
		
			public void run(){
				while(!bll){
					try{
						bll = ((b=reader.readByte())!='e');
					}catch (IOException ex){
			 			LCD.drawString("error:", 0, 3);
			 			LCD.drawString(ex.getMessage(),0,4);
					}
					if(b=='g'){
						int deg=0;
						try {
							deg = reader.readInt();
						} catch (IOException ex) {
							LCD.drawString("error:", 0, 3);
				 			LCD.drawString(ex.getMessage(),0,4);
						}
						gyro.fetchSample(gyroSamples,0);
						float start = gyroSamples[0];
						float end = start+deg-5;
						while(start<end){
							gyro.fetchSample(gyroSamples,0);
							start = gyroSamples[0];
						}
						m.doneturning=true;
					}
				}
			}
				
		}
		'''
	}
	
	def static ReadSensorsToText(robot.dSL.RobotBehavior behavior) {
		return '''
		import java.io.PrintWriter;
		
		import lejos.hardware.port.SensorPort;
		import lejos.hardware.sensor.EV3TouchSensor;
		import lejos.hardware.sensor.EV3UltrasonicSensor;
		import lejos.remote.nxt.NXTConnection;
		import lejos.robotics.SampleProvider;
		
		public class ReadSensors {
			
			public Model m;
			protected static EV3TouchSensor touchL, touchR;
			protected static EV3UltrasonicSensor sonar;
			public SampleProvider touchLeft, touchRight;
			public SampleProvider distance;
			public float[] touchLeftSamples, touchRightSamples;
			public float[] distanceSamples;
			public PrintWriter writer;
			
			public ReadSensors(NXTConnection connection, Model m){
				touchL = new EV3TouchSensor(SensorPort.S1);
				touchR = new EV3TouchSensor(SensorPort.S4);
				touchLeft = touchL.getTouchMode();
				touchRight = touchR.getTouchMode();
				distance = sonar.getDistanceMode();
				touchLeftSamples = new float[touchLeft.sampleSize()];
				touchRightSamples = new float[touchRight.sampleSize()];
				distanceSamples = new float[distance.sampleSize()];
				writer = new PrintWriter(connection.openOutputStream());
				this.m=m;
				while(!m.end){
					//touchleft
					touchLeft.fetchSample(touchLeftSamples, 0);
					if(touchLeftSamples[0] > 0){
						writer.print('l');
						writer.flush();
					}
					//touchright
					touchRight.fetchSample(touchRightSamples, 0);
					if(touchRightSamples[0] > 0){
						writer.print('r');
						writer.flush();
					}
					//front ultra
					distance.fetchSample(distanceSamples, 0);
					writer.print(distanceSamples[0]);
					writer.flush();
					//gyro
					if(m.doneturning){
						m.doneturning=false;
						writer.print('g');
						writer.flush();
					}
				}
			}
		}
		
		'''
	}
	
}