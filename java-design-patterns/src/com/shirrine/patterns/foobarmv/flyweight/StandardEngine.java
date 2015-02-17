/*
 * Vrrrrooooommmm!!!
 */
package com.shirrine.patterns.foobarmv.flyweight;

/**
 * A standard engine.
 * 
 * @author Shirrine
 *
 */
public class StandardEngine extends AbstractEngine{

	/**
	 * Creates a standard engine.
	 * 
	 * @param size the engine size
	 */
	public StandardEngine(int size){
		super(size, false);
	}
}
