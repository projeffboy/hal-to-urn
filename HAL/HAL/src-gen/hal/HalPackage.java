/**
 */
package hal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hal.HalFactory
 * @model kind="package"
 * @generated
 */
public interface HalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hal";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/hal";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hal";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HalPackage eINSTANCE = hal.impl.HalPackageImpl.init();

	/**
	 * The meta object id for the '{@link hal.impl.HALImpl <em>HAL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.HALImpl
	 * @see hal.impl.HalPackageImpl#getHAL()
	 * @generated
	 */
	int HAL = 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAL__PASSWORD = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAL__ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAL__ROOMS = 2;

	/**
	 * The feature id for the '<em><b>Activity Log</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAL__ACTIVITY_LOG = 3;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAL__RULES = 4;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAL__TYPES = 5;

	/**
	 * The number of structural features of the '<em>HAL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>HAL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hal.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.NamedElementImpl
	 * @see hal.impl.HalPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hal.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.RoomImpl
	 * @see hal.impl.HalPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__DEVICES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hal.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.DeviceImpl
	 * @see hal.impl.HalPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hal.impl.DeviceTypeImpl <em>Device Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.DeviceTypeImpl
	 * @see hal.impl.HalPackageImpl#getDeviceType()
	 * @generated
	 */
	int DEVICE_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Device Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Device Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hal.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.SensorImpl
	 * @see hal.impl.HalPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = DEVICE_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = DEVICE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = DEVICE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hal.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.ActuatorImpl
	 * @see hal.impl.HalPackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__NAME = DEVICE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__COMMANDS = DEVICE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = DEVICE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = DEVICE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hal.impl.ActivityLogEntryImpl <em>Activity Log Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.ActivityLogEntryImpl
	 * @see hal.impl.HalPackageImpl#getActivityLogEntry()
	 * @generated
	 */
	int ACTIVITY_LOG_ENTRY = 5;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOG_ENTRY__TIME_STAMP = 0;

	/**
	 * The number of structural features of the '<em>Activity Log Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOG_ENTRY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Activity Log Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOG_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hal.impl.SensorEntryImpl <em>Sensor Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.SensorEntryImpl
	 * @see hal.impl.HalPackageImpl#getSensorEntry()
	 * @generated
	 */
	int SENSOR_ENTRY = 6;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_ENTRY__TIME_STAMP = ACTIVITY_LOG_ENTRY__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Reading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_ENTRY__READING = ACTIVITY_LOG_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_ENTRY__SENSOR = ACTIVITY_LOG_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sensor Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_ENTRY_FEATURE_COUNT = ACTIVITY_LOG_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sensor Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_ENTRY_OPERATION_COUNT = ACTIVITY_LOG_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hal.impl.ActuatorEntryImpl <em>Actuator Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.ActuatorEntryImpl
	 * @see hal.impl.HalPackageImpl#getActuatorEntry()
	 * @generated
	 */
	int ACTUATOR_ENTRY = 7;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_ENTRY__TIME_STAMP = ACTIVITY_LOG_ENTRY__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_ENTRY__COMMAND = ACTIVITY_LOG_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actuator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_ENTRY__ACTUATOR = ACTIVITY_LOG_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Actuator Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_ENTRY_FEATURE_COUNT = ACTIVITY_LOG_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Actuator Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_ENTRY_OPERATION_COUNT = ACTIVITY_LOG_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hal.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.CommandImpl
	 * @see hal.impl.HalPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hal.impl.AutomationRuleImpl <em>Automation Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.AutomationRuleImpl
	 * @see hal.impl.HalPackageImpl#getAutomationRule()
	 * @generated
	 */
	int AUTOMATION_RULE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE__PRECONDITION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE__ACTIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE__ACTIVE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Automation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Automation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hal.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.BooleanExpressionImpl
	 * @see hal.impl.HalPackageImpl#getBooleanExpression()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION = 12;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__NEGATED = 0;

	/**
	 * The number of structural features of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hal.impl.AtomicRelationalTermImpl <em>Atomic Relational Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.AtomicRelationalTermImpl
	 * @see hal.impl.HalPackageImpl#getAtomicRelationalTerm()
	 * @generated
	 */
	int ATOMIC_RELATIONAL_TERM = 13;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RELATIONAL_TERM__NEGATED = BOOLEAN_EXPRESSION__NEGATED;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RELATIONAL_TERM__SENSOR = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RELATIONAL_TERM__OPERATOR = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Compared Against Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RELATIONAL_TERM__COMPARED_AGAINST_VALUE = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Atomic Relational Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RELATIONAL_TERM_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Atomic Relational Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RELATIONAL_TERM_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hal.impl.CompoundRelationalTermImpl <em>Compound Relational Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.CompoundRelationalTermImpl
	 * @see hal.impl.HalPackageImpl#getCompoundRelationalTerm()
	 * @generated
	 */
	int COMPOUND_RELATIONAL_TERM = 14;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_RELATIONAL_TERM__NEGATED = BOOLEAN_EXPRESSION__NEGATED;

	/**
	 * The feature id for the '<em><b>LHS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_RELATIONAL_TERM__LHS = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_RELATIONAL_TERM__OPERATOR = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>RHS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_RELATIONAL_TERM__RHS = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Compound Relational Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_RELATIONAL_TERM_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Compound Relational Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_RELATIONAL_TERM_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hal.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.ActionImpl
	 * @see hal.impl.HalPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 15;

	/**
	 * The feature id for the '<em><b>Actuator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTUATOR = 0;

	/**
	 * The feature id for the '<em><b>Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__COMMAND = 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hal.impl.RuleEntryImpl <em>Rule Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.RuleEntryImpl
	 * @see hal.impl.HalPackageImpl#getRuleEntry()
	 * @generated
	 */
	int RULE_ENTRY = 16;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ENTRY__TIME_STAMP = ACTIVITY_LOG_ENTRY__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Automationrule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ENTRY__AUTOMATIONRULE = ACTIVITY_LOG_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rule Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ENTRY_FEATURE_COUNT = ACTIVITY_LOG_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rule Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ENTRY_OPERATION_COUNT = ACTIVITY_LOG_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hal.ComparisonOperator <em>Comparison Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.ComparisonOperator
	 * @see hal.impl.HalPackageImpl#getComparisonOperator()
	 * @generated
	 */
	int COMPARISON_OPERATOR = 17;

	/**
	 * The meta object id for the '{@link hal.BooleanOperator <em>Boolean Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.BooleanOperator
	 * @see hal.impl.HalPackageImpl#getBooleanOperator()
	 * @generated
	 */
	int BOOLEAN_OPERATOR = 18;

	/**
	 * Returns the meta object for class '{@link hal.HAL <em>HAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HAL</em>'.
	 * @see hal.HAL
	 * @generated
	 */
	EClass getHAL();

	/**
	 * Returns the meta object for the attribute '{@link hal.HAL#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see hal.HAL#getPassword()
	 * @see #getHAL()
	 * @generated
	 */
	EAttribute getHAL_Password();

	/**
	 * Returns the meta object for the attribute '{@link hal.HAL#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see hal.HAL#getAddress()
	 * @see #getHAL()
	 * @generated
	 */
	EAttribute getHAL_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link hal.HAL#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rooms</em>'.
	 * @see hal.HAL#getRooms()
	 * @see #getHAL()
	 * @generated
	 */
	EReference getHAL_Rooms();

	/**
	 * Returns the meta object for the containment reference list '{@link hal.HAL#getActivityLog <em>Activity Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity Log</em>'.
	 * @see hal.HAL#getActivityLog()
	 * @see #getHAL()
	 * @generated
	 */
	EReference getHAL_ActivityLog();

	/**
	 * Returns the meta object for the containment reference list '{@link hal.HAL#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see hal.HAL#getRules()
	 * @see #getHAL()
	 * @generated
	 */
	EReference getHAL_Rules();

	/**
	 * Returns the meta object for the containment reference list '{@link hal.HAL#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see hal.HAL#getTypes()
	 * @see #getHAL()
	 * @generated
	 */
	EReference getHAL_Types();

	/**
	 * Returns the meta object for class '{@link hal.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see hal.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the containment reference list '{@link hal.Room#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Devices</em>'.
	 * @see hal.Room#getDevices()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Devices();

	/**
	 * Returns the meta object for class '{@link hal.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see hal.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the reference '{@link hal.Device#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see hal.Device#getType()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Type();

	/**
	 * Returns the meta object for class '{@link hal.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see hal.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for class '{@link hal.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see hal.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for the containment reference list '{@link hal.Actuator#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see hal.Actuator#getCommands()
	 * @see #getActuator()
	 * @generated
	 */
	EReference getActuator_Commands();

	/**
	 * Returns the meta object for class '{@link hal.ActivityLogEntry <em>Activity Log Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Log Entry</em>'.
	 * @see hal.ActivityLogEntry
	 * @generated
	 */
	EClass getActivityLogEntry();

	/**
	 * Returns the meta object for the attribute '{@link hal.ActivityLogEntry#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see hal.ActivityLogEntry#getTimeStamp()
	 * @see #getActivityLogEntry()
	 * @generated
	 */
	EAttribute getActivityLogEntry_TimeStamp();

	/**
	 * Returns the meta object for class '{@link hal.SensorEntry <em>Sensor Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Entry</em>'.
	 * @see hal.SensorEntry
	 * @generated
	 */
	EClass getSensorEntry();

	/**
	 * Returns the meta object for the attribute '{@link hal.SensorEntry#getReading <em>Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reading</em>'.
	 * @see hal.SensorEntry#getReading()
	 * @see #getSensorEntry()
	 * @generated
	 */
	EAttribute getSensorEntry_Reading();

	/**
	 * Returns the meta object for the reference '{@link hal.SensorEntry#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensor</em>'.
	 * @see hal.SensorEntry#getSensor()
	 * @see #getSensorEntry()
	 * @generated
	 */
	EReference getSensorEntry_Sensor();

	/**
	 * Returns the meta object for class '{@link hal.ActuatorEntry <em>Actuator Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator Entry</em>'.
	 * @see hal.ActuatorEntry
	 * @generated
	 */
	EClass getActuatorEntry();

	/**
	 * Returns the meta object for the reference '{@link hal.ActuatorEntry#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Command</em>'.
	 * @see hal.ActuatorEntry#getCommand()
	 * @see #getActuatorEntry()
	 * @generated
	 */
	EReference getActuatorEntry_Command();

	/**
	 * Returns the meta object for the reference '{@link hal.ActuatorEntry#getActuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actuator</em>'.
	 * @see hal.ActuatorEntry#getActuator()
	 * @see #getActuatorEntry()
	 * @generated
	 */
	EReference getActuatorEntry_Actuator();

	/**
	 * Returns the meta object for class '{@link hal.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see hal.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for class '{@link hal.DeviceType <em>Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Type</em>'.
	 * @see hal.DeviceType
	 * @generated
	 */
	EClass getDeviceType();

	/**
	 * Returns the meta object for class '{@link hal.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see hal.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link hal.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hal.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link hal.AutomationRule <em>Automation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Automation Rule</em>'.
	 * @see hal.AutomationRule
	 * @generated
	 */
	EClass getAutomationRule();

	/**
	 * Returns the meta object for the containment reference '{@link hal.AutomationRule#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Precondition</em>'.
	 * @see hal.AutomationRule#getPrecondition()
	 * @see #getAutomationRule()
	 * @generated
	 */
	EReference getAutomationRule_Precondition();

	/**
	 * Returns the meta object for the containment reference list '{@link hal.AutomationRule#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see hal.AutomationRule#getActions()
	 * @see #getAutomationRule()
	 * @generated
	 */
	EReference getAutomationRule_Actions();

	/**
	 * Returns the meta object for the attribute '{@link hal.AutomationRule#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see hal.AutomationRule#isActive()
	 * @see #getAutomationRule()
	 * @generated
	 */
	EAttribute getAutomationRule_Active();

	/**
	 * Returns the meta object for class '{@link hal.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression</em>'.
	 * @see hal.BooleanExpression
	 * @generated
	 */
	EClass getBooleanExpression();

	/**
	 * Returns the meta object for the attribute '{@link hal.BooleanExpression#isNegated <em>Negated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negated</em>'.
	 * @see hal.BooleanExpression#isNegated()
	 * @see #getBooleanExpression()
	 * @generated
	 */
	EAttribute getBooleanExpression_Negated();

	/**
	 * Returns the meta object for class '{@link hal.AtomicRelationalTerm <em>Atomic Relational Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Relational Term</em>'.
	 * @see hal.AtomicRelationalTerm
	 * @generated
	 */
	EClass getAtomicRelationalTerm();

	/**
	 * Returns the meta object for the reference '{@link hal.AtomicRelationalTerm#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensor</em>'.
	 * @see hal.AtomicRelationalTerm#getSensor()
	 * @see #getAtomicRelationalTerm()
	 * @generated
	 */
	EReference getAtomicRelationalTerm_Sensor();

	/**
	 * Returns the meta object for the attribute '{@link hal.AtomicRelationalTerm#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see hal.AtomicRelationalTerm#getOperator()
	 * @see #getAtomicRelationalTerm()
	 * @generated
	 */
	EAttribute getAtomicRelationalTerm_Operator();

	/**
	 * Returns the meta object for the attribute '{@link hal.AtomicRelationalTerm#getComparedAgainstValue <em>Compared Against Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compared Against Value</em>'.
	 * @see hal.AtomicRelationalTerm#getComparedAgainstValue()
	 * @see #getAtomicRelationalTerm()
	 * @generated
	 */
	EAttribute getAtomicRelationalTerm_ComparedAgainstValue();

	/**
	 * Returns the meta object for class '{@link hal.CompoundRelationalTerm <em>Compound Relational Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Relational Term</em>'.
	 * @see hal.CompoundRelationalTerm
	 * @generated
	 */
	EClass getCompoundRelationalTerm();

	/**
	 * Returns the meta object for the containment reference '{@link hal.CompoundRelationalTerm#getLHS <em>LHS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LHS</em>'.
	 * @see hal.CompoundRelationalTerm#getLHS()
	 * @see #getCompoundRelationalTerm()
	 * @generated
	 */
	EReference getCompoundRelationalTerm_LHS();

	/**
	 * Returns the meta object for the attribute '{@link hal.CompoundRelationalTerm#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see hal.CompoundRelationalTerm#getOperator()
	 * @see #getCompoundRelationalTerm()
	 * @generated
	 */
	EAttribute getCompoundRelationalTerm_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link hal.CompoundRelationalTerm#getRHS <em>RHS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>RHS</em>'.
	 * @see hal.CompoundRelationalTerm#getRHS()
	 * @see #getCompoundRelationalTerm()
	 * @generated
	 */
	EReference getCompoundRelationalTerm_RHS();

	/**
	 * Returns the meta object for class '{@link hal.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see hal.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the reference '{@link hal.Action#getActuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actuator</em>'.
	 * @see hal.Action#getActuator()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Actuator();

	/**
	 * Returns the meta object for the reference '{@link hal.Action#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Command</em>'.
	 * @see hal.Action#getCommand()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Command();

	/**
	 * Returns the meta object for class '{@link hal.RuleEntry <em>Rule Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Entry</em>'.
	 * @see hal.RuleEntry
	 * @generated
	 */
	EClass getRuleEntry();

	/**
	 * Returns the meta object for the reference '{@link hal.RuleEntry#getAutomationrule <em>Automationrule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Automationrule</em>'.
	 * @see hal.RuleEntry#getAutomationrule()
	 * @see #getRuleEntry()
	 * @generated
	 */
	EReference getRuleEntry_Automationrule();

	/**
	 * Returns the meta object for enum '{@link hal.ComparisonOperator <em>Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparison Operator</em>'.
	 * @see hal.ComparisonOperator
	 * @generated
	 */
	EEnum getComparisonOperator();

	/**
	 * Returns the meta object for enum '{@link hal.BooleanOperator <em>Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Operator</em>'.
	 * @see hal.BooleanOperator
	 * @generated
	 */
	EEnum getBooleanOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HalFactory getHalFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hal.impl.HALImpl <em>HAL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.HALImpl
		 * @see hal.impl.HalPackageImpl#getHAL()
		 * @generated
		 */
		EClass HAL = eINSTANCE.getHAL();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAL__PASSWORD = eINSTANCE.getHAL_Password();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAL__ADDRESS = eINSTANCE.getHAL_Address();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAL__ROOMS = eINSTANCE.getHAL_Rooms();

		/**
		 * The meta object literal for the '<em><b>Activity Log</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAL__ACTIVITY_LOG = eINSTANCE.getHAL_ActivityLog();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAL__RULES = eINSTANCE.getHAL_Rules();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAL__TYPES = eINSTANCE.getHAL_Types();

		/**
		 * The meta object literal for the '{@link hal.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.RoomImpl
		 * @see hal.impl.HalPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Devices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__DEVICES = eINSTANCE.getRoom_Devices();

		/**
		 * The meta object literal for the '{@link hal.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.DeviceImpl
		 * @see hal.impl.HalPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__TYPE = eINSTANCE.getDevice_Type();

		/**
		 * The meta object literal for the '{@link hal.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.SensorImpl
		 * @see hal.impl.HalPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '{@link hal.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.ActuatorImpl
		 * @see hal.impl.HalPackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR__COMMANDS = eINSTANCE.getActuator_Commands();

		/**
		 * The meta object literal for the '{@link hal.impl.ActivityLogEntryImpl <em>Activity Log Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.ActivityLogEntryImpl
		 * @see hal.impl.HalPackageImpl#getActivityLogEntry()
		 * @generated
		 */
		EClass ACTIVITY_LOG_ENTRY = eINSTANCE.getActivityLogEntry();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_LOG_ENTRY__TIME_STAMP = eINSTANCE.getActivityLogEntry_TimeStamp();

		/**
		 * The meta object literal for the '{@link hal.impl.SensorEntryImpl <em>Sensor Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.SensorEntryImpl
		 * @see hal.impl.HalPackageImpl#getSensorEntry()
		 * @generated
		 */
		EClass SENSOR_ENTRY = eINSTANCE.getSensorEntry();

		/**
		 * The meta object literal for the '<em><b>Reading</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_ENTRY__READING = eINSTANCE.getSensorEntry_Reading();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_ENTRY__SENSOR = eINSTANCE.getSensorEntry_Sensor();

		/**
		 * The meta object literal for the '{@link hal.impl.ActuatorEntryImpl <em>Actuator Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.ActuatorEntryImpl
		 * @see hal.impl.HalPackageImpl#getActuatorEntry()
		 * @generated
		 */
		EClass ACTUATOR_ENTRY = eINSTANCE.getActuatorEntry();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR_ENTRY__COMMAND = eINSTANCE.getActuatorEntry_Command();

		/**
		 * The meta object literal for the '<em><b>Actuator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR_ENTRY__ACTUATOR = eINSTANCE.getActuatorEntry_Actuator();

		/**
		 * The meta object literal for the '{@link hal.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.CommandImpl
		 * @see hal.impl.HalPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '{@link hal.impl.DeviceTypeImpl <em>Device Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.DeviceTypeImpl
		 * @see hal.impl.HalPackageImpl#getDeviceType()
		 * @generated
		 */
		EClass DEVICE_TYPE = eINSTANCE.getDeviceType();

		/**
		 * The meta object literal for the '{@link hal.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.NamedElementImpl
		 * @see hal.impl.HalPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link hal.impl.AutomationRuleImpl <em>Automation Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.AutomationRuleImpl
		 * @see hal.impl.HalPackageImpl#getAutomationRule()
		 * @generated
		 */
		EClass AUTOMATION_RULE = eINSTANCE.getAutomationRule();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATION_RULE__PRECONDITION = eINSTANCE.getAutomationRule_Precondition();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATION_RULE__ACTIONS = eINSTANCE.getAutomationRule_Actions();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMATION_RULE__ACTIVE = eINSTANCE.getAutomationRule_Active();

		/**
		 * The meta object literal for the '{@link hal.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.BooleanExpressionImpl
		 * @see hal.impl.HalPackageImpl#getBooleanExpression()
		 * @generated
		 */
		EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

		/**
		 * The meta object literal for the '<em><b>Negated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_EXPRESSION__NEGATED = eINSTANCE.getBooleanExpression_Negated();

		/**
		 * The meta object literal for the '{@link hal.impl.AtomicRelationalTermImpl <em>Atomic Relational Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.AtomicRelationalTermImpl
		 * @see hal.impl.HalPackageImpl#getAtomicRelationalTerm()
		 * @generated
		 */
		EClass ATOMIC_RELATIONAL_TERM = eINSTANCE.getAtomicRelationalTerm();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_RELATIONAL_TERM__SENSOR = eINSTANCE.getAtomicRelationalTerm_Sensor();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_RELATIONAL_TERM__OPERATOR = eINSTANCE.getAtomicRelationalTerm_Operator();

		/**
		 * The meta object literal for the '<em><b>Compared Against Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_RELATIONAL_TERM__COMPARED_AGAINST_VALUE = eINSTANCE
				.getAtomicRelationalTerm_ComparedAgainstValue();

		/**
		 * The meta object literal for the '{@link hal.impl.CompoundRelationalTermImpl <em>Compound Relational Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.CompoundRelationalTermImpl
		 * @see hal.impl.HalPackageImpl#getCompoundRelationalTerm()
		 * @generated
		 */
		EClass COMPOUND_RELATIONAL_TERM = eINSTANCE.getCompoundRelationalTerm();

		/**
		 * The meta object literal for the '<em><b>LHS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_RELATIONAL_TERM__LHS = eINSTANCE.getCompoundRelationalTerm_LHS();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOUND_RELATIONAL_TERM__OPERATOR = eINSTANCE.getCompoundRelationalTerm_Operator();

		/**
		 * The meta object literal for the '<em><b>RHS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_RELATIONAL_TERM__RHS = eINSTANCE.getCompoundRelationalTerm_RHS();

		/**
		 * The meta object literal for the '{@link hal.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.ActionImpl
		 * @see hal.impl.HalPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Actuator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__ACTUATOR = eINSTANCE.getAction_Actuator();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__COMMAND = eINSTANCE.getAction_Command();

		/**
		 * The meta object literal for the '{@link hal.impl.RuleEntryImpl <em>Rule Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.RuleEntryImpl
		 * @see hal.impl.HalPackageImpl#getRuleEntry()
		 * @generated
		 */
		EClass RULE_ENTRY = eINSTANCE.getRuleEntry();

		/**
		 * The meta object literal for the '<em><b>Automationrule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_ENTRY__AUTOMATIONRULE = eINSTANCE.getRuleEntry_Automationrule();

		/**
		 * The meta object literal for the '{@link hal.ComparisonOperator <em>Comparison Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.ComparisonOperator
		 * @see hal.impl.HalPackageImpl#getComparisonOperator()
		 * @generated
		 */
		EEnum COMPARISON_OPERATOR = eINSTANCE.getComparisonOperator();

		/**
		 * The meta object literal for the '{@link hal.BooleanOperator <em>Boolean Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.BooleanOperator
		 * @see hal.impl.HalPackageImpl#getBooleanOperator()
		 * @generated
		 */
		EEnum BOOLEAN_OPERATOR = eINSTANCE.getBooleanOperator();

	}

} //HalPackage
