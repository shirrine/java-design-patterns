package com.shirrine.patterns.foobarmv.command;

/**
 * Execute commands using speech recognition.
 *
 * @author Shirrine
 */
public class SpeechRecognizer {

    private Command upCommand, downCommand;

    /**
     * Sets the up and down commands.
     *
     * @param upCommand the up command to execute
     * @param downCommand the down command to execute
     */
    public void setCommands(final Command upCommand,
                            final Command downCommand) {
        this.upCommand = upCommand;
        this.downCommand = downCommand;
    }

    /**
     * Executes the up command.
     */
    public void hearUpSpoken() {
        upCommand.execute();
    }

    /**
     * Executes the down command.
     */
    public void hearDownSpoken() {
        downCommand.execute();
    }

}
