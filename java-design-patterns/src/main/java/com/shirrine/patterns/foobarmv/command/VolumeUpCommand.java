package com.shirrine.patterns.foobarmv.command;

/**
 * Execute a command to increase the volume of a radio.
 *
 * @author Shirrine
 */
public class VolumeUpCommand implements Command {

    private Radio radio;

    /**
     * Set the radio for this command.
     *
     * @param radio the radio to increase volume
     */
    public VolumeUpCommand(final Radio radio) {
        this.radio = radio;
    }

    /**
     * Executes the command.
     */
    @Override
    public void execute() {
        radio.volumeUp();
    }
}
