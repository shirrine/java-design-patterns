package com.shirrine.patterns.foobarmv.builder;

import com.shirrine.patterns.foobarmv.*;

/**
 * Build operations for various types of vehicles.
 * 
 * @author Shirrine
 *
 */
public abstract class VehicleBuilder {
	
	public VehicleBuilder buildBody(){ 
		// Basic implementation. Subclass can override if needed
		return this; 
	} 
	
	public VehicleBuilder buildBoot(){ 
		// Basic implementation. Subclass can override if needed
		return this; 
	} 
	
	public VehicleBuilder buildChassis(){ 
		// Basic implementation. Subclass can override if needed
		return this; 
	} 
	
	public VehicleBuilder buildPassengerArea(){ 
		// Basic implementation. Subclass can override if needed
		return this; 
	} 
	
	public VehicleBuilder buildReinforcedStorageArea(){ 
		// Basic implementation. Subclass can override if needed
		return this; 
	} 
	
	public VehicleBuilder buildWindows(){ 
		// Basic implementation. Subclass can override if needed
		return this; 
	} 
	
	public abstract Vehicle getVehicle(); // Must be implemented by subclass ;-)

}
