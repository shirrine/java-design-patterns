package com.shirrine.patterns.foobarmv.decorator;

import com.shirrine.patterns.foobarmv.Vehicle;

/**
 * Vehicle option for metallic paint.
 *
 * @author Shirrine
 */
public class MetallicPaintedVehicle extends AbstractVehicleOption {

    private static final int OPTION_PRICE = 750;

    /**
     * Decorates a vehicle with metallic paint.
     *
     * @param vehicle the vehicle to decorate
     */
    public MetallicPaintedVehicle(final Vehicle vehicle) {
        super(vehicle);
    }

    /**
     * Gets the option price.
     *
     * @return the price of the metallic paint option
     */
    public int getPrice() {
        return decoratedVehicle.getPrice() + OPTION_PRICE;
    }

}
