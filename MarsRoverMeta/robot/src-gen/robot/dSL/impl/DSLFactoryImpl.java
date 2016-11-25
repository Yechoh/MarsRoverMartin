/**
 * generated by Xtext 2.10.0
 */
package robot.dSL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import robot.dSL.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DSLFactoryImpl extends EFactoryImpl implements DSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DSLFactory init()
  {
    try
    {
      DSLFactory theDSLFactory = (DSLFactory)EPackage.Registry.INSTANCE.getEFactory(DSLPackage.eNS_URI);
      if (theDSLFactory != null)
      {
        return theDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DSLPackage.ROBOT_BEHAVIOR: return createRobotBehavior();
      case DSLPackage.BEHAVIORS: return createBehaviors();
      case DSLPackage.EXPRESSION: return createExpression();
      case DSLPackage.ACTIONS: return createActions();
      case DSLPackage.LEFT_MOVEMENT_ACTION: return createLeftMovementAction();
      case DSLPackage.RIGHT_MOVEMENT_ACTION: return createRightMovementAction();
      case DSLPackage.ROTATE_MOVEMENT_ACTION: return createRotateMovementAction();
      case DSLPackage.MOVEMENT_ACTION: return createMovementAction();
      case DSLPackage.EXPRESSION_BRACKET: return createExpressionBracket();
      case DSLPackage.TOUCH_LITERAL: return createTouchLiteral();
      case DSLPackage.COLOR_LITERAL: return createColorLiteral();
      case DSLPackage.DISTANCE_LITERAL: return createDistanceLiteral();
      case DSLPackage.AN_DEXPRESSION: return createANDexpression();
      case DSLPackage.OREXPRESSION: return createORexpression();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case DSLPackage.ROTATE_ENUM:
        return createRotateEnumFromString(eDataType, initialValue);
      case DSLPackage.ACTION_ENUM:
        return createActionEnumFromString(eDataType, initialValue);
      case DSLPackage.TOUCH_ENUM:
        return createTouchEnumFromString(eDataType, initialValue);
      case DSLPackage.COLOR_ENUM:
        return createColorEnumFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case DSLPackage.ROTATE_ENUM:
        return convertRotateEnumToString(eDataType, instanceValue);
      case DSLPackage.ACTION_ENUM:
        return convertActionEnumToString(eDataType, instanceValue);
      case DSLPackage.TOUCH_ENUM:
        return convertTouchEnumToString(eDataType, instanceValue);
      case DSLPackage.COLOR_ENUM:
        return convertColorEnumToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RobotBehavior createRobotBehavior()
  {
    RobotBehaviorImpl robotBehavior = new RobotBehaviorImpl();
    return robotBehavior;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Behaviors createBehaviors()
  {
    BehaviorsImpl behaviors = new BehaviorsImpl();
    return behaviors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actions createActions()
  {
    ActionsImpl actions = new ActionsImpl();
    return actions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeftMovementAction createLeftMovementAction()
  {
    LeftMovementActionImpl leftMovementAction = new LeftMovementActionImpl();
    return leftMovementAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RightMovementAction createRightMovementAction()
  {
    RightMovementActionImpl rightMovementAction = new RightMovementActionImpl();
    return rightMovementAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RotateMovementAction createRotateMovementAction()
  {
    RotateMovementActionImpl rotateMovementAction = new RotateMovementActionImpl();
    return rotateMovementAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MovementAction createMovementAction()
  {
    MovementActionImpl movementAction = new MovementActionImpl();
    return movementAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionBracket createExpressionBracket()
  {
    ExpressionBracketImpl expressionBracket = new ExpressionBracketImpl();
    return expressionBracket;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TouchLiteral createTouchLiteral()
  {
    TouchLiteralImpl touchLiteral = new TouchLiteralImpl();
    return touchLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorLiteral createColorLiteral()
  {
    ColorLiteralImpl colorLiteral = new ColorLiteralImpl();
    return colorLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DistanceLiteral createDistanceLiteral()
  {
    DistanceLiteralImpl distanceLiteral = new DistanceLiteralImpl();
    return distanceLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ANDexpression createANDexpression()
  {
    ANDexpressionImpl anDexpression = new ANDexpressionImpl();
    return anDexpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ORexpression createORexpression()
  {
    ORexpressionImpl oRexpression = new ORexpressionImpl();
    return oRexpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RotateEnum createRotateEnumFromString(EDataType eDataType, String initialValue)
  {
    RotateEnum result = RotateEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertRotateEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionEnum createActionEnumFromString(EDataType eDataType, String initialValue)
  {
    ActionEnum result = ActionEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertActionEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TouchEnum createTouchEnumFromString(EDataType eDataType, String initialValue)
  {
    TouchEnum result = TouchEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTouchEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorEnum createColorEnumFromString(EDataType eDataType, String initialValue)
  {
    ColorEnum result = ColorEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertColorEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLPackage getDSLPackage()
  {
    return (DSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DSLPackage getPackage()
  {
    return DSLPackage.eINSTANCE;
  }

} //DSLFactoryImpl
