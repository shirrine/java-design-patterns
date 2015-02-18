package com.shirrine.patterns.foobarmv.builder;

import com.shirrine.patterns.foobarmv.*;

/**
 * Director for building cars.
 * 
 * @author Shirrine
 *
 */
public class CarDirector extends VehicleDirector{

	@Override
	public Vehicle build(VehicleBuilder builder){
		
		// So... Maybe this chaining is a bit overkill! But still kinda cool :-D
		return builder.buildChassis().buildBody().buildPassengerArea().buildBoot().buildWindows().getVehicle();
	}
}
