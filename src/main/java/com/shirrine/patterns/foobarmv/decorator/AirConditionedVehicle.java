package com.shirrine.patterns.foobarmv.decorator;

import com.shirrine.patterns.foobarmv.Vehicle;

/**
 * Vehicle option for air conditioning.
 *
 * @author Shirrine
 */
public class AirConditionedVehicle extends AbstractVehicleOption {

    private static final int OPTION_PRICE = 600;

    /**
     * Decorates a vehicle with add air conditioning.
     *
     * @param vehicle the vehicle to add air conditioning
     */
    public AirConditionedVehicle(final Vehicle vehicle) {
        super(vehicle);
    }

    /**
     * Gets the option price.
     *
     * @return the price of the air conditioning option
     */
    @Override
    public int getPrice() {
        return decoratedVehicle.getPrice() + OPTION_PRICE;
    }

    /**
     * Sets the temperature in Fahrenheit.
     *
     * @param value the temperature value
     */
    public void setTemperature(final int value) {
        System.out.println("Setting the temperature to " + value);
    }

}
