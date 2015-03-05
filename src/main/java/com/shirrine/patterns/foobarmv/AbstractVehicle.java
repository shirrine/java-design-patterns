package com.shirrine.patterns.foobarmv;

import com.shirrine.patterns.foobarmv.flyweight.Engine;

/**
 * An abstract vehicle.
 *
 * @author Shirrine
 *
 */
public abstract class AbstractVehicle implements Vehicle {

    private Engine engine;
    private Vehicle.Color color;

    /**
     * Creates an abstract vehicle with the specified engine.
     *
     * @param engine
     *            the vehicle engine
     */
    public AbstractVehicle(final Engine engine) {
        this(engine, Vehicle.Color.UNPAINTED);
    }

    /**
     * Creates an abstract vehicle with the specified engine and color.
     *
     * @param engine
     *            the vehicle engine
     * @param color
     *            the vehicle color
     */
    public AbstractVehicle(final Engine engine, final Vehicle.Color color) {
        this.engine = engine;
        this.color = color;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.shirrine.patterns.foobarmv.Vehicle#getEngine()
     */
    @Override
    public Engine getEngine() {
        return this.engine;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.shirrine.patterns.foobarmv.Vehicle#getColor()
     */
    @Override
    public Vehicle.Color getColor() {
        return this.color;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.shirrine.patterns.foobarmv.Vehicle#paint(com.shirrine.patterns.
     * foobarmv.Vehicle.Color)
     */
    @Override
    public void paint(final Vehicle.Color color) {
        this.color = color;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " (" + engine + ", " + color
                + ", price " + getPrice() + ")";
    }
}
