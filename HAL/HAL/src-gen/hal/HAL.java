/**
 */
package hal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HAL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hal.HAL#getPassword <em>Password</em>}</li>
 *   <li>{@link hal.HAL#getAddress <em>Address</em>}</li>
 *   <li>{@link hal.HAL#getRooms <em>Rooms</em>}</li>
 *   <li>{@link hal.HAL#getActivityLog <em>Activity Log</em>}</li>
 *   <li>{@link hal.HAL#getRules <em>Rules</em>}</li>
 *   <li>{@link hal.HAL#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see hal.HalPackage#getHAL()
 * @model
 * @generated
 */
public interface HAL extends EObject {
	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see hal.HalPackage#getHAL_Password()
	 * @model required="true"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link hal.HAL#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see hal.HalPackage#getHAL_Address()
	 * @model required="true"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link hal.HAL#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' containment reference list.
	 * The list contents are of type {@link hal.Room}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' containment reference list.
	 * @see hal.HalPackage#getHAL_Rooms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Room> getRooms();

	/**
	 * Returns the value of the '<em><b>Activity Log</b></em>' containment reference list.
	 * The list contents are of type {@link hal.ActivityLogEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Log</em>' containment reference list.
	 * @see hal.HalPackage#getHAL_ActivityLog()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityLogEntry> getActivityLog();

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link hal.AutomationRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see hal.HalPackage#getHAL_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<AutomationRule> getRules();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link hal.DeviceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see hal.HalPackage#getHAL_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeviceType> getTypes();

} // HAL
