package com.shirrine.patterns.foobarmv.chainofresponsibility;

/**
 * Handle emails.
 *
 * @author Shirrine
 */
public abstract class AbstractEmailHandler implements EmailHandler {

    private EmailHandler nextHandler;

    /**
     * Sets the next handler that could handle the email.
     *
     * @param nextHandler the next handler
     */
    @Override
    public void setNextHandler(final EmailHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * Determines if the email can be processed in this handler or
     * should be passed to the next handler.
     *
     * @param email the email to process
     * @return an automatic response message
     */
    @Override
    public String processHandler(final String email) {

        boolean wordFound = false;

        // Indicate if any of the matching words are supported by this handler
        if (matchingWords().length == 0) {
            wordFound = true;
        } else {
            for (String word : matchingWords()) {
                if (email.contains(word)) {
                    wordFound = true;
                    break;
                }
            }
        }

        // Select a handler
        if (wordFound) {
            return handleEmail(email);
        } else {

            // Hot potato!
            return nextHandler.processHandler(email);
        }
    }

    /**
     * Gets an array of words supported by the handler.
     *
     * @return the associated words
     */
    protected abstract String[] matchingWords();

    /**
     * Handles the email with this handler.
     *
     * @param email the email to process
     * @return an automatic response message
     */
    protected abstract String handleEmail(String email);

    /**
     * Chains all handlers then processes the email.
     *
     * @param email the email to process
     * @return an automatic response message
     */
    public static String processEmail(final String email) {

        // Create the handlers
        EmailHandler spam = new SpamEmailHandler();
        EmailHandler sales = new SalesEmailHandler();
        EmailHandler service = new ServiceEmailHandler();
        EmailHandler manager = new ManagerEmailHandler();
        EmailHandler general = new GeneralInquiriesEmailHandler();

        // Chain the handlers
        spam.setNextHandler(sales);
        sales.setNextHandler(service);
        service.setNextHandler(manager);
        manager.setNextHandler(general);

        // Start the process
        return spam.processHandler(email);
    }


}
