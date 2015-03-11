package com.shirrine.patterns.foobarmv.factory;

import com.shirrine.patterns.foobarmv.Coupe;
import com.shirrine.patterns.foobarmv.Saloon;
import com.shirrine.patterns.foobarmv.Sport;
import com.shirrine.patterns.foobarmv.Vehicle;
import com.shirrine.patterns.foobarmv.flyweight.Engine;
import com.shirrine.patterns.foobarmv.flyweight.EngineFlyweightFactory;

/**
 * A factory for building cars.
 *
 * @author Shirrine
 */
public class CarFactory extends VehicleFactory {

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
                            Engine.ENGINE_SIZE_1300));
        } else if (style == DrivingStyle.MIDRANGE) {
            return new Coupe(
                    EngineFlyweightFactory.INSTANCE.getStandardEngine(
                            Engine.ENGINE_SIZE_1600));
        } else {
            return new Sport(
                    EngineFlyweightFactory.INSTANCE.getTurboEngine(
                            Engine.ENGINE_SIZE_2000));
        }
    }
}
