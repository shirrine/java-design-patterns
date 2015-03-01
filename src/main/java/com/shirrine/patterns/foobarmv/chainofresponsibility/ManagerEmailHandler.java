package com.shirrine.patterns.foobarmv.chainofresponsibility;

/**
 * Handle complaint emails.
 *
 * @author Shirrine
 */
public class ManagerEmailHandler extends AbstractEmailHandler {

    /**
     * Gets an array of words supported by the handler.
     *
     * @return the associated words
     */
    @Override
    protected String[] matchingWords() {
        return new String[]{"complain", "bad"};
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
        String message = "Email handled by manager.";
        System.out.println(message);
        return message;
    }
}
