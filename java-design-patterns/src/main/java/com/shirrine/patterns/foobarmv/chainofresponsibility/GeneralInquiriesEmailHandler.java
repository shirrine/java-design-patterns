package com.shirrine.patterns.foobarmv.chainofresponsibility;

/**
 * Handle general email inquiries.
 *
 * @author Shirrine
 */
public class GeneralInquiriesEmailHandler extends AbstractEmailHandler {

    /**
     * Gets an array of words supported by the handler.
     *
     * @return the associated words
     */
    @Override
    protected String[] matchingWords() {
        return new String[0]; // match anything
    }

    /**
     * Handles the email in this handler.
     *
     * @param email
     *         the email to process
     */
    @Override
    protected void handle(final String email) {
        System.out.println("Email handled by general inquiries.");
    }
}
