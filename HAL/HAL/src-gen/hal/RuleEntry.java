/**
 */
package hal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hal.RuleEntry#getAutomationrule <em>Automationrule</em>}</li>
 * </ul>
 *
 * @see hal.HalPackage#getRuleEntry()
 * @model
 * @generated
 */
public interface RuleEntry extends ActivityLogEntry {
	/**
	 * Returns the value of the '<em><b>Automationrule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automationrule</em>' reference.
	 * @see #setAutomationrule(AutomationRule)
	 * @see hal.HalPackage#getRuleEntry_Automationrule()
	 * @model required="true"
	 * @generated
	 */
	AutomationRule getAutomationrule();

	/**
	 * Sets the value of the '{@link hal.RuleEntry#getAutomationrule <em>Automationrule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automationrule</em>' reference.
	 * @see #getAutomationrule()
	 * @generated
	 */
	void setAutomationrule(AutomationRule value);

} // RuleEntry
