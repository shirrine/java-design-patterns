package patterns.abstractfactory.foobarmv.van;

import patterns.abstractfactory.foobarmv.*;
/**
 * Manufacture a van.
 * 
 * @author Shirrine
 *
 */
public class VanFactory extends AbstractVehicleFactory{
	
	/*
	 * (non-Javadoc)
	 * @see patterns.abstractfactory.foobarmv.AbstractVehicleFactory#createBody()
	 */
	public Body createBody(){
		return new VanBody();
	}
	
	/*
	 * (non-Javadoc)
	 * @see patterns.abstractfactory.foobarmv.AbstractVehicleFactory#createChassis()
	 */
	public Chassis createChassis(){
		return new VanChassis();
	}
	
	/*
	 * (non-Javadoc)
	 * @see patterns.abstractfactory.foobarmv.AbstractVehicleFactory#createWindows()
	 */
	public Windows createWindows(){
		return new VanWindows();
	}

}
