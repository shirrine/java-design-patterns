/*
 * Learning the FlyWeight pattern...
 */
package com.shirrine.patterns.foobarmv.flyweight;

/**
 * A vehicle engine.
 *
 * @author Shirrine
 *
 */
public interface Engine {

    /**
     * Engine size 1600.
     */
    int ENGINE_SIZE_1300 = 1300;

    /**
     * Engine size 1600.
     */
    int ENGINE_SIZE_1600 = 1600;

    /**
     * Engine size 2000.
     */
    int ENGINE_SIZE_2000 = 2000;

    /**
     * Engine size 2200.
     */
    int ENGINE_SIZE_2200 = 2200;

    /**
     * Engine size 2500.
     */
    int ENGINE_SIZE_2500 = 2500;

    /**
     * Gets the engine size.
     *
     * @return the engine size
     */
    int getSize(); // Intrinsic state

    /**
     * Indicates if the engine is turbo.
     *
     * @return true, if turbo
     */
    boolean isTurbo(); // Intrinsic state

    /**
     * Diagnoses the engine with the specified tool.
     *
     * @param tool
     *            the tool to diagnose the engine
     */
    void diagnose(final DiagnosticTool tool); // Extrinsic state

    /**
     * Starts the engine.
     */
    void start();

    /**
     * Stops the engine.
     */
    void stop();

    /**
     * Increases the engine power.
     */
    void increasePower();

    /**
     * Decreases the engine power.
     */
    void decreasePower();

}
