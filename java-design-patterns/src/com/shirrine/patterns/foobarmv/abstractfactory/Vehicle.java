/*
 * This class is for comparison. It does not use the AbstractFactory design pattern.
 */

package com.shirrine.patterns.foobarmv.abstractfactory;

/**
 * Build a vehicle.
 * 
 * @author Shirrine
 *
 */
public abstract class Vehicle {
	
	/**
	 * Creates the vehicle body.
	 * 
	 * @return the body
	 */
	public abstract Body createBody();
	
	/**
	 * Creates the vehicle chasses.
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
