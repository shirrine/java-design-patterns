package com.shirrine.patterns.foobarmv;

import com.shirrine.patterns.foobarmv.flyweight.Engine;

/**
 * A saloon car.
 *
 * @author Shirrine
 *
 */
public class Saloon extends AbstractCar {

    private static final int PRICE = 6000;

    /**
     * Creates a saloon car with the specified engine.
     *
     * @param engine
     *            the car engine
     */
    public Saloon(final Engine engine) {
        super(engine);
    }

    /**
     * Creates a saloon car with the specified engine and color.
     *
     * @param engine
     *            the car engine
     * @param color
     *            the car color
     */
    public Saloon(final Engine engine, final Vehicle.Color color) {
        super(engine, color);
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
