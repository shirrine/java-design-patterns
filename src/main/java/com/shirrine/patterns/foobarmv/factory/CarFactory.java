package com.shirrine.patterns.foobarmv.factory;

import com.shirrine.patterns.foobarmv.Coupe;
import com.shirrine.patterns.foobarmv.Saloon;
import com.shirrine.patterns.foobarmv.Sport;
import com.shirrine.patterns.foobarmv.Vehicle;
import com.shirrine.patterns.foobarmv.flyweight.EngineFlyweightFactory;

/**
 * A factory for building cars.
 *
 * @author Shirrine
 */
public class CarFactory extends VehicleFactory {

    private static final int ENGINE_SIZE_ECONOMICAL = 1300;
    private static final int ENGINE_SIZE_MIDRANGE = 1600;
    private static final int ENGINE_SIZE_POWERFUL = 2000;

    /**
     * Selects a car based on the style preference.
     *
     * @param style
     *         the driving style
     * @return the car
     */
    @Override
    protected Vehicle selectVehicle(final DrivingStyle style) {

        if (style == DrivingStyle.ECONOMICAL) {
            return new Saloon(
                    EngineFlyweightFactory.INSTANCE.getStandardEngine(
                            ENGINE_SIZE_ECONOMICAL));
        } else if (style == DrivingStyle.MIDRANGE) {
            return new Coupe(
                    EngineFlyweightFactory.INSTANCE.getStandardEngine(
                            ENGINE_SIZE_MIDRANGE));
        } else {
            return new Sport(
                    EngineFlyweightFactory.INSTANCE.getTurboEngine(
                            ENGINE_SIZE_POWERFUL));
        }
    }
}
