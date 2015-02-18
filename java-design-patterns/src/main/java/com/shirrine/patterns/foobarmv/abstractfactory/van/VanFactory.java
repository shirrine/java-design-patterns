package com.shirrine.patterns.foobarmv.abstractfactory.van;

import com.shirrine.patterns.foobarmv.abstractfactory.*;
/**
 * Manufacture a van.
 * 
 * @author Shirrine
 *
 */
public class VanFactory extends AbstractVehicleFactory{
	
	/*
	 * (non-Javadoc)
	 * @see patterns.abstractfactory.foobarmv.AbstractVehicleFactory#createBody()
	 */
	public Body createBody(){
		return new VanBody();
	}
	
	/*
	 * (non-Javadoc)
	 * @see patterns.abstractfactory.foobarmv.AbstractVehicleFactory#createChassis()
	 */
	public Chassis createChassis(){
		return new VanChassis();
	}
	
	/*
	 * (non-Javadoc)
	 * @see patterns.abstractfactory.foobarmv.AbstractVehicleFactory#createWindows()
	 */
	public Windows createWindows(){
		return new VanWindows();
	}

}
