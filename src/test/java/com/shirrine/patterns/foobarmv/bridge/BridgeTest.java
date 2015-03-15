package com.shirrine.patterns.foobarmv.bridge;

import com.shirrine.patterns.foobarmv.flyweight.Engine;
import com.shirrine.patterns.foobarmv.flyweight.EngineFlyweightFactory;
import org.junit.Before;
import org.junit.Test;

/**
 * Test the bridge pattern.
 *
 * @author Shirrine
 */
public class BridgeTest {

    private Engine engine;

    /**
     * Creates a standard engine.
     */
    @Before
    public void setup() {

        // Create an engine
        engine = EngineFlyweightFactory.INSTANCE.getStandardEngine(
                Engine.ENGINE_SIZE_1300);
    }

    /**
     * Tests the bridge pattern with standard controls.
     */
    @Test
    public void testStandard() {

        StandardControls standardControls = new StandardControls(engine);
        standardControls.ignitionOn();
        standardControls.accelerate();
        standardControls.brake();
        standardControls.ignitionOff();

    }

    /**
     * Tests the bridge pattern with sport controls.
     */
    @Test
    public void testSport() {

        SportControls sportControls = new SportControls(engine);
        sportControls.ignitionOn();
        sportControls.accelerate();
        sportControls.accelerateHard();
        sportControls.brake();
        sportControls.ignitionOff();

    }

}
