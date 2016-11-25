package robot.generator

import robot.dSL.RobotBehavior

class MainGenerator {
	
	def static toText(RobotBehavior root) 
	
	'''
	package assignment;
	
	import lejos.robotics.subsumption.Arbitrator;
	import lejos.robotics.subsumption.Behavior;
	
	public class Main {
	
		public static void main(String[] args) {
		 
		 Model m = new Model();
		 Behavior [] bArray;
		 
		 �FOR b : Auxiliary.getBehaviors(root)�
		 Behavior �b.name� = new �Auxiliary.toClass(b.name)�(m);
		 bArray.add(�b.name�);
		 �ENDFOR�
		 
		 Arbitrator arby = new Arbitrator(bArray);
		
		 arby.go();
		}
	}
	
	'''
	
}