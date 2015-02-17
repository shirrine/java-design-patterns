package com.shirrine.patterns.abstractfactory.colorshapes;

import com.shirrine.patterns.abstractfactory.colorshapes.color.*;
import com.shirrine.patterns.abstractfactory.colorshapes.shape.Shape;

/**
 * Manufacture colors.
 * 
 * @author Shirrine
 *
 */
public class ColorFactory extends ColorShapeFactory{
	
	/*
	 * (non-Javadoc)
	 * @see patterns.abstractfactory.colorshapes.ColorShapeFactory#getShape(java.lang.String)
	 */
	@Override
	public Shape getShape(String shape){
		return null;
	}
	
	/*
	 * (non-Javadoc)
	 * @see patterns.abstractfactory.colorshapes.ColorShapeFactory#getColor(java.lang.String)
	 */
	@Override
	public Color getColor(String color){
		
		// Validation
		if(color == null){
			return null;
		}
		
		// Select color
		switch(color.toLowerCase()){
		case "red": return new Red();
		case "green": return new Green();
		case "blue": return new Blue();
		}
		
		return null;
	}

}
