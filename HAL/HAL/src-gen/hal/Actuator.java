/**
 */
package hal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hal.Actuator#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @see hal.HalPackage#getActuator()
 * @model
 * @generated
 */
public interface Actuator extends DeviceType {
	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * The list contents are of type {@link hal.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see hal.HalPackage#getActuator_Commands()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getCommands();

} // Actuator
