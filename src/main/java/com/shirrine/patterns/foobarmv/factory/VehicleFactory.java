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
     * Indicates the vehicle category.
     * <ul>
     *     <li>CAR</li>
     *     <li>VAN</li>
     * </ul>
     */
    public enum Category {

        /**
         * Car category.
         */
        CAR,

        /**
         * Van category.
         */
        VAN
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

    /**
     * Makes a vehicle.
     *
     * @param category the vehicle category
     * @param style the driving style
     * @param color the vehicle color
     * @return the vehicle
     */
    public static Vehicle make(final Category category,
                               final DrivingStyle style,
                               final Vehicle.Color color) {

        VehicleFactory factory = null;

        // Select the factory
        if (category == Category.CAR) {
            factory = new CarFactory();
        } else {
            factory = new VanFactory();
        }

        // Build the vehicle
        return factory.build(style, color);
    }

}
