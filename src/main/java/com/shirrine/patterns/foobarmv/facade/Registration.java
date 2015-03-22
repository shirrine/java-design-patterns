package com.shirrine.patterns.foobarmv.facade;

import com.shirrine.patterns.foobarmv.Vehicle;

/**
 * Register a vehicle.
 *
 * @author Shirrine
 */
public class Registration {

    private Vehicle vehicle;

    /**
     * Creates a vehicle registration.
     *
     * @param vehicle the vehicle to register
     */
    public Registration(final Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    /**
     * Allocates a license plate.
     */
    public void allocateLicensePlate() {
        System.out.println("License plate allocated");
    }

    /**
     * Allocates a vehicle VIN.
     */
    public void allocateVehicleNumber() {
        System.out.println("VIN allocated");
    }

}
