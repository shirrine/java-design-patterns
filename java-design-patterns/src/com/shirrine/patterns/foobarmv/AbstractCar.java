package com.shirrine.patterns.foobarmv;

import com.shirrine.patterns.foobarmv.flyweight.Engine;

public class AbstractCar extends AbstractVehicle{
	
	public AbstractCar(Engine engine){
		super(engine);
	}
	
	public AbstractCar(Engine engine, Vehicle.Color color){
		super(engine, color);
	}

}
