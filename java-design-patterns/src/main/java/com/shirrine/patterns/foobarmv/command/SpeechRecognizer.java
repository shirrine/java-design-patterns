package com.shirrine.patterns.foobarmv.command;

/**
 * Execute commands using speech recognition.
 *
 * @author Shirrine
 */
public class SpeechRecognizer {

    private Command upCommand, downCommand;
    private Command priorCommand;

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
        priorCommand = upCommand;
    }

    /**
     * Executes the down command.
     */
    public void hearDownSpoken() {
        downCommand.execute();
        priorCommand = downCommand;
    }

    /**
     * Executes the undo command.
     */
    public void hearUndoSpoken() {

        if (priorCommand.equals(upCommand)) {
            upCommand.undo();
        } else if (priorCommand.equals(downCommand)) {
            downCommand.undo();
        }

    }

}
