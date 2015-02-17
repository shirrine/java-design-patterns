package com.shirrine.patterns.abstractfactory.foobarmv.client;

import com.shirrine.patterns.abstractfactory.foobarmv.*;
import com.shirrine.patterns.abstractfactory.foobarmv.car.*;
import com.shirrine.patterns.abstractfactory.foobarmv.van.*;

/**
 * Build a vehicle.
 * 
 * @author Shirrine
 *
 */
public class Client {
	
	public static final String BAD_PARAMETERS = "Please specify \"car\" or \"van\".";
	
	/**
	 * Builds the vehicle indicated by the parameters.
	 * 
	 * @param args either 'car' or 'van'
	 */
	public static void main(String[] args){
		
		AbstractVehicleFactory factory;
		
		// Validate parameters
		if(args.length != 1)
			throw new IllegalArgumentException(BAD_PARAMETERS);
		
		// Choose the vehicle
		switch(args[0]){
		case "car": factory = new CarFactory(); break;
		case "van": factory = new VanFactory(); break;
		default: throw new IllegalArgumentException(BAD_PARAMETERS);
		}
		
		// Build the vehicle
		Body vehicleBody = factory.createBody();
		Chassis vehicleChassis = factory.createChassis();
		Windows vehicleWindows = factory.createWindows();
		
		// What did we build?
		System.out.println(vehicleBody.getBodyParts());
		System.out.println(vehicleChassis.getChassisParts());
		System.out.println(vehicleWindows.getWindowParts());
			
	}

}
