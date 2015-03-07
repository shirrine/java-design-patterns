package com.shirrine.patterns.foobarmv.decorator;

import com.shirrine.patterns.foobarmv.Saloon;
import com.shirrine.patterns.foobarmv.Vehicle;
import com.shirrine.patterns.foobarmv.flyweight.EngineFlyweightFactory;
import org.junit.Test;

/**
 * Test a vehicle decorator.
 *
 * @author Shirrine
 */
public class DecoratorTest {

    /**
     * Tests all currently availabe add-ons.
     */
    @Test
    public void test1() {

        // Create car
        Vehicle myCar = new Saloon(
                EngineFlyweightFactory.INSTANCE.getStandardEngine(1300));
        System.out.println(myCar);

        // Paint car
        myCar.paint(Vehicle.Color.BLUE);
        System.out.println(myCar);

        // Add air conditioning
        myCar = new AirConditionedVehicle(myCar);
        System.out.println(myCar);

        // Add alloy wheels
        myCar = new AlloyWheeledVehicle(myCar);
        System.out.println(myCar);

        // Add leather seats
        myCar = new LeatherSeatedVehicle(myCar);
        System.out.println(myCar);

        // Add metallic paint
        myCar = new MetallicPaintedVehicle(myCar);
        System.out.println(myCar);

        // Add GPS navigation
        myCar = new GPSNavigatedVehicle(myCar);
        System.out.println(myCar);
    }

    /**
     * Tests the air conditioner.
     */
    @Test
    public void test2() {

        // Create car
        Vehicle myCar = new Saloon(
                EngineFlyweightFactory.INSTANCE.getStandardEngine(1300));
        System.out.println(myCar);

        // Paint car ... My favorite color ;-)
        myCar.paint(Vehicle.Color.BLUE);
        System.out.println(myCar);

        // Add air conditioning
        myCar = new AirConditionedVehicle(myCar);
        System.out.println(myCar);

        // Get comfortable :-)
        AirConditionedVehicle loadedCar = (AirConditionedVehicle) myCar;
        loadedCar.startAirConditioner();
        loadedCar.increaseTemperature();
        loadedCar.increaseTemperature();
        loadedCar.increaseTemperature();
        loadedCar.decreaseTemperature();
        loadedCar.stopAirConditioner();

    }
}
