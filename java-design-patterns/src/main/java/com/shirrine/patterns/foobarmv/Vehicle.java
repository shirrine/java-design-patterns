package com.shirrine.patterns.foobarmv;

import com.shirrine.patterns.foobarmv.flyweight.Engine;

/**
 * A vehicle with an engine and a color.
 * 
 * @author Shirrine
 *
 */
public interface Vehicle {
	
	public enum Color{ UNPAINTED, BLUE, BLACK, GREEN, RED, SILVER, WHITE, YELLOW };
	
	/**
	 * Gets the vehicle engine.
	 * 
	 * @return the engine
	 */
	public Engine getEngine();
	
	/**
	 * Gets the vehicle color.
	 * 
	 * @return the color
	 */
	public Vehicle.Color getColor();
	
	/**
	 * Paints the vehice the specified color.
	 * 
	 * @param color the color to paint
	 */
	public void paint(Vehicle.Color color);

}
