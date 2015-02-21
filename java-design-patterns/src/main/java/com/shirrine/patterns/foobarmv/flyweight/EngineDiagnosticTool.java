/**
 * Learning the FlyWeight design pattern...
 */
package com.shirrine.patterns.foobarmv.flyweight;

/**
 * An engine diagnostic tool.
 *
 * @author Shirrine
 *
 */
public class EngineDiagnosticTool implements DiagnosticTool {

    private static final int MAX_TIME = 5000;

    /*
     * (non-Javadoc)
     *
     * @see
     * com.shirrine.patterns.flyweight.DiagnosticTool#runDiagnosis(java.lang
     * .Object)
     */
    @Override
    public void runDiagnosis(final Object obj) {
        System.out.println("Starting engine diagnostic tool for " + obj);

        try {
            // Sleep for 5 seconds
            Thread.sleep(MAX_TIME);

            // Print status
            System.out.println("Engine diagnosis complete");

        } catch (InterruptedException e) {

            // Print status
            System.out.println("Engine diagnosis interrupted!");
        }
    }

}
