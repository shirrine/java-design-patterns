package com.shirrine.patterns.foobarmv.builder;

import com.shirrine.patterns.foobarmv.Vehicle;

/**
 * Build operations for various types of vehicles.
 *
 * @author Shirrine
 *
 */
public abstract class VehicleBuilder {

    /**
     * Builds the vehicle body.
     *
     * @return the builder
     */
    public VehicleBuilder buildBody() {
        // Basic implementation. Subclass can override if needed
        return this;
    }

    /**
     * Builds the vehicle boot.
     *
     * @return the builder
     */
    public VehicleBuilder buildBoot() {
        // Basic implementation. Subclass can override if needed
        return this;
    }

    /**
     * Builds the vehicle chassis.
     *
     * @return the builder
     */
    public VehicleBuilder buildChassis() {
        // Basic implementation. Subclass can override if needed
        return this;
    }

    /**
     * Builds the vehicle passenger area.
     *
     * @return the builder
     */
    public VehicleBuilder buildPassengerArea() {
        // Basic implementation. Subclass can override if needed
        return this;
    }

    /**
     * Builds the vehicle reinforced storage area.
     *
     * @return the builder
     */
    public VehicleBuilder buildReinforcedStorageArea() {
        // Basic implementation. Subclass can override if needed
        return this;
    }

    /**
     * Builds the vehicle windows.
     *
     * @return the builder
     */
    public VehicleBuilder buildWindows() {
        // Basic implementation. Subclass can override if needed
        return this;
    }

    /**
     * Returns the vehicle.
     *
     * @return the vehicle
     */
    public abstract Vehicle getVehicle(); // Must be implemented by subclass ;-)

}
