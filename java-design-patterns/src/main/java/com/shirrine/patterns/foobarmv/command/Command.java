package com.shirrine.patterns.foobarmv.command;

/**
 * Execute commands.
 *
 * @author Shirrine
 */
public interface Command {

    /**
     * Executes the command.
     */
    void execute();

    /**
     * Undoes the command.
     */
    void undo();

}
