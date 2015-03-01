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
     * Handles the email with this handler.
     *
     * @param email
     *         the email to process
     * @return an automatic response message
     */
    @Override
    protected String handleEmail(final String email) {
        String message = "Email handled by sales department";
        System.out.println(message);
        return message;
    }
}
