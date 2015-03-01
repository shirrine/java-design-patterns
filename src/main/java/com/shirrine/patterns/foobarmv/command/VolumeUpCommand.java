package com.shirrine.patterns.foobarmv.command;

/**
 * Execute a command to increase the volume of a radio.
 *
 * @author Shirrine
 */
public class VolumeUpCommand implements Command {

    private Radio radio;
    private boolean wasLower = false; // Prior state

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

        // Save the previous state
        if (radio.getVolume() < Radio.MAX_VOLUME) {
            wasLower = true;
        } else {
            wasLower = false;
        }

        // Raise the volume
        radio.volumeUp();
    }

    /**
     * Undoes the command.
     */
    @Override
    public void undo() {

        System.out.println("Undo last command");

        // Revert to the previous state if changed
        if (wasLower) {
            radio.volumeDown();
        }
    }
}
