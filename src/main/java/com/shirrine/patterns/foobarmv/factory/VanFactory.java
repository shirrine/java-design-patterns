package com.shirrine.patterns.foobarmv.factory;

import com.shirrine.patterns.foobarmv.BoxVan;
import com.shirrine.patterns.foobarmv.Pickup;
import com.shirrine.patterns.foobarmv.Vehicle;
import com.shirrine.patterns.foobarmv.flyweight.Engine;
import com.shirrine.patterns.foobarmv.flyweight.EngineFlyweightFactory;

/**
 * A factory for buiding vans.
 *
 * @author Shirrine
 */
public class VanFactory extends VehicleFactory {

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
                            Engine.ENGINE_SIZE_2200));
        } else {
            return new Pickup(
                    EngineFlyweightFactory.INSTANCE.getStandardEngine(
                            Engine.ENGINE_SIZE_2500));
        }
    }

}
