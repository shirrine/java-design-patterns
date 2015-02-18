/*
 * Let's get moving!
 */
package com.shirrine.patterns.foobarmv.flyweight;

import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

public class FlyweightTest {
	
	@Test public void test1(){
		
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
		
		// Compare for equality
		assertThat(standard1, equalTo(standard2));
		assertThat(standard2, equalTo(standard3));
		assertThat(standard1, equalTo(standard3));
		assertThat(standard4, equalTo(standard5));
		assertThat(standard3, not(equalTo(standard5)));

	}

}
