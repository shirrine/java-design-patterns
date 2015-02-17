/**
 * Learning the FlyWeight design pattern...
 */
package com.shirrine.patterns.foobarmv.flyweight;

/**
 * An engine diagnostic tool.
 * 
 * @author Shirrine
 *
 */
public class EngineDiagnosticTool implements DiagnosticTool{
	
	/*
	 * (non-Javadoc)
	 * @see com.shirrine.patterns.flyweight.DiagnosticTool#runDiagnosis(java.lang.Object)
	 */
	@Override
	public void runDiagnosis(Object obj){
		System.out.println("Starting engine diagnostic tool for " + obj);
		
		try{
			// Sleep for 5 seconds
			Thread.sleep(5000);
			
			// Print status
			System.out.println("Engine diagnosis complete");
			
		} catch(InterruptedException e){
			
			// Print status
			System.out.println("Engine diagnosis interrupted!");
		}
	}

}
