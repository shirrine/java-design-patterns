package com.shirrine.patterns.foobarmv;

import com.shirrine.patterns.foobarmv.flyweight.Engine;

/**
 * A sport car.
 *
 * @author Shirrine
 */
public class Sport extends AbstractCar {

    private static final int PRICE = 10000;

    /**
     * Creates a sport car with the specified engine.
     *
     * @param engine
     *            the car engine
     */
    public Sport(final Engine engine) {
        super(engine);
    }

    /**
     * Gets the car price.
     *
     * @return the car price
     */
    public int getPrice() {
        return PRICE;
    }


}
