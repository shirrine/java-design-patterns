package com.shirrine.patterns.foobarmv.chainofresponsibility;

/**
 * Handle spam emails.
 *
 * @author Shirrine
 */
public class SpamEmailHandler extends AbstractEmailHandler {

    /**
     * Gets an array of words supported by the handler.
     *
     * @return the associated words
     */
    @Override
    protected String[] matchingWords() {
        return new String[]{"pills", "viagra", "medicines"};
    }

    /**
     * Handles the email in this handler.
     *
     * @param email
     *         the email to process
     */
    @Override
    protected void handle(final String email) {
        System.out.println("This is a spam email.");
    }
}
