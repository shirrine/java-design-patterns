package com.shirrine.patterns.abstractfactory.foobarmv.car;

import com.shirrine.patterns.abstractfactory.foobarmv.*;

/**
 * Manufacture a car.
 * 
 * @author Shirrine
 *
 */
public class CarFactory extends AbstractVehicleFactory{
	
	/*
	 * (non-Javadoc)
	 * @see patterns.abstractfactory.foobarmv.AbstractVehicleFactory#createBody()
	 */
	public Body createBody(){
		return new CarBody();
	}
	
	/*
	 * (non-Javadoc)
	 * @see patterns.abstractfactory.foobarmv.AbstractVehicleFactory#createChassis()
	 */
	public Chassis createChassis(){
		return new CarChassis();
	}
	
	/*
	 * (non-Javadoc)
	 * @see patterns.abstractfactory.foobarmv.AbstractVehicleFactory#createWindows()
	 */
	public Windows createWindows(){
		return new CarWindows();
	}

}
