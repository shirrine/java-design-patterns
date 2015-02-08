package patterns.abstractfactory.foobarmv.car;

import patterns.abstractfactory.foobarmv.Chassis;

/**
 * Car implementation of the <code>Chassis</code> interface.
 * 
 * @author Shirrine
 *
 */
public class CarChassis implements Chassis{
	
	/*
	 * (non-Javadoc)
	 * @see patterns.abstractfactory.example1.Chassis#getChassisParts()
	 */
	public String getChassisParts(){
		return "Car chassis parts!";
	}

}
