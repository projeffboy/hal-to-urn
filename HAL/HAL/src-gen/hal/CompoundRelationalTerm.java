/**
 */
package hal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compound Relational Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hal.CompoundRelationalTerm#getLHS <em>LHS</em>}</li>
 *   <li>{@link hal.CompoundRelationalTerm#getOperator <em>Operator</em>}</li>
 *   <li>{@link hal.CompoundRelationalTerm#getRHS <em>RHS</em>}</li>
 * </ul>
 *
 * @see hal.HalPackage#getCompoundRelationalTerm()
 * @model
 * @generated
 */
public interface CompoundRelationalTerm extends BooleanExpression {
	/**
	 * Returns the value of the '<em><b>LHS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LHS</em>' containment reference.
	 * @see #setLHS(BooleanExpression)
	 * @see hal.HalPackage#getCompoundRelationalTerm_LHS()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BooleanExpression getLHS();

	/**
	 * Sets the value of the '{@link hal.CompoundRelationalTerm#getLHS <em>LHS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LHS</em>' containment reference.
	 * @see #getLHS()
	 * @generated
	 */
	void setLHS(BooleanExpression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link hal.BooleanOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see hal.BooleanOperator
	 * @see #setOperator(BooleanOperator)
	 * @see hal.HalPackage#getCompoundRelationalTerm_Operator()
	 * @model required="true"
	 * @generated
	 */
	BooleanOperator getOperator();

	/**
	 * Sets the value of the '{@link hal.CompoundRelationalTerm#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see hal.BooleanOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BooleanOperator value);

	/**
	 * Returns the value of the '<em><b>RHS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RHS</em>' containment reference.
	 * @see #setRHS(BooleanExpression)
	 * @see hal.HalPackage#getCompoundRelationalTerm_RHS()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BooleanExpression getRHS();

	/**
	 * Sets the value of the '{@link hal.CompoundRelationalTerm#getRHS <em>RHS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RHS</em>' containment reference.
	 * @see #getRHS()
	 * @generated
	 */
	void setRHS(BooleanExpression value);

} // CompoundRelationalTerm
