package com.shirrine.patterns.abstractfactory.colorshapes.color;


/**
 * 
 * @author Shirrine
 *
 */
public class Green implements Color{
	
	/*
	 * (non-Javadoc)
	 * @see patterns.abstractfactory.colorshapes.Color#fill()
	 */
	@Override
	public void fill(){
		System.out.println("Filling with green color!");
	}

}
