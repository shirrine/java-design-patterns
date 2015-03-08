package com.shirrine.patterns.foobarmv;

import com.shirrine.patterns.foobarmv.flyweight.Engine;

/**
 * A pickup truck.
 *
 * @author Shirrine
 */
public class Pickup extends AbstractVan {

    private static final int PRICE = 9000;

    /**
     * Creates a pickup truck with the specified engine.
     *
     * @param engine the pickup engine
     */
    public Pickup(final Engine engine) {
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
