package com.shirrine.patterns.foobarmv.singleton;

import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

/**
 * Test a serial number generator Singleton.
 *
 * @author Shirrine
 */
public class SingletonTest {

    /**
     * Tests a traditional, factory method singleton.
     */
    @Test
    public void testTraditional(){

        System.out.println("Using traditional singleton");

        // Get an instance of the generator
        SerialNumberGeneratorTraditional generator =
                SerialNumberGeneratorTraditional.getInstance();
        assertThat(generator.getNextSerial(), is(1));
        assertThat(generator.getNextSerial(), is(2));
        assertThat(generator.getNextSerial(), is(3));

        // Request another generator (returns the same instance)
        SerialNumberGeneratorTraditional generator2 =
                SerialNumberGeneratorTraditional.getInstance();
        assertThat(generator2.getNextSerial(), is(not(1))); // Should be 4
        assertThat(generator2.getNextSerial(), is(5));
        assertThat(generator2.getNextSerial(), is(6));
    }

    /**
     * Tests an enum-based singleton.
     */
    @Test
    public void testEnum() {

        System.out.println("Using enum singleton");

        // Generate serial numbers
        assertThat(SerialNumberGenerator.INSTANCE.getNextSerial(), is(1));
        assertThat(SerialNumberGenerator.INSTANCE.getNextSerial(), is(2));
        assertThat(SerialNumberGenerator.INSTANCE.getNextSerial(), is(3));

        // MUCH cleaner (and more intuitive) than the factory method!
    }

    /**
     * Tests an enum-based multiton.
     */
    @Test
    public void testMultiton() {

        System.out.println("Using multiton singleton");

        // Generate serial numbers
        assertThat(SerialNumberGeneratorMultiton.VEHICLE.getNextSerial(), is(1));
        assertThat(SerialNumberGeneratorMultiton.VEHICLE.getNextSerial(), is(2));
        assertThat(SerialNumberGeneratorMultiton.ENGINE.getNextSerial(), is(1));
        assertThat(SerialNumberGeneratorMultiton.VEHICLE.getNextSerial(), is(3));
        assertThat(SerialNumberGeneratorMultiton.ENGINE.getNextSerial(), is(2));
        assertThat(SerialNumberGeneratorMultiton.ENGINE.getNextSerial(), is(3));
    }

}
