package com.shirrine.patterns.foobarmv;

import com.shirrine.patterns.foobarmv.flyweight.Engine;

public abstract class AbstractVan extends AbstractVehicle{
	
	public AbstractVan(Engine engine){
		super(engine);
	}
	
	public AbstractVan(Engine engine, Vehicle.Color color){
		super(engine, color);
	}

}