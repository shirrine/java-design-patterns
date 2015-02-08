/*
 * This class is for comparison. It does not use the AbstractFactory design pattern.
 */

package patterns.abstractfactory.foobarmv.van;

import patterns.abstractfactory.foobarmv.*;

/**
 * Build a van.
 * 
 * @author Shirrine
 *
 */
public class Van extends Vehicle{
	
	/*
	 * (non-Javadoc)
	 * @see patterns.abstractfactory.foobarmv.Vehicle#createBody()
	 */
	public Body createBody(){
		return new VanBody();
	}
	
	/*
	 * (non-Javadoc)
	 * @see patterns.abstractfactory.foobarmv.Vehicle#createChassis()
	 */
	public Chassis createChassis(){
		return new VanChassis();
	}
	
	/*
	 * (non-Javadoc)
	 * @see patterns.abstractfactory.foobarmv.Vehicle#createWindows()
	 */
	public Windows createWindows(){
		return new VanWindows();
	}

}
