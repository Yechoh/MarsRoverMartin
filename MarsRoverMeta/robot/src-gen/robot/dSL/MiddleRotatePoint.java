/**
 * generated by Xtext 2.10.0
 */
package robot.dSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Middle Rotate Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robot.dSL.MiddleRotatePoint#getMiddledir <em>Middledir</em>}</li>
 * </ul>
 *
 * @see robot.dSL.DSLPackage#getMiddleRotatePoint()
 * @model
 * @generated
 */
public interface MiddleRotatePoint extends RotatePoints
{
  /**
   * Returns the value of the '<em><b>Middledir</b></em>' attribute.
   * The literals are from the enumeration {@link robot.dSL.LREnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Middledir</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Middledir</em>' attribute.
   * @see robot.dSL.LREnum
   * @see #setMiddledir(LREnum)
   * @see robot.dSL.DSLPackage#getMiddleRotatePoint_Middledir()
   * @model
   * @generated
   */
  LREnum getMiddledir();

  /**
   * Sets the value of the '{@link robot.dSL.MiddleRotatePoint#getMiddledir <em>Middledir</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Middledir</em>' attribute.
   * @see robot.dSL.LREnum
   * @see #getMiddledir()
   * @generated
   */
  void setMiddledir(LREnum value);

} // MiddleRotatePoint
