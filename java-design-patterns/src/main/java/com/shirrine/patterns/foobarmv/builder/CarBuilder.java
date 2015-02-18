package com.shirrine.patterns.foobarmv.builder;

import com.shirrine.patterns.foobarmv.*;

public class CarBuilder extends VehicleBuilder{
	
	private AbstractCar carInProgress;
	
	public CarBuilder(AbstractCar car){
		this.carInProgress = car;
	}
	
	@Override
	public CarBuilder buildBody(){
		System.out.println("Building car body...");
		return this;
	}
	
	@Override
	public CarBuilder buildBoot(){
		System.out.println("Buiding car boot...");
		return this;
	}
	
	@Override
	public CarBuilder buildChassis(){
		System.out.println("Building car chassis...");
		return this;
	}
	
	@Override
	public CarBuilder buildPassengerArea(){
		System.out.println("Building car passenger area...");
		return this;
	}
	
	@Override
	public CarBuilder buildWindows(){
		System.out.println("Building car windows...");
		return this;
	}
	
	@Override
	public Vehicle getVehicle(){
		return carInProgress;
	}
}
