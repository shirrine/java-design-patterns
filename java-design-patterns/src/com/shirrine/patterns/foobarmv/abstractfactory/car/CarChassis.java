package com.shirrine.patterns.foobarmv.abstractfactory.car;

import com.shirrine.patterns.foobarmv.abstractfactory.Chassis;

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
