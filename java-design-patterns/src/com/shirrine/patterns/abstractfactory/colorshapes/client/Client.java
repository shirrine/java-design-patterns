package com.shirrine.patterns.abstractfactory.colorshapes.client;

import com.shirrine.patterns.abstractfactory.colorshapes.ColorShapeFactory;
import com.shirrine.patterns.abstractfactory.colorshapes.FactoryProducer;
import com.shirrine.patterns.abstractfactory.colorshapes.color.Color;
import com.shirrine.patterns.abstractfactory.colorshapes.shape.Shape;


/**
 * Build colors and shapes.
 * 
 * @author Shirrine
 *
 */
public class Client {
	
	/**
	 * Creates colors and shapes.
	 * 
	 * @param args unused
	 */
	public static void main(String[] args){
		
		// Get a shape factory
		ColorShapeFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		
		// Draw a circle
		Shape circle = shapeFactory.getShape("circle");
		circle.draw();
		
		// Draw a rectangle
		Shape rectangle = shapeFactory.getShape("rectangle");
		rectangle.draw();
		
		// Draw a square
		Shape square = shapeFactory.getShape("square");
		square.draw();
		
		// Get a color factory
		ColorShapeFactory colorFactory = FactoryProducer.getFactory("COLOR");
		
		// Red fill
		Color red = colorFactory.getColor("red");
		red.fill();
		
		// Green fill
		Color green = colorFactory.getColor("green");
		green.fill();
		
		// Blue fill
		Color blue = colorFactory.getColor("blue");
		blue.fill();
	}

}
