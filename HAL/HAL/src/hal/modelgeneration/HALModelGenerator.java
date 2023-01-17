package hal.modelgeneration;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;

import hal.Action;
import hal.Actuator;
import hal.AtomicRelationalTerm;
import hal.AutomationRule;
import hal.BooleanExpression;
import hal.BooleanOperator;
import hal.Command;
import hal.ComparisonOperator;
import hal.CompoundRelationalTerm;
import hal.Device;
import hal.HAL;
import hal.HalFactory;
import hal.HalPackage;
import hal.Room;
import hal.Sensor;
import hal.util.HALResourceFactoryImpl;
import hal.util.ResourceHelper;

public class HALModelGenerator {

    public static void main(String[] args) {
        HalPackage.eINSTANCE.eClass();
        
        generateHALModel("examples/assignment2.hal");
    }

	private static void generateHALModel(String filename) {
		HAL hal = HalFactory.eINSTANCE.createHAL();
		hal.setPassword("password");
		hal.setAddress("nowhere");
        
        Room livingRoom = HalFactory.eINSTANCE.createRoom();
        livingRoom.setName("Living Room");
        hal.getRooms().add(livingRoom);
        Room kitchen = HalFactory.eINSTANCE.createRoom();
        kitchen.setName("Kitchen");
        hal.getRooms().add(kitchen);
        
        Sensor temperaturSensor = HalFactory.eINSTANCE.createSensor();
        temperaturSensor.setName("temperature sensor");
        hal.getTypes().add(temperaturSensor);
        Sensor windowSensor = HalFactory.eINSTANCE.createSensor();
        windowSensor.setName("window");
        hal.getTypes().add(windowSensor);
        
        Device tempSensor1L = HalFactory.eINSTANCE.createDevice();
        tempSensor1L.setName("temperature sensor #1");
        tempSensor1L.setType(temperaturSensor);
        livingRoom.getDevices().add(tempSensor1L);
        Device tempSensor2L = HalFactory.eINSTANCE.createDevice();
        tempSensor2L.setName("temperature sensor #2");
        tempSensor2L.setType(temperaturSensor);
        livingRoom.getDevices().add(tempSensor2L);
        Device tempSensor1K = HalFactory.eINSTANCE.createDevice();
        tempSensor1K.setName("temperature sensor #1");
        tempSensor1K.setType(temperaturSensor);
        kitchen.getDevices().add(tempSensor1K);
        Device wSensorL = HalFactory.eINSTANCE.createDevice();
        wSensorL.setName("window");
        wSensorL.setType(windowSensor);
        livingRoom.getDevices().add(wSensorL);
        Device wSensorK = HalFactory.eINSTANCE.createDevice();
        wSensorK.setName("window");
        wSensorK.setType(windowSensor);
        kitchen.getDevices().add(wSensorK);

        Actuator heaterActuator = HalFactory.eINSTANCE.createActuator();
        heaterActuator.setName("heater");
        hal.getTypes().add(heaterActuator);
        Command turnOnHeating = HalFactory.eINSTANCE.createCommand();
        turnOnHeating.setName("turnOnHeating");
        heaterActuator.getCommands().add(turnOnHeating);
        Command turnOffHeating = HalFactory.eINSTANCE.createCommand();
        turnOffHeating.setName("turnOffHeating");
        heaterActuator.getCommands().add(turnOffHeating);
        Actuator windowActuator = HalFactory.eINSTANCE.createActuator();
        windowActuator.setName("window");
        hal.getTypes().add(windowActuator);
        Command open = HalFactory.eINSTANCE.createCommand();
        open.setName("open");
        windowActuator.getCommands().add(open);

        Device heaterL = HalFactory.eINSTANCE.createDevice();
        heaterL.setName("heater");
        heaterL.setType(heaterActuator);
        livingRoom.getDevices().add(heaterL);
        Device heaterK = HalFactory.eINSTANCE.createDevice();
        heaterK.setName("heater");
        heaterK.setType(heaterActuator);
        kitchen.getDevices().add(heaterK);
        Device windowL = HalFactory.eINSTANCE.createDevice();
        windowL.setName("window");
        windowL.setType(windowActuator);
        livingRoom.getDevices().add(windowL);
        Device windowK = HalFactory.eINSTANCE.createDevice();
        windowK.setName("window");
        windowK.setType(windowActuator);
        kitchen.getDevices().add(windowK);
        
        AutomationRule simple = HalFactory.eINSTANCE.createAutomationRule();
        simple.setName("simple");
        AtomicRelationalTerm arS1 = HalFactory.eINSTANCE.createAtomicRelationalTerm();
        arS1.setNegated(false);
        arS1.setOperator(ComparisonOperator.LESSTHAN);
        arS1.setComparedAgainstValue("18");
        arS1.setSensor(tempSensor1L);
        simple.setPrecondition(arS1);
        Action acS1 = HalFactory.eINSTANCE.createAction();
        acS1.setActuator(heaterL);
        acS1.setCommand(turnOnHeating);
        simple.getActions().add(acS1);
        hal.getRules().add(simple);

        AutomationRule compound = HalFactory.eINSTANCE.createAutomationRule();
        compound.setName("compound");
        AtomicRelationalTerm arC1 = HalFactory.eINSTANCE.createAtomicRelationalTerm();
        arC1.setNegated(false);
        arC1.setOperator(ComparisonOperator.LESSTHAN);
        arC1.setComparedAgainstValue("18");
        arC1.setSensor(tempSensor1L);
        AtomicRelationalTerm arC2 = HalFactory.eINSTANCE.createAtomicRelationalTerm();
        arC2.setNegated(false);
        arC2.setOperator(ComparisonOperator.EQUAL);
        arC2.setComparedAgainstValue("closed");
        arC2.setSensor(windowL);
        CompoundRelationalTerm cC1 = HalFactory.eINSTANCE.createCompoundRelationalTerm();
        cC1.setOperator(BooleanOperator.AND);
        cC1.setLHS(arC1);
        cC1.setRHS(arC2);
        compound.setPrecondition(cC1);
        Action acC1 = HalFactory.eINSTANCE.createAction();
        acC1.setActuator(heaterL);
        acC1.setCommand(turnOnHeating);
        compound.getActions().add(acC1);
        hal.getRules().add(compound);

        AutomationRule nested = HalFactory.eINSTANCE.createAutomationRule();
        nested.setName("nested");
        AtomicRelationalTerm arN1 = HalFactory.eINSTANCE.createAtomicRelationalTerm();
        arN1.setNegated(false);
        arN1.setOperator(ComparisonOperator.LESSTHAN);
        arN1.setComparedAgainstValue("18");
        arN1.setSensor(tempSensor1L);
        AtomicRelationalTerm arN2 = HalFactory.eINSTANCE.createAtomicRelationalTerm();
        arN2.setNegated(true);
        arN2.setOperator(ComparisonOperator.GREATERTHANOREQUAL);
        arN2.setComparedAgainstValue("18");
        arN2.setSensor(tempSensor2L);
        CompoundRelationalTerm cN1 = HalFactory.eINSTANCE.createCompoundRelationalTerm();
        cN1.setOperator(BooleanOperator.OR);
        cN1.setLHS(arN1);
        cN1.setRHS(arN2);
        AtomicRelationalTerm arN3 = HalFactory.eINSTANCE.createAtomicRelationalTerm();
        arN3.setNegated(false);
        arN3.setOperator(ComparisonOperator.EQUAL);
        arN3.setComparedAgainstValue("closed");
        arN3.setSensor(windowL);
        CompoundRelationalTerm cN2 = HalFactory.eINSTANCE.createCompoundRelationalTerm();
        cN2.setOperator(BooleanOperator.AND);
        cN2.setLHS(cN1);
        cN2.setRHS(arN3);
        nested.setPrecondition(cN2);
        Action acN1 = HalFactory.eINSTANCE.createAction();
        acN1.setActuator(heaterL);
        acN1.setCommand(turnOnHeating);
        nested.getActions().add(acN1);
        Action acN2 = HalFactory.eINSTANCE.createAction();
        acN2.setActuator(heaterK);
        acN2.setCommand(turnOnHeating);
        nested.getActions().add(acN2);
        hal.getRules().add(nested);

        AutomationRule complex = HalFactory.eINSTANCE.createAutomationRule();
        complex.setName("complex");
        AtomicRelationalTerm arO1 = HalFactory.eINSTANCE.createAtomicRelationalTerm();
        arO1.setNegated(false);
        arO1.setOperator(ComparisonOperator.GREATERTHAN);
        arO1.setComparedAgainstValue("24");
        arO1.setSensor(tempSensor1L);
        AtomicRelationalTerm arO2 = HalFactory.eINSTANCE.createAtomicRelationalTerm();
        arO2.setNegated(false);
        arO2.setOperator(ComparisonOperator.GREATERTHAN);
        arO2.setComparedAgainstValue("24");
        arO2.setSensor(tempSensor1K);
        CompoundRelationalTerm cO1 = HalFactory.eINSTANCE.createCompoundRelationalTerm();
        cO1.setOperator(BooleanOperator.AND);
        cO1.setLHS(arO1);
        cO1.setRHS(arO2);
        AtomicRelationalTerm arO3 = HalFactory.eINSTANCE.createAtomicRelationalTerm();
        arO3.setNegated(false);
        arO3.setOperator(ComparisonOperator.GREATERTHAN);
        arO3.setComparedAgainstValue("26");
        arO3.setSensor(tempSensor1L);
        CompoundRelationalTerm cO2 = HalFactory.eINSTANCE.createCompoundRelationalTerm();
        cO2.setOperator(BooleanOperator.OR);
        cO2.setLHS(cO1);
        cO2.setRHS(arO3);
        AtomicRelationalTerm arO4 = HalFactory.eINSTANCE.createAtomicRelationalTerm();
        arO4.setNegated(false);
        arO4.setOperator(ComparisonOperator.GREATERTHAN);
        arO4.setComparedAgainstValue("26");
        arO4.setSensor(tempSensor1K);
        CompoundRelationalTerm cO3 = HalFactory.eINSTANCE.createCompoundRelationalTerm();
        cO3.setOperator(BooleanOperator.OR);
        cO3.setLHS(cO2);
        cO3.setRHS(arO4);
        AtomicRelationalTerm arO5 = HalFactory.eINSTANCE.createAtomicRelationalTerm();
        arO5.setNegated(false);
        arO5.setOperator(ComparisonOperator.EQUAL);
        arO5.setComparedAgainstValue("closed");
        arO5.setSensor(windowL);
        AtomicRelationalTerm arO6 = HalFactory.eINSTANCE.createAtomicRelationalTerm();
        arO6.setNegated(false);
        arO6.setOperator(ComparisonOperator.EQUAL);
        arO6.setComparedAgainstValue("closed");
        arO6.setSensor(windowK);
        CompoundRelationalTerm cO4 = HalFactory.eINSTANCE.createCompoundRelationalTerm();
        cO4.setOperator(BooleanOperator.OR);
        cO4.setLHS(arO5);
        cO4.setRHS(arO6);
        CompoundRelationalTerm cO5 = HalFactory.eINSTANCE.createCompoundRelationalTerm();
        cO5.setOperator(BooleanOperator.AND);
        cO5.setLHS(cO3);
        cO5.setRHS(cO4);
        complex.setPrecondition(cO5);
        Action acO1 = HalFactory.eINSTANCE.createAction();
        acO1.setActuator(heaterL);
        acO1.setCommand(turnOffHeating);
        complex.getActions().add(acO1);
        Action acO2 = HalFactory.eINSTANCE.createAction();
        acO2.setActuator(windowL);
        acO2.setCommand(open);
        complex.getActions().add(acO2);
        Action acO3 = HalFactory.eINSTANCE.createAction();
        acO3.setActuator(heaterK);
        acO3.setCommand(turnOffHeating);
        complex.getActions().add(acO3);
        Action acO4 = HalFactory.eINSTANCE.createAction();
        acO4.setActuator(windowK);
        acO4.setCommand(open);
        complex.getActions().add(acO4);
        hal.getRules().add(complex);

        saveModel(filename, hal);
	}
	
