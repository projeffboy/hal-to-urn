/**
 */
package hal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hal.ActuatorEntry#getCommand <em>Command</em>}</li>
 *   <li>{@link hal.ActuatorEntry#getActuator <em>Actuator</em>}</li>
 * </ul>
 *
 * @see hal.HalPackage#getActuatorEntry()
 * @model
 * @generated
 */
public interface ActuatorEntry extends ActivityLogEntry {
	/**
	 * Returns the value of the '<em><b>Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' reference.
	 * @see #setCommand(Command)
	 * @see hal.HalPackage#getActuatorEntry_Command()
	 * @model required="true"
	 * @generated
	 */
	Command getCommand();

	/**
	 * Sets the value of the '{@link hal.ActuatorEntry#getCommand <em>Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' reference.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(Command value);

	/**
	 * Returns the value of the '<em><b>Actuator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuator</em>' reference.
	 * @see #setActuator(Device)
	 * @see hal.HalPackage#getActuatorEntry_Actuator()
	 * @model required="true"
	 * @generated
	 */
	Device getActuator();

	/**
	 * Sets the value of the '{@link hal.ActuatorEntry#getActuator <em>Actuator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuator</em>' reference.
	 * @see #getActuator()
	 * @generated
	 */
	void setActuator(Device value);

} // ActuatorEntry
