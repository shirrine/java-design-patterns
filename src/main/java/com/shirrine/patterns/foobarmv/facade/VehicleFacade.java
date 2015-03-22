package com.shirrine.patterns.foobarmv.facade;

import com.shirrine.patterns.foobarmv.Vehicle;

/**
 * @author Shirrine
 */
public class VehicleFacade {

    /**
     * Creates a facade for vehicle preparation.
     */
    public VehicleFacade() {
        // No-op
    }

    /**
     * Prepare a vehicle for sale by registering the vehicle, printing
     * the brochure, cleaning the vehicle and taking it for a test drive.
     *
     * @param vehicle the vehicle to prepare
     */
    public void prepareForSale(final Vehicle vehicle) {

        // Register the vehicle
        Registration registration = new Registration(vehicle);
        registration.allocateVehicleNumber();
        registration.allocateLicensePlate();

        // Print documentation
        Documentation.printBrochure(vehicle);

        // Clean the vehicle
        vehicle.cleanInterior();
        vehicle.cleanExteriorBody();
        vehicle.polishWindows();

        // Test drive time!!!
        vehicle.takeForTestDrive();

    }

}
