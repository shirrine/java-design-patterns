package com.shirrine.patterns.foobarmv.adapter;

import java.util.*;
import org.junit.*;
import com.shirrine.patterns.foobarmv.flyweight.*;

/**
 * Adapt a third-party engine the our existing model.
 * 
 * @author Shirrine
 *
 */
public class AdapterTest {
	
	private static EngineFlyweightFactory engineFactory;
	
	@BeforeClass public static void setup(){
		engineFactory = new EngineFlyweightFactory();
	}
	
	@Test public void testAdapter(){
		
		List<Engine> engines = new ArrayList<Engine>();
		engines.add(engineFactory.getStandardEngine(1300));
		engines.add(engineFactory.getStandardEngine(1600));
		engines.add(engineFactory.getTurboEngine(1300));
		engines.add(new SuperGreenEngineAdapter(new SuperGreenEngine(1200)));
		
		for(Engine engine : engines){
			System.out.println(engine);
		}
	}

}
