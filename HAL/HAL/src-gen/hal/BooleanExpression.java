/**
 */
package hal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hal.BooleanExpression#isNegated <em>Negated</em>}</li>
 * </ul>
 *
 * @see hal.HalPackage#getBooleanExpression()
 * @model abstract="true"
 * @generated
 */
public interface BooleanExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negated</em>' attribute.
	 * @see #setNegated(boolean)
	 * @see hal.HalPackage#getBooleanExpression_Negated()
	 * @model required="true"
	 * @generated
	 */
	boolean isNegated();

	/**
	 * Sets the value of the '{@link hal.BooleanExpression#isNegated <em>Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negated</em>' attribute.
	 * @see #isNegated()
	 * @generated
	 */
	void setNegated(boolean value);

} // BooleanExpression
