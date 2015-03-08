package com.shirrine.patterns.foobarmv.factory;

import com.shirrine.patterns.foobarmv.*;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

/**
 * Tests the factory pattern.
 *
 * @author Shirrine
 */
public class FactoryTest {

    /**
     * Tests the creation of an economical car.
     */
    @Test
    public void testEconomicalCar() {

        VehicleFactory factory = new CarFactory();
        Vehicle car = factory.build(VehicleFactory.DrivingStyle.ECONOMICAL,
                      Vehicle.Color.BLUE);

        System.out.println(car);

        assertThat(car, is(instanceOf(Saloon.class)));
        assertThat(car.getColor(), is(Vehicle.Color.BLUE));
        assertFalse(car.getEngine().isTurbo());
        assertThat(car.getEngine().getSize(), is(1300));
    }

    /**
     * Tests the creation of a midrange car.
     */
    @Test
    public void testMidrangeCar() {

        VehicleFactory factory = new CarFactory();
        Vehicle car = factory.build(VehicleFactory.DrivingStyle.MIDRANGE,
                Vehicle.Color.RED);

        System.out.println(car);

        assertThat(car, is(instanceOf(Coupe.class)));
        assertThat(car.getColor(), is(Vehicle.Color.RED));
        assertFalse(car.getEngine().isTurbo());
        assertThat(car.getEngine().getSize(), is(1600));
    }

    /**
     * Tests the creation of a powerful car.
     */
    @Test
    public void testPowerfulCar() {

        VehicleFactory factory = new CarFactory();
        Vehicle car = factory.build(VehicleFactory.DrivingStyle.POWERFUL,
                Vehicle.Color.BLACK);

        System.out.println(car);

        assertThat(car, is(instanceOf(Sport.class)));
        assertThat(car.getColor(), is(Vehicle.Color.BLACK));
        assertTrue(car.getEngine().isTurbo());
        assertThat(car.getEngine().getSize(), is(2000));
    }

    /**
     * Tests the creation of an economical van.
     */
    @Test
    public void testEconomicalVan() {

        VehicleFactory factory = new VanFactory();
        Vehicle van = factory.build(VehicleFactory.DrivingStyle.ECONOMICAL,
                Vehicle.Color.SILVER);

        System.out.println(van);

        assertThat(van, is(instanceOf(BoxVan.class)));
        assertThat(van.getColor(), is(Vehicle.Color.SILVER));
        assertFalse(van.getEngine().isTurbo());
        assertThat(van.getEngine().getSize(), is(2200));
    }

    /**
     * Tests the creation of a midrange van.
     */
    @Test
    public void testMidrangeVan() {

        VehicleFactory factory = new VanFactory();
        Vehicle van = factory.build(VehicleFactory.DrivingStyle.MIDRANGE,
                Vehicle.Color.WHITE);

        System.out.println(van);

        assertThat(van, is(instanceOf(BoxVan.class)));
        assertThat(van.getColor(), is(Vehicle.Color.WHITE));
        assertFalse(van.getEngine().isTurbo());
        assertThat(van.getEngine().getSize(), is(2200));
    }

    /**
     * Tests the creation of a powerful van.
     */
    @Test
    public void testPowerfulVan() {

        VehicleFactory factory = new VanFactory();
        Vehicle van = factory.build(VehicleFactory.DrivingStyle.POWERFUL,
                Vehicle.Color.GREEN);

        System.out.println(van);

        assertThat(van, is(instanceOf(Pickup.class)));
        assertThat(van.getColor(), is(Vehicle.Color.GREEN));
        assertFalse(van.getEngine().isTurbo());
        assertThat(van.getEngine().getSize(), is(2500));
    }

}
