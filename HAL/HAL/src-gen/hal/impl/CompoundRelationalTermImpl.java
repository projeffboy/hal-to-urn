/**
 */
package hal.impl;

import hal.BooleanExpression;
import hal.BooleanOperator;
import hal.CompoundRelationalTerm;
import hal.HalPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compound Relational Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hal.impl.CompoundRelationalTermImpl#getLHS <em>LHS</em>}</li>
 *   <li>{@link hal.impl.CompoundRelationalTermImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link hal.impl.CompoundRelationalTermImpl#getRHS <em>RHS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompoundRelationalTermImpl extends BooleanExpressionImpl implements CompoundRelationalTerm {
	/**
	 * The cached value of the '{@link #getLHS() <em>LHS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLHS()
	 * @generated
	 * @ordered
	 */
	protected BooleanExpression lhs;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final BooleanOperator OPERATOR_EDEFAULT = BooleanOperator.AND;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected BooleanOperator operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRHS() <em>RHS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRHS()
	 * @generated
	 * @ordered
	 */
	protected BooleanExpression rhs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompoundRelationalTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.COMPOUND_RELATIONAL_TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpression getLHS() {
		return lhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLHS(BooleanExpression newLHS, NotificationChain msgs) {
		BooleanExpression oldLHS = lhs;
		lhs = newLHS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					HalPackage.COMPOUND_RELATIONAL_TERM__LHS, oldLHS, newLHS);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLHS(BooleanExpression newLHS) {
		if (newLHS != lhs) {
			NotificationChain msgs = null;
			if (lhs != null)
				msgs = ((InternalEObject) lhs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - HalPackage.COMPOUND_RELATIONAL_TERM__LHS, null, msgs);
			if (newLHS != null)
				msgs = ((InternalEObject) newLHS).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - HalPackage.COMPOUND_RELATIONAL_TERM__LHS, null, msgs);
			msgs = basicSetLHS(newLHS, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.COMPOUND_RELATIONAL_TERM__LHS, newLHS,
					newLHS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(BooleanOperator newOperator) {
		BooleanOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.COMPOUND_RELATIONAL_TERM__OPERATOR,
					oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpression getRHS() {
		return rhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRHS(BooleanExpression newRHS, NotificationChain msgs) {
		BooleanExpression oldRHS = rhs;
		rhs = newRHS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					HalPackage.COMPOUND_RELATIONAL_TERM__RHS, oldRHS, newRHS);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRHS(BooleanExpression newRHS) {
		if (newRHS != rhs) {
			NotificationChain msgs = null;
			if (rhs != null)
				msgs = ((InternalEObject) rhs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - HalPackage.COMPOUND_RELATIONAL_TERM__RHS, null, msgs);
			if (newRHS != null)
				msgs = ((InternalEObject) newRHS).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - HalPackage.COMPOUND_RELATIONAL_TERM__RHS, null, msgs);
			msgs = basicSetRHS(newRHS, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.COMPOUND_RELATIONAL_TERM__RHS, newRHS,
					newRHS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HalPackage.COMPOUND_RELATIONAL_TERM__LHS:
			return basicSetLHS(null, msgs);
		case HalPackage.COMPOUND_RELATIONAL_TERM__RHS:
			return basicSetRHS(null, msgs);
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
		case HalPackage.COMPOUND_RELATIONAL_TERM__LHS:
			return getLHS();
		case HalPackage.COMPOUND_RELATIONAL_TERM__OPERATOR:
			return getOperator();
		case HalPackage.COMPOUND_RELATIONAL_TERM__RHS:
			return getRHS();
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
		case HalPackage.COMPOUND_RELATIONAL_TERM__LHS:
			setLHS((BooleanExpression) newValue);
			return;
		case HalPackage.COMPOUND_RELATIONAL_TERM__OPERATOR:
			setOperator((BooleanOperator) newValue);
			return;
		case HalPackage.COMPOUND_RELATIONAL_TERM__RHS:
			setRHS((BooleanExpression) newValue);
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
		case HalPackage.COMPOUND_RELATIONAL_TERM__LHS:
			setLHS((BooleanExpression) null);
			return;
		case HalPackage.COMPOUND_RELATIONAL_TERM__OPERATOR:
			setOperator(OPERATOR_EDEFAULT);
			return;
		case HalPackage.COMPOUND_RELATIONAL_TERM__RHS:
			setRHS((BooleanExpression) null);
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
		case HalPackage.COMPOUND_RELATIONAL_TERM__LHS:
			return lhs != null;
		case HalPackage.COMPOUND_RELATIONAL_TERM__OPERATOR:
			return operator != OPERATOR_EDEFAULT;
		case HalPackage.COMPOUND_RELATIONAL_TERM__RHS:
			return rhs != null;
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //CompoundRelationalTermImpl