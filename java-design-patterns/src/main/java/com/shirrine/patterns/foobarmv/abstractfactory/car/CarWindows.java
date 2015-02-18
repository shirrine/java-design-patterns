package com.shirrine.patterns.foobarmv.abstractfactory.car;

import com.shirrine.patterns.foobarmv.abstractfactory.Windows;

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
