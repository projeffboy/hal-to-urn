/**
 */
package hal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hal.Device#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see hal.HalPackage#getDevice()
 * @model
 * @generated
 */
public interface Device extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DeviceType)
	 * @see hal.HalPackage#getDevice_Type()
	 * @model required="true"
	 * @generated
	 */
	DeviceType getType();

	/**
	 * Sets the value of the '{@link hal.Device#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DeviceType value);

} // Device
