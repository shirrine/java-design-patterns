package com.shirrine.patterns.foobarmv.builder;

import com.shirrine.patterns.foobarmv.Vehicle;

/**
 * Director for building cars.
 *
 * @author Shirrine
 *
 */
public class CarDirector extends VehicleDirector {

    /*
     * (non-Javadoc)
     *
     * @see
     * com.shirrine.patterns.foobarmv.builder.VehicleDirector#build(com.shirrine
     * .patterns.foobarmv.builder.VehicleBuilder)
     */
    @Override
    public Vehicle build(final VehicleBuilder builder) {

        // So... Maybe this chaining is a bit overkill! But still kinda cool :-D
        return builder.buildChassis().buildBody().buildPassengerArea()
                .buildBoot().buildWindows().getVehicle();
    }
}
