package com.shirrine.patterns.abstractfactory.colorshapes.shape;


/**
 * Circle implementation of the <code>Shape</code> interface.
 * 
 * @author Shirrine
 *
 */
public class Circle implements Shape{
	
	/**
	 * Draws a circle.
	 */
	@Override
	public void draw(){
		System.out.println("Drawing a circle!");
	}

}
