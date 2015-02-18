/*
 * Let's get moving!
 */
package com.shirrine.patterns.foobarmv.client;

import com.shirrine.patterns.foobarmv.flyweight.DiagnosticTool;
import com.shirrine.patterns.foobarmv.flyweight.Engine;
import com.shirrine.patterns.foobarmv.flyweight.EngineDiagnosticTool;
import com.shirrine.patterns.foobarmv.flyweight.EngineFlyweightFactory;

public class FlyweightClient {
	
	public static void main(String[] args){
		
		// Create the flyweight factory
		EngineFlyweightFactory engineFactory = new EngineFlyweightFactory();
		
		// Create the diagnostic tool
		DiagnosticTool engineDiagTool = new EngineDiagnosticTool();
		
		// Get an engine and run diagnostics
		Engine standard1 = engineFactory.getStandardEngine(1300);
		standard1.diagnose(engineDiagTool);
		
		// Get an engine and run diagnostics
		Engine standard2 = engineFactory.getStandardEngine(1300);
		standard2.diagnose(engineDiagTool);
		
		// Get an engine and run diagnostics
		Engine standard3 = engineFactory.getStandardEngine(1300);
		standard3.diagnose(engineDiagTool);

		// Get an engine and run diagnostics
		Engine standard4 = engineFactory.getStandardEngine(1600);
		standard4.diagnose(engineDiagTool);

		// Get an engine and run diagnostics
		Engine standard5 = engineFactory.getStandardEngine(1600);
		standard5.diagnose(engineDiagTool);
		
		// Show that the objects are shared
		System.out.println(standard1.hashCode());
		System.out.println(standard2.hashCode());
		System.out.println(standard3.hashCode());
		System.out.println(standard4.hashCode());
		System.out.println(standard5.hashCode());
		
		// Compare for equality
		System.out.println(standard1.equals(standard2));
		System.out.println(standard2.equals(standard3));
		System.out.println(standard1.equals(standard3));
		System.out.println(standard4.equals(standard5));
		System.out.println(!standard3.equals(standard5));
	}

}
