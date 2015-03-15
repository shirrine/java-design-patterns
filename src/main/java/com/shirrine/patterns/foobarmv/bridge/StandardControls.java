package com.shirrine.patterns.foobarmv.bridge;

import com.shirrine.patterns.foobarmv.flyweight.Engine;

/**
 * Standard vehicle controls.
 *
 * @author Shirrine
 */
public class StandardControls extends AbstractDriverControls {

    /**
     * Creates standard controls for the engine.
     *
     * @param engine the engine to control
     */
    public StandardControls(final Engine engine) {
        super(engine);
    }

    // Instance methods are inherited from the parent.
}
