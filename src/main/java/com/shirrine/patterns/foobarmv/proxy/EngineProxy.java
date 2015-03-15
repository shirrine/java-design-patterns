package com.shirrine.patterns.foobarmv.proxy;

import com.shirrine.patterns.foobarmv.flyweight.Engine;
import com.shirrine.patterns.foobarmv.flyweight.DiagnosticTool;
/**
 * Proxy that performs engine diagnosis in a separate thread from the
 * main thread.
 *
 * @author Shirrine
 */
public class EngineProxy implements Engine {

    private Engine engine;

    /**
     * Creates an engine proxy to offload diagnosis to its own thread.
     *
     * @param engine the engine to proxy
     */
    public EngineProxy(final Engine engine) {
        this.engine = engine;
    }

    @Override
    public int getSize() {

        return engine.getSize();
    }

    /**
     * Runs diagnostic tool in a separate thread.
     *
     * @param tool the diagnostic tool to run
     */
    @Override
    public void diagnose(final DiagnosticTool tool) {

        // Run as a separate thread
        Thread thread = new Thread(() -> {
            System.out.println("(Running tool as thread)");
            engine.diagnose(tool);
        });
        thread.start();
        System.out.println("EngineProxy diagnose() method finished");
    }

    /**
     * Indicates if the engine is turbo.
     *
     * @return true, if turbo
     */
    @Override
    public boolean isTurbo() {
        return engine.isTurbo();
    }

    /**
     * Starts the engine.
     */
    @Override
    public void start() {
        engine.start();
    }

    /**
     * Stops the engine.
     */
    @Override
    public void stop() {
        engine.stop();
    }

    /**
     * Increases the engine power.
     */
    @Override
    public void increasePower() {
        engine.increasePower();
    }

    /**
     * Decreases the engine power.
     */
    @Override
    public void decreasePower() {
        engine.decreasePower();
    }

    @Override
    public String toString() {

        /*
         * Override toString to return the engine class name rather
         * than the proxy class name. ;-)
         */
        return engine.getClass().getSimpleName()
                + " (" + engine.getSize() + ")";
    }

}
