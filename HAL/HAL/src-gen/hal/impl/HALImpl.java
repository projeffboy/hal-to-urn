/**
 */
package hal.impl;

import hal.ActivityLogEntry;
import hal.AutomationRule;
import hal.DeviceType;
import hal.HAL;
import hal.HalPackage;
import hal.Room;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HAL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hal.impl.HALImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link hal.impl.HALImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link hal.impl.HALImpl#getRooms <em>Rooms</em>}</li>
 *   <li>{@link hal.impl.HALImpl#getActivityLog <em>Activity Log</em>}</li>
 *   <li>{@link hal.impl.HALImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link hal.impl.HALImpl#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HALImpl extends MinimalEObjectImpl.Container implements HAL {
	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRooms() <em>Rooms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRooms()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> rooms;

	/**
	 * The cached value of the '{@link #getActivityLog() <em>Activity Log</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityLog()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityLogEntry> activityLog;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<AutomationRule> rules;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceType> types;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HALImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.HAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.HAL__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.HAL__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getRooms() {
		if (rooms == null) {
			rooms = new EObjectContainmentEList<Room>(Room.class, this, HalPackage.HAL__ROOMS);
		}
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityLogEntry> getActivityLog() {
		if (activityLog == null) {
			activityLog = new EObjectContainmentEList<ActivityLogEntry>(ActivityLogEntry.class, this,
					HalPackage.HAL__ACTIVITY_LOG);
		}
		return activityLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AutomationRule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<AutomationRule>(AutomationRule.class, this, HalPackage.HAL__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceType> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<DeviceType>(DeviceType.class, this, HalPackage.HAL__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HalPackage.HAL__ROOMS:
			return ((InternalEList<?>) getRooms()).basicRemove(otherEnd, msgs);
		case HalPackage.HAL__ACTIVITY_LOG:
			return ((InternalEList<?>) getActivityLog()).basicRemove(otherEnd, msgs);
		case HalPackage.HAL__RULES:
			return ((InternalEList<?>) getRules()).basicRemove(otherEnd, msgs);
		case HalPackage.HAL__TYPES:
			return ((InternalEList<?>) getTypes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HalPackage.HAL__PASSWORD:
			return getPassword();
		case HalPackage.HAL__ADDRESS:
			return getAddress();
		case HalPackage.HAL__ROOMS:
			return getRooms();
		case HalPackage.HAL__ACTIVITY_LOG:
			return getActivityLog();
		case HalPackage.HAL__RULES:
			return getRules();
		case HalPackage.HAL__TYPES:
			return getTypes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case HalPackage.HAL__PASSWORD:
			setPassword((String) newValue);
			return;
		case HalPackage.HAL__ADDRESS:
			setAddress((String) newValue);
			return;
		case HalPackage.HAL__ROOMS:
			getRooms().clear();
			getRooms().addAll((Collection<? extends Room>) newValue);
			return;
		case HalPackage.HAL__ACTIVITY_LOG:
			getActivityLog().clear();
			getActivityLog().addAll((Collection<? extends ActivityLogEntry>) newValue);
			return;
		case HalPackage.HAL__RULES:
			getRules().clear();
			getRules().addAll((Collection<? extends AutomationRule>) newValue);
			return;
		case HalPackage.HAL__TYPES:
			getTypes().clear();
			getTypes().addAll((Collection<? extends DeviceType>) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case HalPackage.HAL__PASSWORD:
			setPassword(PASSWORD_EDEFAULT);
			return;
		case HalPackage.HAL__ADDRESS:
			setAddress(ADDRESS_EDEFAULT);
			return;
		case HalPackage.HAL__ROOMS:
			getRooms().clear();
			return;
		case HalPackage.HAL__ACTIVITY_LOG:
			getActivityLog().clear();
			return;
		case HalPackage.HAL__RULES:
			getRules().clear();
			return;
		case HalPackage.HAL__TYPES:
			getTypes().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case HalPackage.HAL__PASSWORD:
			return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
		case HalPackage.HAL__ADDRESS:
			return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
		case HalPackage.HAL__ROOMS:
			return rooms != null && !rooms.isEmpty();
		case HalPackage.HAL__ACTIVITY_LOG:
			return activityLog != null && !activityLog.isEmpty();
		case HalPackage.HAL__RULES:
			return rules != null && !rules.isEmpty();
		case HalPackage.HAL__TYPES:
			return types != null && !types.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (password: ");
		result.append(password);
		result.append(", address: ");
		result.append(address);
		result.append(')');
		return result.toString();
	}

} //HALImpl
