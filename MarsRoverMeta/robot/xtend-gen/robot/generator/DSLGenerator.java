/**
 * generated by Xtext 2.10.0
 */
package robot.generator;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import robot.dSL.Behaviors;
import robot.dSL.RobotBehavior;
import robot.generator.Auxiliary;
import robot.generator.BehaviorGenerator;
import robot.generator.MainGenerator;
import robot.generator.ModelGenerator;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class DSLGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    EObject _head = IteratorExtensions.<EObject>head(_allContents);
    final RobotBehavior root = ((RobotBehavior) _head);
    boolean _notEquals = (!Objects.equal(root, null));
    if (_notEquals) {
      CharSequence _text = MainGenerator.toText(root);
      fsa.generateFile("Main.java", _text);
      CharSequence _text_1 = ModelGenerator.toText(root);
      fsa.generateFile("Model.java", _text_1);
      List<Behaviors> b = new ArrayList<Behaviors>();
      List<Behaviors> _behaviors = Auxiliary.getBehaviors(root);
      b = _behaviors;
      for (final Behaviors i : b) {
        String _name = i.getName();
        String _class = Auxiliary.toClass(_name);
        String _plus = (_class + ".java");
        CharSequence _text_2 = BehaviorGenerator.toText(i);
        fsa.generateFile(_plus, _text_2);
      }
    }
  }
}
