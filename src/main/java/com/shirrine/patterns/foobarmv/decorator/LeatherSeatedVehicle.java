package com.shirrine.patterns.foobarmv.decorator;

import com.shirrine.patterns.foobarmv.Vehicle;

/**
 * Vehicle option for leather seats.
 *
 * @author Shirrine
 */
public class LeatherSeatedVehicle extends AbstractVehicleOption {

    private static final int OPTION_PRICE = 1200;

    /**
     * Decorates a vehicle with leather seats.
     *
     * @param vehicle the vehicle to decorate
     */
    public LeatherSeatedVehicle(final Vehicle vehicle) {
        super(vehicle);
    }

    /**
     * Gets the price.
     *
     * @return the price of the leather seat option
     */
    public int getPrice() {
        return decoratedVehicle.getPrice() + OPTION_PRICE;
    }

}
