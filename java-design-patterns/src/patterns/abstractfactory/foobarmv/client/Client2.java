/*
 * This class is for comparison. It does not use the AbstractFactory design pattern.
 */

package patterns.abstractfactory.foobarmv.client;

import patterns.abstractfactory.foobarmv.*;
import patterns.abstractfactory.foobarmv.car.*;
import patterns.abstractfactory.foobarmv.van.*;

/**
 * Build a vehicle.
 * 
 * @author Shirrine
 *
 */
public class Client2 {
	
	public static final String BAD_PARAMETERS = "Please specify \"car\" or \"van\".";
	
	/**
	 * Builds the vehicle indicated by the parameters.
	 * 
	 * @param args either 'car' or 'van'
	 */
	public static void main(String[] args){
		
		Vehicle vehicle;
		
		// Validate parameters
		if(args.length != 1)
			throw new IllegalArgumentException(BAD_PARAMETERS);
		
		// Choose the vehicle
		switch(args[0]){
		case "car": vehicle = new Car(); break;
		case "van": vehicle = new Van(); break;
		default: throw new IllegalArgumentException(BAD_PARAMETERS);
		}
		
		// Build the vehicle
		Body vehicleBody = vehicle.createBody();
		Chassis vehicleChassis = vehicle.createChassis();
		Windows vehicleWindows = vehicle.createWindows();
		
		// What did we build?
		System.out.println(vehicleBody.getBodyParts());
		System.out.println(vehicleChassis.getChassisParts());
		System.out.println(vehicleWindows.getWindowParts());

	
	}

}
