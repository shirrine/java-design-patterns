package com.shirrine.patterns.foobarmv.decorator;

import com.shirrine.patterns.foobarmv.Vehicle;

/**
 * Vehicle option for GPS navigation.
 *
 * @author Shirrine
 */
public class GPSNavigatedVehicle extends AbstractVehicleOption {

    private static final int OPTION_PRICE = 1500;

    /**
     * Decorates a vehicle with GPS navigation.
     *
     * @param vehicle the vehicle to decorate
     */
    public GPSNavigatedVehicle(final Vehicle vehicle) {
        super(vehicle);
    }

    /**
     * Gets the option price.
     *
     * @return the price of the GPS navigation option
     */
    public int getPrice() {
        return decoratedVehicle.getPrice() + OPTION_PRICE;
    }


}
