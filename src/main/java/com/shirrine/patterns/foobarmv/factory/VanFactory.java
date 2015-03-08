package com.shirrine.patterns.foobarmv.factory;

import com.shirrine.patterns.foobarmv.BoxVan;
import com.shirrine.patterns.foobarmv.Pickup;
import com.shirrine.patterns.foobarmv.Vehicle;
import com.shirrine.patterns.foobarmv.flyweight.EngineFlyweightFactory;

/**
 * A factory for buiding vans.
 *
 * @author Shirrine
 */
public class VanFactory extends VehicleFactory {

    private static final int ENGINE_SIZE_ECONOMICAL = 2200;
    private static final int ENGINE_SIZE_POWERFUL = 2500;

    /**
     * Selects a van based on the style preference.
     *
     * @param style
     *         the driving style
     * @return the van
     */
    @Override
    protected Vehicle selectVehicle(final DrivingStyle style) {

        if (style == DrivingStyle.ECONOMICAL
            || style == DrivingStyle.MIDRANGE) {

            return new BoxVan(
                    EngineFlyweightFactory.INSTANCE.getStandardEngine(
                            ENGINE_SIZE_ECONOMICAL));
        } else {
            return new Pickup(
                    EngineFlyweightFactory.INSTANCE.getStandardEngine(
                            ENGINE_SIZE_POWERFUL));
        }
    }

}
