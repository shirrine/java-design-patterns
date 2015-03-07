package com.shirrine.patterns.foobarmv.command;

/**
 * Execute a command to decrease the temperature of an air conditioner.
 *
 * @author Shirrine
 */
public class TemperatureDownCommand implements Command {

    private AirConditioner airConditioner;
    private boolean wasWarmer = false;

    /**
     * Set the air conditioner for this command.
     *
     * @param airConditioner the airConditioner to decrease the temperature
     */
    public TemperatureDownCommand(final AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    /**
     * Executes the command.
     */
    @Override
    public void execute() {

        // Save prior state. If temperature is greater than min,
        // wasWarmer is true.
        wasWarmer = airConditioner.getTemperature() > AirConditioner.MIN_TEMP;

        // Decrease temperature
        airConditioner.temperatureDown();
    }

    /**
     * Undoes the command.
     */
    @Override
    public void undo() {

        System.out.println("Undo last command");

        // Revert to the previous state if changed
        if (wasWarmer) {
            airConditioner.temperatureUp();
        }

    }
}

