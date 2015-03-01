package com.shirrine.patterns.foobarmv.adapter;

/**
 * Third-party Super Green Engine.
 *
 * @author Shirrine
 *
 */
public class SuperGreenEngine {

    private int size;

    /**
     * Creates an engine with the specified size.
     *
     * @param size the engine size
     */
    public SuperGreenEngine(final int size) {
        this.size = size;
    }

    /**
     * Returns the engine size.
     *
     * @return the engine size
     */
    public int getEngineSize() {
        return this.size;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "SUPER ENGINE " + size;
    }

}
