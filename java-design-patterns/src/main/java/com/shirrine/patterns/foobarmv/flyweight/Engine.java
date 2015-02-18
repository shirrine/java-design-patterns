/*
 * Learning the FlyWeight pattern...
 */
package com.shirrine.patterns.foobarmv.flyweight;


/**
 * A vehicle engine.
 * 
 * @author Shirrine
 *
 */
public interface Engine {
	
	/**
	 * Gets the engine size.
	 * 
	 * @return the engine size
	 */
	public int getSize(); // Intrinsic state
	
	/**
	 * Indicates if the engine is turbo.
	 * 
	 * @return true, if turbo
	 */
	public boolean isTurbo(); // Intrinsic state
	
	/**
	 * Diagnoses the engine with the specified tool.
	 * 
	 * @param tool the tool to diagnose the engine
	 */
	public void diagnose(DiagnosticTool tool); // Extrinsic state

}
