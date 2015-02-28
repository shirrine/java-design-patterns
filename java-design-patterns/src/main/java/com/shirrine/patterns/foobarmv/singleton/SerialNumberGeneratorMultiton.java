package com.shirrine.patterns.foobarmv.singleton;

/**
 * Serial number generator for vehicles and engines.
 *
 * @author Shirrine
 */
public enum SerialNumberGeneratorMultiton {

    /**
     * Serial number generator for vehicles.
     */
    VEHICLE,

    /**
     * Serial number generator for engines.
     */
    ENGINE;

    // Instance variable
    private int count;

    /**
     * Increment the serial number.
     *
     * @return the next serial number
     */
    public synchronized int getNextSerial() {
        return ++count;
    }

}
