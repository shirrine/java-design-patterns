package com.shirrine.patterns.foobarmv.factory;

import com.shirrine.patterns.foobarmv.Vehicle;

/**
 * A factory for creating vehicles.
 *
 * @author Shirrine
 */
public abstract class VehicleFactory {

    /**
     * Indicates the driving style.
     * <ul>
     *     <li>ECONOMICAL</li>
     *     <li>MIDRANGE</li>
     *     <li>POWERFUL</li>
     * </ul>
     */
    public enum DrivingStyle {

        /**
         * Economical preference.
         */
        ECONOMICAL,

        /**
         * Midrange preference.
         */
        MIDRANGE,

        /**
         * Powerful preference.
         */
        POWERFUL
    }

    /**
     * Builds a vehicle with the preferred style and color.
     *
     * @param style the driving style
     * @param color the vehicle color
     * @return the vehicle
     */
    public Vehicle build(final DrivingStyle style, final Vehicle.Color color) {
        Vehicle vehicle = selectVehicle(style);
        vehicle.paint(color);
        return vehicle;
    }

    /**
     * Selects a vehicle based on the style preference.
     *
     * @param style the driving style
     * @return the vehicle
     */
    protected abstract Vehicle selectVehicle(final DrivingStyle style);

}
