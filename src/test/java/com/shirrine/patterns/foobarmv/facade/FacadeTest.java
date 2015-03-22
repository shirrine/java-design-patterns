package com.shirrine.patterns.foobarmv.facade;

import org.junit.*;
import com.shirrine.patterns.foobarmv.Vehicle;
import com.shirrine.patterns.foobarmv.factory.VehicleFactory;
import static com.shirrine.patterns.foobarmv.factory.VehicleFactory.*;

/**
 * Test the facade pattern.
 *
 * @author Shirrine
 */
public class FacadeTest {

    /**
     * Tests the facade pattern for prepping a car for sale.
     */
    @Test
    public void testFacade() {

        // Gotta have a hot red car ;-)
        Vehicle vehicle = VehicleFactory.make(
                Category.CAR,
                DrivingStyle.POWERFUL,
                Vehicle.Color.RED);

        // Prepare the car
        VehicleFacade facade = new VehicleFacade();
        facade.prepareForSale(vehicle);
    }

}
