package com.shirrine.patterns.foobarmv.abstractfactory;

import com.shirrine.patterns.foobarmv.abstractfactory.car.*;
import com.shirrine.patterns.foobarmv.abstractfactory.van.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

/**
 * Build a vehicle.
 * 
 * @author Shirrine
 *
 */
public class AbstractFactoryTest {

	// Constants
	public static final String BAD_PARAMETERS = "Please specify \"car\" or \"van\".";
	
	// Static members
	private static AbstractVehicleFactory factory;

	// Rules
	@Rule public ExpectedException exception = ExpectedException.none();
	
	/**
     * Builds a van.
     */
	@Test public void buildAVan(){
		
		build(new String[]{"Van"});

	}

    /**
     * Builds a car.
     */
	@Test public void buildACar(){
		
		build(new String[]{"Car"});

	}

    /**
     * Builds a car using lowercase letters. Expect failure message.
     */
	@Test public void buildACarLowerCase(){
		
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage(BAD_PARAMETERS);
		build(new String[]{"car"});

	}

	/**
	 * Builds the vehicle indicated by the parameters.
	 * 
	 * @param args either 'Car' or 'Van'
	 */
	private static void build(String[] args){
		
		// Validate parameters
		if(args.length != 1)
			throw new IllegalArgumentException(BAD_PARAMETERS);
		
		// Choose the vehicle
		switch(args[0]){
		case "Car": factory = new CarFactory(); break;
		case "Van": factory = new VanFactory(); break;
		default: throw new IllegalArgumentException(BAD_PARAMETERS);
		}
		
		// Build the vehicle
		Body vehicleBody = factory.createBody();
		Chassis vehicleChassis = factory.createChassis();
		Windows vehicleWindows = factory.createWindows();
		
		// What did we build?
		assertThat(vehicleBody.getBodyParts(), containsString(args[0]));
		assertThat(vehicleChassis.getChassisParts(), containsString(args[0]));
		assertThat(vehicleWindows.getWindowParts(), containsString(args[0]));
			
	}

}
