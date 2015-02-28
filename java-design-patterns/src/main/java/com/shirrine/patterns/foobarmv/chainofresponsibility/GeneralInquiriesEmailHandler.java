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
     * Handles the email with this handler.
     *
     * @param email
     *         the email to process
     * @return an automatic response message
     */
    @Override
    protected String handleEmail(final String email) {
        String message = "Email handled by general inquiries.";
        System.out.println(message);
        return message;
    }
}
