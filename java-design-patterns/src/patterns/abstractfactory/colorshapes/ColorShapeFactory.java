package patterns.abstractfactory.colorshapes;

import patterns.abstractfactory.colorshapes.color.Color;
import patterns.abstractfactory.colorshapes.shape.Shape;

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
