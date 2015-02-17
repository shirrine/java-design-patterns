package com.shirrine.patterns.abstractfactory.colorshapes;

import com.shirrine.patterns.abstractfactory.colorshapes.color.Color;
import com.shirrine.patterns.abstractfactory.colorshapes.shape.Shape;

/**
 * Manufacture colors and shapes.
 * 
 * @author Shirrine
 *
 */
public abstract class ColorShapeFactory {
	
	/**
	 * Gets the specified color.
	 * 
	 * @param color the color name
	 * @return
	 */
	public abstract Color getColor(String color);
	
	/**
	 * Gets the specified shape.
	 * 
	 * @param shape the shape name
	 * @return
	 */
	public abstract Shape getShape(String shape);

}
