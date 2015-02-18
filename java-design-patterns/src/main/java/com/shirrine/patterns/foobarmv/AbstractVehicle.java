package com.shirrine.patterns.foobarmv;

import com.shirrine.patterns.foobarmv.flyweight.Engine;

public abstract class AbstractVehicle implements Vehicle{

	private Engine engine;
	private Vehicle.Color color;
	
	public AbstractVehicle(Engine engine){
		this(engine, Vehicle.Color.UNPAINTED);
	}
	
	public AbstractVehicle(Engine engine, Vehicle.Color color){
		this.engine = engine;
		this.color = color;
	}
	
	@Override
	public Engine getEngine(){
		return this.engine;
	}
	
	@Override
	public Vehicle.Color getColor(){
		return this.color;
	}
	
	@Override
	public void paint(Vehicle.Color color){
		this.color = color;
	}
	
	@Override
	public String toString(){
		return getClass().getSimpleName() + " (" + engine + ", " + color + ")";
	}
}
