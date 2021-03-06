package robot.generator

import java.util.ArrayList
import java.util.HashSet
import java.util.List
import robot.dSL.ANDexpression
import robot.dSL.Behaviors
import robot.dSL.ColorLiteral
import robot.dSL.DistanceLiteral
import robot.dSL.ExpressionBracket
import robot.dSL.LeftMovementAction
import robot.dSL.MovementAction
import robot.dSL.ORexpression
import robot.dSL.RightMovementAction
import robot.dSL.RobotBehavior
import robot.dSL.RotateEnum
import robot.dSL.RotateMovementAction
import robot.dSL.TouchLiteral

class Auxiliary {
	
	def static List<Behaviors> getBehaviors(RobotBehavior root) {
		var List<Behaviors> behaviorslist = new ArrayList<Behaviors>() 
	
		for (Behaviors t : root.behaviorlist){
			behaviorslist.add(t);
		}
		
		return behaviorslist; 
	}
	
	def static String toClass(String s){
		var String capital = s.substring(0,1).toUpperCase() + s.substring(1);
		return capital;
	}
	
	def static dispatch HashSet<String> getSensors(ANDexpression b){
		var HashSet<String> sensors = new HashSet<String>();
		sensors.addAll(getSensors(b.left));
		sensors.addAll(getSensors(b.right));
		return sensors; 
	}
	
	def static dispatch HashSet<String> getSensors(ORexpression b){
		var HashSet<String> sensors = new HashSet<String>();
		sensors.addAll(getSensors(b.left));
		sensors.addAll(getSensors(b.right));
		return sensors; 
	}
	
	def static dispatch HashSet<String> getSensors(ExpressionBracket b){
		return getSensors(b.exp); 
	}
	
	def static dispatch HashSet<String> getSensors(TouchLiteral b){
		var HashSet<String> sensors = new HashSet<String>();
		sensors.add('''�b.touch�''');
		return sensors; 
	}
	
	def static dispatch HashSet<String> getSensors(ColorLiteral b){
		var HashSet<String> sensors = new HashSet<String>();
		sensors.add('''color''');
		return sensors; 
	}
	
	def static dispatch HashSet<String> getSensors(DistanceLiteral b){
		var HashSet<String> sensors = new HashSet<String>();
		sensors.add('''distance''');
		return sensors; 
	}
	
	def static dispatch CharSequence getControlReturnString(ANDexpression b){
		'''�getControlReturnString(b.left)� && �getControlReturnString(b.right)�'''
	}
	
	def static dispatch CharSequence getControlReturnString(ORexpression b){
		'''�getControlReturnString(b.left)� || �getControlReturnString(b.right)�'''
	}
	
	def static dispatch CharSequence getControlReturnString(ExpressionBracket b){
		'''(�getControlReturnString(b.exp)�)'''
	}
	
	def static dispatch CharSequence getControlReturnString(TouchLiteral a){
		return '''m.�a.touch�Samples[0] > 0''';
	}
	
	def static dispatch CharSequence getControlReturnString(ColorLiteral a){
		return '''m.colorSamples[0] == Color.�a.color�''';
	}
	
	def static dispatch CharSequence getControlReturnString(DistanceLiteral a){
		return '''m.distanceSamples[0] < �a.distance / 100 as float�''';
	}
	
	def static String movementAction2Text(MovementAction m){
		return '''�m.actionenum�();'''
	}
	
	def static dispatch String action2Text(LeftMovementAction a){
		return "m.lm."+movementAction2Text(a.leftmove);
	}
	
	def static dispatch String action2Text(RightMovementAction a){
		return "m.rm."+movementAction2Text(a.rightmove);
	}
	
	def static dispatch String action2Text(RotateMovementAction a){
		return "" /*'''
		m.lm.rotate(�if(a.leftdir==RotateEnum.FORWARD){a.rotateleft}else{-a.rotateleft}�, true);
		m.rm.rotate(�if(a.rightdir==RotateEnum.FORWARD){a.rotateright}else{-a.rotateright}�,true);
		while(m.rm.isMoving() && !suppressed){
			Thread.yield();
		'''*/
	}
	
}