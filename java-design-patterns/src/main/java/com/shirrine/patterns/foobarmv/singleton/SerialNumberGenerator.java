package com.shirrine.patterns.foobarmv.singleton;

/**
 * Serial number generator.
 *
 * @author Shirrine
 */
public enum SerialNumberGenerator {

    /**
     * Single instance of a serial number generator.
     */
    INSTANCE;

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
