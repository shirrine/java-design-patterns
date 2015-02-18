package com.shirrine.patterns.foobarmv.builder;

import com.shirrine.patterns.foobarmv.*;
import com.shirrine.patterns.foobarmv.flyweight.*;

import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

/**
 * Client that builds a saloon car.
 * 
 * @author Shirrine
 *
 */
public class BuilderTest {
	
	private static EngineFlyweightFactory engineFactory = new EngineFlyweightFactory();
	private static VehicleDirector director = new CarDirector();
	private static VehicleBuilder builder;
	private static AbstractCar car;
	
	@BeforeClass public static void setup(){
		engineFactory = new EngineFlyweightFactory();
		director = new CarDirector();
	}
	
	@Test public void testBuilder(){
		
		// Build a car
		car = new Saloon(engineFactory.getStandardEngine(1300));
		builder = new CarBuilder(car);
		Vehicle vehicle = director.build(builder);
		assertNotNull(vehicle);
	}
	
	@Test public void testFlyweight(){
		
		// Build Car 1
		car = new Saloon(engineFactory.getStandardEngine(1300));
		builder = new CarBuilder(car);
		Vehicle vehicle = director.build(builder);
		System.out.println(vehicle);
		
		// Build Car 2
		AbstractCar car2 = new Saloon(engineFactory.getStandardEngine(1300));
		builder = new CarBuilder(car2);
		Vehicle vehicle2 = director.build(builder);
		System.out.println(vehicle2);
		
		// Same engine due to flyweight pattern :-D
		assertThat(vehicle.getEngine(), equalTo(vehicle2.getEngine()));
		
	}
	
}
