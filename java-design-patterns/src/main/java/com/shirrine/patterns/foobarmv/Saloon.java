package com.shirrine.patterns.foobarmv;

import com.shirrine.patterns.foobarmv.flyweight.Engine;

/**
 * A saloon car.
 * 
 * @author Shirrine
 *
 */
public class Saloon extends AbstractCar{
	
	public Saloon(Engine engine){
		super(engine);
	}
	
	public Saloon(Engine engine, Vehicle.Color color){
		super(engine, color);
	}

}
