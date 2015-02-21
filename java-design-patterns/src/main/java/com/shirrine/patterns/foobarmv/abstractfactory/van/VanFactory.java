package com.shirrine.patterns.foobarmv.abstractfactory.van;

import com.shirrine.patterns.foobarmv.abstractfactory.AbstractVehicleFactory;
import com.shirrine.patterns.foobarmv.abstractfactory.Body;
import com.shirrine.patterns.foobarmv.abstractfactory.Chassis;
import com.shirrine.patterns.foobarmv.abstractfactory.Windows;

/**
 * Manufacture a van.
 *
 * @author Shirrine
 *
 */
public class VanFactory extends AbstractVehicleFactory {

    /*
     * (non-Javadoc)
     *
     * @see
     * patterns.abstractfactory.foobarmv.AbstractVehicleFactory#createBody()
     */
    @Override
    public Body createBody() {
        return new VanBody();
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * patterns.abstractfactory.foobarmv.AbstractVehicleFactory#createChassis()
     */
    @Override
    public Chassis createChassis() {
        return new VanChassis();
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * patterns.abstractfactory.foobarmv.AbstractVehicleFactory#createWindows()
     */
    @Override
    public Windows createWindows() {
        return new VanWindows();
    }

}
