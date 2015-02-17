package com.shirrine.patterns.abstractfactory.colorshapes.color;


/**
 * 
 * @author Shirrine
 *
 */
public class Blue implements Color{
	
	/*
	 * (non-Javadoc)
	 * @see patterns.abstractfactory.colorshapes.Color#fill()
	 */
	@Override
	public void fill(){
		System.out.println("Filling with blue color!");
	}

}
