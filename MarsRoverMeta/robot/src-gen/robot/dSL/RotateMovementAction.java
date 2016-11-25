/**
 * generated by Xtext 2.10.0
 */
package robot.dSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotate Movement Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robot.dSL.RotateMovementAction#getRotateleft <em>Rotateleft</em>}</li>
 *   <li>{@link robot.dSL.RotateMovementAction#getLeftdir <em>Leftdir</em>}</li>
 *   <li>{@link robot.dSL.RotateMovementAction#getRotateright <em>Rotateright</em>}</li>
 *   <li>{@link robot.dSL.RotateMovementAction#getRightdir <em>Rightdir</em>}</li>
 * </ul>
 *
 * @see robot.dSL.DSLPackage#getRotateMovementAction()
 * @model
 * @generated
 */
public interface RotateMovementAction extends Actions
{
  /**
   * Returns the value of the '<em><b>Rotateleft</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rotateleft</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rotateleft</em>' attribute.
   * @see #setRotateleft(int)
   * @see robot.dSL.DSLPackage#getRotateMovementAction_Rotateleft()
   * @model
   * @generated
   */
  int getRotateleft();

  /**
   * Sets the value of the '{@link robot.dSL.RotateMovementAction#getRotateleft <em>Rotateleft</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rotateleft</em>' attribute.
   * @see #getRotateleft()
   * @generated
   */
  void setRotateleft(int value);

  /**
   * Returns the value of the '<em><b>Leftdir</b></em>' attribute.
   * The literals are from the enumeration {@link robot.dSL.RotateEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Leftdir</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Leftdir</em>' attribute.
   * @see robot.dSL.RotateEnum
   * @see #setLeftdir(RotateEnum)
   * @see robot.dSL.DSLPackage#getRotateMovementAction_Leftdir()
   * @model
   * @generated
   */
  RotateEnum getLeftdir();

  /**
   * Sets the value of the '{@link robot.dSL.RotateMovementAction#getLeftdir <em>Leftdir</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Leftdir</em>' attribute.
   * @see robot.dSL.RotateEnum
   * @see #getLeftdir()
   * @generated
   */
  void setLeftdir(RotateEnum value);

  /**
   * Returns the value of the '<em><b>Rotateright</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rotateright</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rotateright</em>' attribute.
   * @see #setRotateright(int)
   * @see robot.dSL.DSLPackage#getRotateMovementAction_Rotateright()
   * @model
   * @generated
   */
  int getRotateright();

  /**
   * Sets the value of the '{@link robot.dSL.RotateMovementAction#getRotateright <em>Rotateright</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rotateright</em>' attribute.
   * @see #getRotateright()
   * @generated
   */
  void setRotateright(int value);

  /**
   * Returns the value of the '<em><b>Rightdir</b></em>' attribute.
   * The literals are from the enumeration {@link robot.dSL.RotateEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rightdir</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rightdir</em>' attribute.
   * @see robot.dSL.RotateEnum
   * @see #setRightdir(RotateEnum)
   * @see robot.dSL.DSLPackage#getRotateMovementAction_Rightdir()
   * @model
   * @generated
   */
  RotateEnum getRightdir();

  /**
   * Sets the value of the '{@link robot.dSL.RotateMovementAction#getRightdir <em>Rightdir</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rightdir</em>' attribute.
   * @see robot.dSL.RotateEnum
   * @see #getRightdir()
   * @generated
   */
  void setRightdir(RotateEnum value);

} // RotateMovementAction
