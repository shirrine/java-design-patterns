package com.shirrine.patterns.foobarmv.builder;

import com.shirrine.patterns.foobarmv.AbstractCar;
import com.shirrine.patterns.foobarmv.Vehicle;

/**
 * A builder for creating cars.
 *
 * @author Shirrine
 *
 */
public class CarBuilder extends VehicleBuilder {

    private AbstractCar carInProgress;

    /**
     * Creates a car builder.
     *
     * @param car the car to build
     */
    public CarBuilder(final AbstractCar car) {
        this.carInProgress = car;
    }

    @Override
    public CarBuilder buildBody() {
        System.out.println("Building car body...");
        return this;
    }

    @Override
    public CarBuilder buildBoot() {
        System.out.println("Buiding car boot...");
        return this;
    }

    @Override
    public CarBuilder buildChassis() {
        System.out.println("Building car chassis...");
        return this;
    }

    @Override
    public CarBuilder buildPassengerArea() {
        System.out.println("Building car passenger area...");
        return this;
    }

    @Override
    public CarBuilder buildWindows() {
        System.out.println("Building car windows...");
        return this;
    }

    @Override
    public Vehicle getVehicle() {
        return carInProgress;
    }
}