	private static void saveModel(String filename, HAL hal) {
		/**
         * Save the model.
         */
        ResourceHelper.INSTANCE.addResourceFactory("hal", new HALResourceFactoryImpl());
        ResourceHelper.INSTANCE.saveResource(hal, filename);
        Resource resource = ResourceHelper.INSTANCE.loadResource(filename);
        
        /**
         * Get the root object.
         */
        HAL savedHAL = (HAL) resource.getContents().get(0);
        
        /**
         * Print the automation rules.
         */
        printAutomationRules(savedHAL.getRules());
	}

	private static void printAutomationRules(EList<AutomationRule> rules) {
		for (AutomationRule ar : rules) {
			System.out.println(ar.getName());
			String precondition = "WHEN " + convertToString(ar.getPrecondition());
			if (precondition.endsWith("\n")) {
				precondition = precondition.substring(0, precondition.length() - 1);
			}
			System.out.println(precondition);
			String actions = "THEN ";
			for (Action a : ar.getActions()) {
				actions = actions + a.getActuator().getName() + "." + a.getCommand().getName() + 
						" IN " + ((Room) a.getActuator().eContainer()).getName() + ",\n     ";
			}
			if (actions.endsWith(",\n     ")) {
				actions = actions.substring(0, actions.length() - 7);
			}
			System.out.println(actions + "\n");
		}
		
	}

