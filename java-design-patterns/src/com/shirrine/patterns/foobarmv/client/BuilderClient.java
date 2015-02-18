package com.shirrine.patterns.foobarmv.client;

import com.shirrine.patterns.foobarmv.*;
import com.shirrine.patterns.foobarmv.builder.*;
import com.shirrine.patterns.foobarmv.flyweight.*;

/**
 * Client that builds a saloon car.
 * 
 * @author Shirrine
 *
 */
public class BuilderClient {

	/**
	 * Builds a saloon car.
	 * 
	 * @param args unused
	 */
	public static void main(String[] args){
		
		// Use my engine flyweight ;-)
		EngineFlyweightFactory engineFactory = new EngineFlyweightFactory();
		AbstractCar car = new Saloon(engineFactory.getStandardEngine(1300));
		
		// Build a car
		VehicleBuilder builder = new CarBuilder(car);
		VehicleDirector director = new CarDirector();
		Vehicle vehicle = director.build(builder);
		System.out.println(vehicle);
		
		// Build Car 2
		AbstractCar car2 = new Saloon(engineFactory.getStandardEngine(1300));
		VehicleBuilder builder2 = new CarBuilder(car2);
		VehicleDirector director2 = new CarDirector();
		Vehicle vehicle2 = director2.build(builder2);
		System.out.println(vehicle2);
		
		// Check engine flyweight
		System.out.println(vehicle.getEngine().equals(vehicle2.getEngine()));
	}
	
}
