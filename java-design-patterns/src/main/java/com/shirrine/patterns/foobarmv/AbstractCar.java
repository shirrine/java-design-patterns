package com.shirrine.patterns.foobarmv;

import com.shirrine.patterns.foobarmv.flyweight.Engine;

/**
 * An abstract car.
 * 
 * @author Shirrine
 *
 */
public class AbstractCar extends AbstractVehicle {
	
	/**
	 * Creates an abstract car with the specified engine.
	 * 
	 * @param engine the car engine
	 */
	public AbstractCar(Engine engine) {
		super(engine);
	}
	
	/**
	 * Creates an abstract car with the specified engine and color.
	 * 
	 * @param engine the car engine
	 * @param color the car color
	 */
	public AbstractCar(Engine engine, Vehicle.Color color) {
		super(engine, color);
	}

}
