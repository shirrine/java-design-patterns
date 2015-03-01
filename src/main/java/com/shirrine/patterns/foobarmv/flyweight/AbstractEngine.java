/*
 * Learning the FlyWeight design pattern...
 */
package com.shirrine.patterns.foobarmv.flyweight;

/**
 * An engine.
 *
 * @author Shirrine
 *
 */
public abstract class AbstractEngine implements Engine {

    private int size;
    private boolean turbo;

    /**
     * Creates an engine.
     *
     * @param size
     *            the size of the engine
     * @param turbo
     *            true, if the engine is turbo
     */
    public AbstractEngine(final int size, final boolean turbo) {
        this.size = size;
        this.turbo = turbo;
    }

    /**
     * Gets the size of the engine.
     *
     * @return the size of the engine
     */
    @Override
    public int getSize() {
        return this.size;
    }

    /**
     * Indicates if the engine is standard or turbo.
     *
     * @return true if the engine is turbo
     */
    @Override
    public boolean isTurbo() {
        return this.turbo;
    }

    /*
     * Default diagnose functionality for sub-classes (non-Javadoc)
     *
     * @see
     * com.shirrine.patterns.flyweight.Engine#diagnose(com.shirrine.patterns
     * .flyweight.DiagnosticTool)
     */
    @Override
    public void diagnose(final DiagnosticTool tool) {

        // Perform diagnoses on the instantiated object
        tool.runDiagnosis(this);
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " (" + size + ")";
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object obj) {
        if (obj != null && obj instanceof AbstractEngine) {
            return this.toString().equals(((AbstractEngine) obj).toString());
        } else {
            return false;
        }
    }

}
