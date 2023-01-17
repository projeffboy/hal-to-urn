/**
 */
package hal.impl;

import hal.AutomationRule;
import hal.HalPackage;
import hal.RuleEntry;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hal.impl.RuleEntryImpl#getAutomationrule <em>Automationrule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleEntryImpl extends ActivityLogEntryImpl implements RuleEntry {
	/**
	 * The cached value of the '{@link #getAutomationrule() <em>Automationrule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomationrule()
	 * @generated
	 * @ordered
	 */
	protected AutomationRule automationrule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.RULE_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutomationRule getAutomationrule() {
		if (automationrule != null && automationrule.eIsProxy()) {
			InternalEObject oldAutomationrule = (InternalEObject) automationrule;
			automationrule = (AutomationRule) eResolveProxy(oldAutomationrule);
			if (automationrule != oldAutomationrule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HalPackage.RULE_ENTRY__AUTOMATIONRULE,
							oldAutomationrule, automationrule));
			}
		}
		return automationrule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutomationRule basicGetAutomationrule() {
		return automationrule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutomationrule(AutomationRule newAutomationrule) {
		AutomationRule oldAutomationrule = automationrule;
		automationrule = newAutomationrule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.RULE_ENTRY__AUTOMATIONRULE,
					oldAutomationrule, automationrule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HalPackage.RULE_ENTRY__AUTOMATIONRULE:
			if (resolve)
				return getAutomationrule();
			return basicGetAutomationrule();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case HalPackage.RULE_ENTRY__AUTOMATIONRULE:
			setAutomationrule((AutomationRule) newValue);
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
		case HalPackage.RULE_ENTRY__AUTOMATIONRULE:
			setAutomationrule((AutomationRule) null);
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
		case HalPackage.RULE_ENTRY__AUTOMATIONRULE:
			return automationrule != null;
		}
		return super.eIsSet(featureID);
	}

} //RuleEntryImpl
