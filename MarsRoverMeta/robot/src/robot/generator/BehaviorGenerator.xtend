package robot.generator

import robot.dSL.Behaviors

class BehaviorGenerator {
	
	def static toText(Behaviors behavior){
	
		'''
		package assignment;
		
		import assignment.Model;
		
		public class �Auxiliary.toClass(behavior.name)� implements Behavior{
			
			Model m;
			private boolean suppressed;
			
			public �Auxiliary.toClass(behavior.name)�(Model m){
				this.m = m;
			}
			
			@Override
			public boolean takeControl() {
				�FOR sensor : Auxiliary.getSensors(behavior.sensorExpression)�
				m.�sensor�.fetchSample(m.�sensor�Samples, 0);
				�ENDFOR�
				return �Auxiliary.getControlReturnString(behavior.sensorExpression)�;
			}
			
			@Override
			public void action() {
				suppressed = false;
				�FOR action : behavior.actionlist�
					�Auxiliary.action2Text(action)�
				�ENDFOR�
					}
				}
			@Override
			public void suppress() {
				suppressed = true;
			}
		}
		'''	
	}
}