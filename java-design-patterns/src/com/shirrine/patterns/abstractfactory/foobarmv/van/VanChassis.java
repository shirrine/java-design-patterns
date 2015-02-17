package com.shirrine.patterns.abstractfactory.foobarmv.van;

import com.shirrine.patterns.abstractfactory.foobarmv.Chassis;

/**
 * Van implementation of the <code>Chassis</code> interface.
 * 
 * @author Shirrine
 *
 */
public class VanChassis implements Chassis {
	
	/*
	 * (non-Javadoc)
	 * @see patterns.abstractfactory.example1.Chassis#getChassisParts()
	 */
	public String getChassisParts(){
		return "Van chassis parts!";
	}

}
