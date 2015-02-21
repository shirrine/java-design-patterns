/*
 * The Builder pattern.
 */
package com.shirrine.patterns.foobarmv.builder;

import com.shirrine.patterns.foobarmv.Vehicle;

/**
 * A director for building a vehicle.
 *
 * @author Shirrine
 *
 */
public abstract class VehicleDirector {

    /**
     * Builds a vehicle.
     *
     * @param builder the vehicle builder
     * @return the vehicle
     */
    public abstract Vehicle build(final VehicleBuilder builder);

}
