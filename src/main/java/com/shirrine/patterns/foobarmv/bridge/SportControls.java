package com.shirrine.patterns.foobarmv.bridge;

import com.shirrine.patterns.foobarmv.flyweight.Engine;

/**
 * Sport vehicle controls.
 *
 * @author Shirrine
 */
public class SportControls extends AbstractDriverControls {

    /**
     * Creates sport controls for the engine.
     *
     * @param engine the engine to control
     */
    public SportControls(final Engine engine) {
        super(engine);
    }

    /**
     * Accelerates the vehicle twice.
     */
    public void accelerateHard() {

        // Calls the methods in the bridge (i.e. AbstractDriverControls)
        // rather than calling the engine directly. That way the engine
        // implementation can change without requiring this implementation
        // to change.
        accelerate();
        accelerate();
    }

}
