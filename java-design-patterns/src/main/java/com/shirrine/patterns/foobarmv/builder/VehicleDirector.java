/*
 * The Builder pattern.
 */
package com.shirrine.patterns.foobarmv.builder;

import com.shirrine.patterns.foobarmv.*;

/**
 * A director for building a vehicle.
 * 
 * @author Shirrine
 *
 */
public abstract class VehicleDirector {
	
	/**
	 * Build a vehicle.
	 */
	public abstract Vehicle build(VehicleBuilder Builder);

}
