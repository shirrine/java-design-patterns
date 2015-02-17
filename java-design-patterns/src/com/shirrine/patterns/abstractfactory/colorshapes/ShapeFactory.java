package com.shirrine.patterns.abstractfactory.colorshapes;

import com.shirrine.patterns.abstractfactory.colorshapes.color.Color;
import com.shirrine.patterns.abstractfactory.colorshapes.shape.*;

/**
 * Manufacture shapes.
 * 
 * @author Shirrine
 *
 */
public class ShapeFactory extends ColorShapeFactory{
	
	/*
	 * (non-Javadoc)
	 * @see patterns.abstractfactory.colorshapes.ColorShapeFactory#getColor(java.lang.String)
	 */
	@Override
	public Color getColor(String color){
		return null;
	}
	
	/*
	 * (non-Javadoc)
	 * @see patterns.abstractfactory.colorshapes.ColorShapeFactory#getShape(java.lang.String)
	 */
	@Override
	public Shape getShape(String shape){
		
		// Validation
		if(shape == null){
			return null;
		}
		
		// Select shape
		switch(shape.toLowerCase()){
		case "circle": return new Circle();
		case "square": return new Square();
		case "rectangle": return new Rectangle();
		}
		
		return null;
	}

}
