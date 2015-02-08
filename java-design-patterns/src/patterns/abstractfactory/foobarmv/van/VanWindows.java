package patterns.abstractfactory.foobarmv.van;

import patterns.abstractfactory.foobarmv.Windows;

/**
 * Van implementation of the <code>Windows</code> interface.
 * 
 * @author Shirrine
 *
 */
public class VanWindows implements Windows{
	
	/*
	 * (non-Javadoc)
	 * @see patterns.abstractfactory.example1.Windows#getWindowParts()
	 */
	public String getWindowParts(){
		return "Van window parts!";
	}

}
