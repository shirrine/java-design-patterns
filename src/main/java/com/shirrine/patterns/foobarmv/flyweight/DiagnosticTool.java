/*
 * Learning the FlyWeight design pattern...
 */
package com.shirrine.patterns.foobarmv.flyweight;

/**
 * A diagnostic tool.
 *
 * @author Shirrine
 *
 */
public interface DiagnosticTool {

    /**
     * Performs engine diagnosis.
     *
     * @param obj
     *            the engine in which to perform diagnosis
     */
    void runDiagnosis(final Object obj);

}
