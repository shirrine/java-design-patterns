package com.shirrine.patterns.foobarmv.command;

/**
 * Execute a command to increase the temperature of an air conditioner.
 *
 * @author Shirrine
 */
public class TemperatureUpCommand implements Command {

    private AirConditioner airConditioner;
    private boolean wasColder = false;

    /**
     * Set the air conditioner for this command.
     *
     * @param airConditioner the airConditioner to increase the temperature
     */
    public TemperatureUpCommand(final AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    /**
     * Executes the command.
     */
    @Override
    public void execute() {

        // Save prior state. If temperature is less than max,
        // wasWarmer is true.
        wasColder = airConditioner.getTemperature() < AirConditioner.MAX_TEMP;

        // Increase temperature
        airConditioner.temperatureUp();
    }

    /**
     * Undoes the command.
     */
    @Override
    public void undo() {

        System.out.println("Undo last command");

        // Revert to the previous state if changed
        if (wasColder) {
            airConditioner.temperatureDown();
        }

    }
}
