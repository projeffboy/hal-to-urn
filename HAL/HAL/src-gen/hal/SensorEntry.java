/**
 */
package hal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hal.SensorEntry#getReading <em>Reading</em>}</li>
 *   <li>{@link hal.SensorEntry#getSensor <em>Sensor</em>}</li>
 * </ul>
 *
 * @see hal.HalPackage#getSensorEntry()
 * @model
 * @generated
 */
public interface SensorEntry extends ActivityLogEntry {
	/**
	 * Returns the value of the '<em><b>Reading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reading</em>' attribute.
	 * @see #setReading(String)
	 * @see hal.HalPackage#getSensorEntry_Reading()
	 * @model required="true"
	 * @generated
	 */
	String getReading();

	/**
	 * Sets the value of the '{@link hal.SensorEntry#getReading <em>Reading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reading</em>' attribute.
	 * @see #getReading()
	 * @generated
	 */
	void setReading(String value);

	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' reference.
	 * @see #setSensor(Device)
	 * @see hal.HalPackage#getSensorEntry_Sensor()
	 * @model required="true"
	 * @generated
	 */
	Device getSensor();

	/**
	 * Sets the value of the '{@link hal.SensorEntry#getSensor <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' reference.
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(Device value);

} // SensorEntry
