/**
 * generated by Xtext 2.10.0
 */
package robot.dSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import robot.dSL.DSLPackage;
import robot.dSL.EdgeEnum;
import robot.dSL.EdgeLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robot.dSL.impl.EdgeLiteralImpl#getEdge <em>Edge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeLiteralImpl extends ExpressionImpl implements EdgeLiteral
{
  /**
   * The default value of the '{@link #getEdge() <em>Edge</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEdge()
   * @generated
   * @ordered
   */
  protected static final EdgeEnum EDGE_EDEFAULT = EdgeEnum.FRONTLEFT;

  /**
   * The cached value of the '{@link #getEdge() <em>Edge</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEdge()
   * @generated
   * @ordered
   */
  protected EdgeEnum edge = EDGE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EdgeLiteralImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DSLPackage.Literals.EDGE_LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EdgeEnum getEdge()
  {
    return edge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEdge(EdgeEnum newEdge)
  {
    EdgeEnum oldEdge = edge;
    edge = newEdge == null ? EDGE_EDEFAULT : newEdge;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.EDGE_LITERAL__EDGE, oldEdge, edge));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DSLPackage.EDGE_LITERAL__EDGE:
        return getEdge();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DSLPackage.EDGE_LITERAL__EDGE:
        setEdge((EdgeEnum)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DSLPackage.EDGE_LITERAL__EDGE:
        setEdge(EDGE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DSLPackage.EDGE_LITERAL__EDGE:
        return edge != EDGE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (edge: ");
    result.append(edge);
    result.append(')');
    return result.toString();
  }

} //EdgeLiteralImpl
