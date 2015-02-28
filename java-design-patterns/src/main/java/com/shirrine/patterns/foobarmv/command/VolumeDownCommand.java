package com.shirrine.patterns.foobarmv.command;

/**
 * Execute a command to decrease the volume of a radio.
 *
 * @author Shirrine
 */
public class VolumeDownCommand implements Command {

    private Radio radio;
    private boolean wasHigher = false; // Prior state

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

        // Save the previous state
        if (radio.getVolume() > Radio.MIN_VOLUME) {
            wasHigher = true;
        } else {
            wasHigher = false;
        }

        // Lower the volume
        radio.volumeDown();

    }

    /**
     * Undoes the command.
     */
    @Override
    public void undo() {

        System.out.println("Undo last command");

        // Revert to the previous state if changed
        if (wasHigher) {
            radio.volumeUp();
        }
    }
}