	private static String convertToString(BooleanExpression be) {
		String result = "";
		if (be instanceof AtomicRelationalTerm art) {
			if (art.isNegated()) {
				result = "NOT (";
			}
			result = result + art.getSensor().getName() + " IN " + ((Room) art.getSensor().eContainer()).getName() + 
					" " + convertToString(art.getOperator()) + " " + art.getComparedAgainstValue();
			if (art.isNegated()) {
				result = result + ")";
			}

		} else if (be instanceof CompoundRelationalTerm crt) {
			result = "(" + convertToString(crt.getLHS());
			if (crt.getOperator() == BooleanOperator.AND) {
				result = result + "\n     AND ";
			} else {
				result = result + "\n     OR ";				
			}
			result = result + convertToString(crt.getRHS()) + ")";
		}
		return result;
	}

	@SuppressWarnings("incomplete-switch")
	private static String convertToString(ComparisonOperator operator) {
		String converted = "=";
		switch (operator) {
			case GREATERTHAN:
				converted = ">";
				break;
			case GREATERTHANOREQUAL:
				converted = ">=";
				break;
			case LESSTHAN:
				converted = "<";
				break;
			case LESSTHANOREQUAL:
				converted = "=<";
				break;
			case NOTEQUAL:
				converted = "!=";
				break;
		}
		return converted;
	}
    
}
