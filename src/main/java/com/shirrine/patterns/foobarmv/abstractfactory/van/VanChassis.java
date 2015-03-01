package com.shirrine.patterns.foobarmv.abstractfactory.van;

import com.shirrine.patterns.foobarmv.abstractfactory.Chassis;

/**
 * Van implementation of the <code>Chassis</code> interface.
 *
 * @author Shirrine
 *
 */
public class VanChassis implements Chassis {

    /*
     * (non-Javadoc)
     *
     * @see patterns.abstractfactory.example1.Chassis#getChassisParts()
     */
    @Override
    public String getChassisParts() {
        return "Van chassis parts!";
    }

}
