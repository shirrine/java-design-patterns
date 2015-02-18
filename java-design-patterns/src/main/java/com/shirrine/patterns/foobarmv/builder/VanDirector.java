package com.shirrine.patterns.foobarmv.builder;

import com.shirrine.patterns.foobarmv.Vehicle;

/**
 * Director for building vans.
 * 
 * @author Shirrine
 *
 */
public class VanDirector extends VehicleDirector{

	@Override
	public Vehicle build(VehicleBuilder builder){
		
		// How'd this chain sneak in here ;-)
		return builder.buildChassis().buildBody().buildReinforcedStorageArea().buildWindows().getVehicle();
	}

}
