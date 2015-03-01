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
     * Handles the email with this handler.
     *
     * @param email
     *         the email to process
     * @return an automatic response message
     */
    @Override
    protected String handleEmail(final String email) {
        String message = "This is a spam email.";
        System.out.println(message);
        return message;
    }
}
