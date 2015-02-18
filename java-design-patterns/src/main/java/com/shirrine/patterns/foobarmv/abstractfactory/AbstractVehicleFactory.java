package com.shirrine.patterns.foobarmv.abstractfactory;

/**
 * Create vehicles.
 * 
 * @author Shirrine
 *
 */
public abstract class AbstractVehicleFactory {
	
	/**
	 * Creates the vehicle body.
	 * 
	 * @return the body
	 */
	public abstract Body createBody();
	
	/**
	 * Creates the vehicle chassis.
	 * 
	 * @return the chassis
	 */
	public abstract Chassis createChassis();
	
	/**
	 * Creates the vehicle windows.
	 * 
	 * @return the windows
	 */
	public abstract Windows createWindows();

}
