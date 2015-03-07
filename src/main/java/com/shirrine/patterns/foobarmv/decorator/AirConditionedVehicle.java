package com.shirrine.patterns.foobarmv.decorator;

import com.shirrine.patterns.foobarmv.Vehicle;
import com.shirrine.patterns.foobarmv.command.AirConditioner;

/**
 * Vehicle option for air conditioning.
 *
 * @author Shirrine
 */
public class AirConditionedVehicle extends AbstractVehicleOption {

    private static final int OPTION_PRICE = 600;
    private AirConditioner airConditioner;

    /**
     * Decorates a vehicle with air conditioning.
     *
     * @param vehicle the vehicle to add air conditioning
     */
    public AirConditionedVehicle(final Vehicle vehicle) {

        super(vehicle);
        airConditioner = new AirConditioner();
    }

    /**
     * Gets the price.
     *
     * @return the price of the air conditioning option
     */
    @Override
    public int getPrice() {
        return decoratedVehicle.getPrice() + OPTION_PRICE;
    }

    /**
     * Starts the air conditioner.
     */
    public void startAirConditioner() {
        airConditioner.on();
    }

    /**
     * Stops the air conditioner.
     */
    public void stopAirConditioner() {
        airConditioner.off();
    }

    /**
     * Increases the temperature.
     *
     */
    public void increaseTemperature() {

        if (airConditioner.isOn()) {
            airConditioner.temperatureUp();
        }
    }

    /**
     * Decreases the temperature.
     *
     */
    public void decreaseTemperature() {

        if (airConditioner.isOn()) {
            airConditioner.temperatureDown();
        }
    }

}
