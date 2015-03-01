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

    /**
     * Sets up an EngineFlyweight for engine reuse.
     */
	@BeforeClass public static void setup(){
		engineFactory = new EngineFlyweightFactory();
	}

    /**
     * Tests an adapter for a third-party engine into our manufacturing operations.
     */
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
