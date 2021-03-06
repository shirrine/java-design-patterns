package com.shirrine.patterns.foobarmv;

import com.shirrine.patterns.foobarmv.flyweight.Engine;

/**
 * An abstract van.
 *
 * @author Shirrine
 *
 */
public abstract class AbstractVan extends AbstractVehicle {

    /**
     * Creates an abstract van with the specified engine.
     *
     * @param engine
     *            the van engine
     */
    public AbstractVan(final Engine engine) {
        super(engine);
    }

    /**
     * Creates an abstract van with the specified engine and color.
     *
     * @param engine
     *            the van engine
     * @param color
     *            the van color
     */
    public AbstractVan(final Engine engine, final Vehicle.Color color) {
        super(engine, color);
    }

}
