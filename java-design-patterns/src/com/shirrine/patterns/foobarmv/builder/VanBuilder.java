package com.shirrine.patterns.foobarmv.builder;

import com.shirrine.patterns.foobarmv.*;

public class VanBuilder extends VehicleBuilder{
	
	private AbstractVan vanInProgress;
	
	public VanBuilder(AbstractVan van){
		this.vanInProgress = van;
	}
	
	@Override
	public VanBuilder buildBody(){
		System.out.println("Building van body...");
		return this;
	}
	
	@Override
	public VanBuilder buildChassis(){
		System.out.println("Building van chassis...");
		return this;
	}
	
	@Override
	public VanBuilder buildReinforcedStorageArea(){
		System.out.println("Building van storage area...");
		return this;
	}
	
	@Override
	public VanBuilder buildWindows(){
		System.out.println("Building van windows...");
		return this;
	}
	
	@Override
	public Vehicle getVehicle(){
		return vanInProgress;
	}


}
