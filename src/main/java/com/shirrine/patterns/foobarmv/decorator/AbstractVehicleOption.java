package com.shirrine.patterns.foobarmv.decorator;

import com.shirrine.patterns.foobarmv.AbstractVehicle;
import com.shirrine.patterns.foobarmv.Vehicle;

/**
 * Vehicle options for use in decorating/wrapping vehicles.
 *
 * @author Shirrine
 */
public abstract class AbstractVehicleOption extends AbstractVehicle {

    protected Vehicle decoratedVehicle;

    /**
     * Creates a vehicle decorator to add vehicle options.
     *
     * @param vehicle the vehicle to enhance
     */
    public AbstractVehicleOption(final Vehicle vehicle) {
        super(vehicle.getEngine(), vehicle.getColor());
        decoratedVehicle = vehicle;
    }
}
