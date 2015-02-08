package patterns.abstractfactory.foobarmv.car;

import patterns.abstractfactory.foobarmv.Windows;

/**
 * Car implementation of the <code>Windows<code> interface.
 * 
 * @author Shirrine
 *
 */
public class CarWindows implements Windows{
	
	/*
	 * (non-Javadoc)
	 * @see patterns.abstractfactory.example1.Windows#getWindowParts()
	 */
	public String getWindowParts(){
		return "Car window parts!";
	}

}
