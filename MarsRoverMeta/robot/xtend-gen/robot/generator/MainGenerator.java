package robot.generator;

import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import robot.dSL.Behaviors;
import robot.dSL.RobotBehavior;
import robot.generator.Auxiliary;

@SuppressWarnings("all")
public class MainGenerator {
  public static CharSequence toText(final RobotBehavior root) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package assignment;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import lejos.robotics.subsumption.Arbitrator;");
    _builder.newLine();
    _builder.append("import lejos.robotics.subsumption.Behavior;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class Main {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("\t ");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("Model m = new Model();");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("Behavior [] bArray;");
    _builder.newLine();
    _builder.append("\t ");
    _builder.newLine();
    {
      List<Behaviors> _behaviors = Auxiliary.getBehaviors(root);
      for(final Behaviors b : _behaviors) {
        _builder.append("\t ");
        _builder.append("Behavior ");
        String _name = b.getName();
        _builder.append(_name, "\t ");
        _builder.append(" = new ");
        String _name_1 = b.getName();
        String _class = Auxiliary.toClass(_name_1);
        _builder.append(_class, "\t ");
        _builder.append("(m);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t ");
        _builder.append("bArray.add(");
        String _name_2 = b.getName();
        _builder.append(_name_2, "\t ");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t ");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("Arbitrator arby = new Arbitrator(bArray);");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("arby.go();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
}
