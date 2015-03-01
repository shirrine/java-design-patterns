/*
 * Adapting stuff...
 */
package com.shirrine.patterns.foobarmv.adapter;

import com.shirrine.patterns.foobarmv.flyweight.AbstractEngine;

/**
 * Adapter from SuperGreenEngine (third-party) to AbstractEngine.
 *
 * @author Shirrine
 *
 */
public class SuperGreenEngineAdapter extends AbstractEngine {

    /**
     * Adapts from <code>SuperGreenEngine</code> to <code>AbstractEngine</code>.
     *
     * @param greenEngine the engine to adapt from
     */
    public SuperGreenEngineAdapter(final SuperGreenEngine greenEngine) {
        super(greenEngine.getEngineSize(), false);
    }

}
