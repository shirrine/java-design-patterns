package com.shirrine.patterns.foobarmv.adapter;

/**
 * Third-party Super Green Engine
 * 
 * @author Shirrine
 *
 */
public class SuperGreenEngine {
	
	private int size;
	
	public SuperGreenEngine(int size){
		this.size = size;
	}
	
	public int getEngineSize(){
		return this.size;
	}
	
	public String toString(){
		return "SUPER ENGINE " + size;
	}

}
