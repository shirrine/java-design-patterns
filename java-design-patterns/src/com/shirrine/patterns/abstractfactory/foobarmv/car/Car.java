/*
 * This class is for comparison. It does not use the AbstractFactory design pattern.
 */

package com.shirrine.patterns.abstractfactory.foobarmv.car;

import com.shirrine.patterns.abstractfactory.foobarmv.*;

/**
 * Build a car.
 * 
 * @author Shirrine
 *
 */
public class Car extends Vehicle{
	
	/*
	 * (non-Javadoc)
	 * @see patterns.abstractfactory.foobarmv.Vehicle#createBody()
	 */
	public Body createBody(){
		return new CarBody();
	}
	
	/*
	 * (non-Javadoc)
	 * @see patterns.abstractfactory.foobarmv.Vehicle#createChassis()
	 */
	public Chassis createChassis(){
		return new CarChassis();
	}
	
	/*
	 * (non-Javadoc)
	 * @see patterns.abstractfactory.foobarmv.Vehicle#createWindows()
	 */
	public Windows createWindows(){
		return new CarWindows();
	}

}
