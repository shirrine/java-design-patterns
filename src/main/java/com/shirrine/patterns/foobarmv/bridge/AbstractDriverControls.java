package com.shirrine.patterns.foobarmv.bridge;

import com.shirrine.patterns.foobarmv.flyweight.Engine;

/**
 * Vehicle controls.
 *
 * @author Shirrine
 */
public abstract class AbstractDriverControls {

    private Engine engine;

    /**
     * Creates vehicle controls.
     *
     * @param engine the engine to control
     */
    public AbstractDriverControls(final Engine engine) {
        this.engine = engine;
    }

    /**
     * Turns the ignition on.
     */
    public void ignitionOn() {
        engine.start();
    }

    /**
     * Turns the ignition off.
     */
    public void ignitionOff() {
        engine.stop();
    }

    /**
     * Accelerates the vehicle.
     */
    public void accelerate() {
        engine.increasePower();
    }

    /**
     * Brakes the vehicle.
     */
    public void brake() {
        engine.decreasePower();
    }

}
