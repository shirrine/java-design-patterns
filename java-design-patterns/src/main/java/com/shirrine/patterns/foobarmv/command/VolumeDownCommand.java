package com.shirrine.patterns.foobarmv.command;

/**
 * Execute a command to decrease the volume of a radio.
 *
 * @author Shirrine
 */
public class VolumeDownCommand implements Command {

    private Radio radio;

    /**
     * Set the radio for this command.
     *
     * @param radio the radio to command
     */
    public VolumeDownCommand(final Radio radio) {
        this.radio = radio;
    }

    /**
     * Executes the command.
     */
    @Override
    public void execute() {
        radio.volumeDown();
    }
}
