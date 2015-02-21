package com.shirrine.patterns.foobarmv.abstractfactory.car;

import com.shirrine.patterns.foobarmv.abstractfactory.AbstractVehicleFactory;
import com.shirrine.patterns.foobarmv.abstractfactory.Body;
import com.shirrine.patterns.foobarmv.abstractfactory.Chassis;
import com.shirrine.patterns.foobarmv.abstractfactory.Windows;

/**
 * Manufacture a car.
 *
 * @author Shirrine
 *
 */
public class CarFactory extends AbstractVehicleFactory {

    /*
     * (non-Javadoc)
     *
     * @see
     * patterns.abstractfactory.foobarmv.AbstractVehicleFactory#createBody()
     */
    @Override
    public Body createBody() {
        return new CarBody();
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * patterns.abstractfactory.foobarmv.AbstractVehicleFactory#createChassis()
     */
    @Override
    public Chassis createChassis() {
        return new CarChassis();
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * patterns.abstractfactory.foobarmv.AbstractVehicleFactory#createWindows()
     */
    @Override
    public Windows createWindows() {
        return new CarWindows();
    }

}
