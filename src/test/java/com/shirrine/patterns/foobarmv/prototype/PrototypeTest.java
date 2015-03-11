package com.shirrine.patterns.foobarmv.prototype;

import com.shirrine.patterns.foobarmv.Vehicle;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * Tests the prototype pattern.
 *
 * @author Shirrine
 */
public class PrototypeTest {

    /**
     * Tests the vehicle manager with the saloon, coupe, sport,
     * boxvan and pickup.
     */
    @Test
    public void test1() {

        VehicleManager manager = new VehicleManager();
        Vehicle car1 = manager.createSaloon();
        assertEquals(car1, manager.createSaloon());

        Vehicle car2 = manager.createSport();
        assertThat(car2, is(equalTo(manager.createSport())));
        assertThat(car2, is(not(equalTo(car1))));

        Vehicle car3 = manager.createCoupe();
        assertThat(car3, is(equalTo(manager.createCoupe())));
        assertThat(car3, is(not(equalTo(car2))));

        Vehicle van1 = manager.createBoxVan();
        assertThat(van1, is(equalTo(manager.createBoxVan())));
        assertThat(van1, is(not(equalTo(car3))));

        Vehicle van2 = manager.createPickup();
        assertThat(van2, is(equalTo(manager.createPickup())));
        assertThat(van2, is(not(equalTo(van1))));

        // So... is(not(equalTo... is a bit overkill but I'm trying
        // to get used to the Matchers ;-)

    }

}
