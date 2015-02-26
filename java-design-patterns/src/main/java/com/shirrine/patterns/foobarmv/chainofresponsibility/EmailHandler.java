package com.shirrine.patterns.foobarmv.chainofresponsibility;

/**
 * Interface for email processing.
 *
 * @author Shirrine
 */
public interface EmailHandler {

    /**
     * Sets the next handler to handle the email.
     *
     * @param nextHandler the next handler
     */
    void setNextHandler(EmailHandler nextHandler);

    /**
     * Determines if the email can be processed in this handler or
     * should be passed to the next handler.
     *
     * @param email the email to process
     */
    void processHandler(String email);
}
