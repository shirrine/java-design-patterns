package com.shirrine.patterns.foobarmv;

import com.shirrine.patterns.foobarmv.flyweight.Engine;

/**
 * A coupe car.
 *
 * @author Shirrine
 */
public class Coupe extends AbstractCar {

    private static final int PRICE = 8000;

    /**
     * Creates a coupe car with the specified engine.
     *
     * @param engine
     *            the car engine
     */
    public Coupe(final Engine engine) {
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
