package com.shirrine.patterns.foobarmv.facade;

import com.shirrine.patterns.foobarmv.Vehicle;

/**
 * Documentation for a vehicle.
 *
 * @author Shirrine
 */
public final class Documentation {

    /**
     * Hidden constructor.
     */
    private Documentation() {

        // No-op
    }

    /**
     * Prints a vehicle brochure.
     *
     * @param vehicle the vehicle
     */
    public static void printBrochure(final Vehicle vehicle) {
        System.out.println("Brochure printed");
    }

}
