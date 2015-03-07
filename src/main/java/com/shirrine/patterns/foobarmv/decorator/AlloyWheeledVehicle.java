package com.shirrine.patterns.foobarmv.decorator;

import com.shirrine.patterns.foobarmv.Vehicle;

/**
 * Vehicle option for alloy wheels.
 *
 * @author Shirrine
 */
public class AlloyWheeledVehicle extends AbstractVehicleOption {

    private static final int OPTION_PRICE = 250;

    /**
     * Decorates a vehicle with alloy wheels.
     *
     * @param vehicle the vehicle to decorate
     */
    public AlloyWheeledVehicle(final Vehicle vehicle) {
        super(vehicle);
    }

    /**
     * Gets the price.
     *
     * @return the price of the alloy wheel option
     */
    public int getPrice() {
        return decoratedVehicle.getPrice() + OPTION_PRICE;
    }
}
