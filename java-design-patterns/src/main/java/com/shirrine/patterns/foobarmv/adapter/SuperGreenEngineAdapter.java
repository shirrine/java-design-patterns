/*
 * Adapting stuff...
 */
package com.shirrine.patterns.foobarmv.adapter;

import com.shirrine.patterns.foobarmv.flyweight.*;

/**
 * Adapter from SuperGreenEngine (third-party) to AbstractEngine
 * 
 * @author Shirrine
 *
 */
public class SuperGreenEngineAdapter extends AbstractEngine{
	
	/**
	 * Adapts from SuperGreenEngine to AbstractEngine
	 * 
	 * @param greenEngine
	 */
	public SuperGreenEngineAdapter(SuperGreenEngine greenEngine){
		super(greenEngine.getEngineSize(), false);
	}

}
