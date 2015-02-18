package com.shirrine.patterns.foobarmv.abstractfactory.car;

import com.shirrine.patterns.foobarmv.abstractfactory.Body;

/**
 * Car implementation of the <code>Body</code> interface.
 * 
 * @author Shirrine
 *
 */
public class CarBody implements Body {
	
	/*
	 * (non-Javadoc)
	 * @see patterns.abstractfactory.example1.Body#getBodyParts()
	 */
	public String getBodyParts(){
		return "Car body parts!";
	}

}
