/**
 */
package hal;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Log Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hal.ActivityLogEntry#getTimeStamp <em>Time Stamp</em>}</li>
 * </ul>
 *
 * @see hal.HalPackage#getActivityLogEntry()
 * @model abstract="true"
 * @generated
 */
public interface ActivityLogEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' attribute.
	 * @see #setTimeStamp(Date)
	 * @see hal.HalPackage#getActivityLogEntry_TimeStamp()
	 * @model required="true"
	 * @generated
	 */
	Date getTimeStamp();

	/**
	 * Sets the value of the '{@link hal.ActivityLogEntry#getTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' attribute.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(Date value);

} // ActivityLogEntry
