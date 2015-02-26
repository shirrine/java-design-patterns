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
     */
    @Override
    public void processHandler(final String email) {

        // FIXME: I don't quite like this method name

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
            handle(email);
        } else {

            // Hot potato!
            nextHandler.processHandler(email);
        }
    }

    /**
     * Gets an array of words supported by the handler.
     *
     * @return the associated words
     */
    protected abstract String[] matchingWords();

    /**
     * Handles the email in this handler.
     *
     * @param email the email to process
     */
    protected abstract void handle(String email);

    /**
     * Chains the handlers and processes the email.
     *
     * @param email the email to process
     */
    public static void process(final String email) {

        // FIXME: I don't quite like this method name

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
        spam.processHandler(email);
    }


}
