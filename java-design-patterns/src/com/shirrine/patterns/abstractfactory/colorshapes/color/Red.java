package com.shirrine.patterns.abstractfactory.colorshapes.color;


/**
 * 
 * @author Shirrine
 *
 */
public class Red implements Color{

	/*
	 * (non-Javadoc)
	 * @see patterns.abstractfactory.colorshapes.Color#fill()
	 */
	@Override
	public void fill(){
		System.out.println("Filling with red color!");
	}
}
