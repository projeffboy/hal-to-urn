/**
 */
package hal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Relational Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hal.AtomicRelationalTerm#getSensor <em>Sensor</em>}</li>
 *   <li>{@link hal.AtomicRelationalTerm#getOperator <em>Operator</em>}</li>
 *   <li>{@link hal.AtomicRelationalTerm#getComparedAgainstValue <em>Compared Against Value</em>}</li>
 * </ul>
 *
 * @see hal.HalPackage#getAtomicRelationalTerm()
 * @model
 * @generated
 */
public interface AtomicRelationalTerm extends BooleanExpression {
	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' reference.
	 * @see #setSensor(Device)
	 * @see hal.HalPackage#getAtomicRelationalTerm_Sensor()
	 * @model required="true"
	 * @generated
	 */
	Device getSensor();

	/**
	 * Sets the value of the '{@link hal.AtomicRelationalTerm#getSensor <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' reference.
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(Device value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link hal.ComparisonOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see hal.ComparisonOperator
	 * @see #setOperator(ComparisonOperator)
	 * @see hal.HalPackage#getAtomicRelationalTerm_Operator()
	 * @model required="true"
	 * @generated
	 */
	ComparisonOperator getOperator();

	/**
	 * Sets the value of the '{@link hal.AtomicRelationalTerm#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see hal.ComparisonOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ComparisonOperator value);

	/**
	 * Returns the value of the '<em><b>Compared Against Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compared Against Value</em>' attribute.
	 * @see #setComparedAgainstValue(String)
	 * @see hal.HalPackage#getAtomicRelationalTerm_ComparedAgainstValue()
	 * @model required="true"
	 * @generated
	 */
	String getComparedAgainstValue();

	/**
	 * Sets the value of the '{@link hal.AtomicRelationalTerm#getComparedAgainstValue <em>Compared Against Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compared Against Value</em>' attribute.
	 * @see #getComparedAgainstValue()
	 * @generated
	 */
	void setComparedAgainstValue(String value);

} // AtomicRelationalTerm
