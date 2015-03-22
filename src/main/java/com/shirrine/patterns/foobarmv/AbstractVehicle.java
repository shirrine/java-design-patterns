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

    /**
     * Gets the vehicle engine.
     *
     * @return the engine
     */
    @Override
    public Engine getEngine() {
        return this.engine;
    }

    /**
     * Gets the vehicle color.
     *
     * @return the color
     */
    @Override
    public Vehicle.Color getColor() {
        return this.color;
    }

    /**
     * Paints the vehicle the specified color.
     *
     * @param color
     *            the color to paint
     */
    @Override
    public void paint(final Vehicle.Color color) {
        this.color = color;
    }

    /**
     * Creates a string including the class name, engine type, color and
     * price.
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " (" + engine + ", " + color
                + ", price " + getPrice() + ")";
    }

    /**
     * Clones a vehicle.
     *
     * @return the clone
     */
    @Override
    public Object clone() {
        Object obj = null;

        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return obj;
    }

    /**
     * Determines if two vehicles are equal by comparing the
     * result of <code>toString()</code>.
     *
     * @param obj the object to compare
     * @return true, if the objects are equal
     */
    @Override
    public boolean equals(final Object obj) {
        if (obj == null || !(obj instanceof Vehicle)) {
            throw new IllegalArgumentException();
        }

        return this.toString().equals(obj.toString());
    }

    /**
     * Computes a hash code using the value generated from
     * <code>toString</code>.
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {

        return this.toString().hashCode();

    }

    /**
     * Cleans the interior of a vehicle.
     */
    @Override
    public void cleanInterior() {
        System.out.println("Cleaning interior");
    }

    /**
     * Cleans the exterior of a vehicle.
     */
    @Override
    public void cleanExteriorBody() {
        System.out.println("Cleaning exterior");
    }

    /**
     * Polishes the vehicle windows.
     */
    @Override
    public void polishWindows() {
        System.out.println("Polishing windows");
    }

    /**
     * Takes vehicle for a test drive.
     */
    @Override
    public void takeForTestDrive() {
        System.out.println("Taking for test drive");
    }
}
