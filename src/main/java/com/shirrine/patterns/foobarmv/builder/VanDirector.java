package com.shirrine.patterns.foobarmv.builder;

import com.shirrine.patterns.foobarmv.Vehicle;

/**
 * Director for building vans.
 *
 * @author Shirrine
 *
 */
public class VanDirector extends VehicleDirector {

    /*
     * (non-Javadoc)
     *
     * @see
     * com.shirrine.patterns.foobarmv.builder.VehicleDirector#build(com.shirrine
     * .patterns.foobarmv.builder.VehicleBuilder)
     */
    @Override
    public Vehicle build(final VehicleBuilder builder) {

        // How'd this chain sneak in here ;-)
        return builder.buildChassis().buildBody().buildReinforcedStorageArea()
                .buildWindows().getVehicle();
    }

}
