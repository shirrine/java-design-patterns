package com.shirrine.patterns.foobarmv;

import com.shirrine.patterns.foobarmv.flyweight.Engine;

/**
 * A box van.
 *
 * @author Shirrine
 */
public class BoxVan extends AbstractVan {

    private static final int PRICE = 8000;

    /**
     * Creates a box van with the specified engine.
     *
     * @param engine the van engine
     */
    public BoxVan(final Engine engine) {
        super(engine);
    }

    /**
     * Gets the van price.
     *
     * @return the van price
     */
    public int getPrice() {
        return PRICE;
    }
}
