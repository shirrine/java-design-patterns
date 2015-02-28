package com.shirrine.patterns.foobarmv.singleton;

/**
 * Traditional serial number generator.
 *
 * @author Shirrine
 */
public final class SerialNumberGeneratorTraditional {

    private static SerialNumberGeneratorTraditional instance;
    private int count;

    /**
     * Instantiates a serial number generator.
     */
    private SerialNumberGeneratorTraditional() {

    }

    /**
     * Gets an instance of the serial number generator. This method
     * is synchronized for multi-threaded operations.
     *
     * @return the serial number generator
     */
    public static synchronized SerialNumberGeneratorTraditional getInstance() {

        // Create an instance if it does not already exist
        if (instance == null) {
            instance = new SerialNumberGeneratorTraditional();
        }

        // Return the instance
        return instance;
    }

    /**
     * Increment the serial number.
     *
     * @return the next serial number
     */
    public synchronized int getNextSerial() {
        return ++count;
    }

}
