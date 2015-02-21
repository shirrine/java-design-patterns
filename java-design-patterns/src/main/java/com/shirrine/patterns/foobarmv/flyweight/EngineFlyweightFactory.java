/*
 * Flyweight concept: Rather than creating a new engine object for each request,
 * reuse an existing engine that has the exact same state. This reduces the
 * number of objects stored in memory.
 */
package com.shirrine.patterns.foobarmv.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * A factory for creating engines.
 *
 * @author Shirrine
 *
 */
public class EngineFlyweightFactory {

    private Map<Integer, Engine> standardEnginePool;
    private Map<Integer, Engine> turboEnginePool;

    /**
     * Creates a pool of engines.
     */
    public EngineFlyweightFactory() {
        standardEnginePool = new HashMap<Integer, Engine>();
        turboEnginePool = new HashMap<Integer, Engine>();
    }

    /**
     * Gets a standard engine of the specified size.
     *
     * @param size
     *            the size of the engine
     * @return the engine
     */
    public Engine getStandardEngine(final int size) {

        Engine engine = standardEnginePool.get(size);

        if (engine == null) {
            engine = new StandardEngine(size);
            standardEnginePool.put(size, engine);
        }

        return engine;
    }

    /**
     * Gets a turbo engine of the specificed size.
     *
     * @param size
     *            the engine size
     * @return the engine
     */
    public Engine getTurboEngine(final int size) {

        Engine engine = turboEnginePool.get(size);

        if (engine == null) {
            engine = new TurboEngine(size);
            turboEnginePool.put(size, engine);
        }

        return engine;
    }

}
