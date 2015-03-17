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
    private boolean running;
    private int power;

    /**
     * The maximum engine power.
     */
    public static final int MAX_POWER = 10;

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
        running = false;
        power = 0;
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
        return obj != null && obj instanceof AbstractEngine
                && this.toString().equals(obj.toString());
    }

    /**
     * Starts the engine.
     */
    @Override
    public void start() {
        running = true;
        System.out.println("Engine started.");
    }

    /**
     * Stops the engine.
     */
    @Override
    public void stop() {
        running = false;
        power = 0;
        System.out.println("Engine stopped.");
    }

    /**
     * Increases the engine power.
     */
    @Override
    public void increasePower() {
        if (running && power < MAX_POWER) {
            power++;
            System.out.println("Engine power increased to " + power);
        }
    }

    /**
     * Decreases the engine power.
     */
    @Override
    public void decreasePower() {
        if (running && power > 0) {
            power--;
            System.out.println("Engine power decreased to " + power);
        }
    }

}
