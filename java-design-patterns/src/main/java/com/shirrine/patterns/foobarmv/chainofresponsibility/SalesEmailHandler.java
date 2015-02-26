package com.shirrine.patterns.foobarmv.chainofresponsibility;

/**
 * Handle sales emails.
 *
 * @author Shirrine
 */
public class SalesEmailHandler extends AbstractEmailHandler {

    /**
     * Gets an array of words supported by the handler.
     *
     * @return the associated words
     */
    @Override
    protected String[] matchingWords() {
        return new String[]{"buy", "purchase"};
    }

    /**
     * Handles the email in this handler.
     *
     * @param email
     *         the email to process
     */
    @Override
    protected void handle(final String email) {
        System.out.println("Email handled by sales department");
    }
}
