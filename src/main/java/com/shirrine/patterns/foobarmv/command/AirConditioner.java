package com.shirrine.patterns.foobarmv.command;

/**
 *
 * A car air conditioner.
 *
 * @author Shirrine
 */
public class AirConditioner {

    /**
     * The minimum temperature.
     */
    public static final int MIN_TEMP = 60;

    /**
     * The maximum temperature.
     */
    public static final int MAX_TEMP = 80;

    /**
     * The default temperature.
     */
    public static final int DEFAULT_TEMP = 70;

    /**
     * The value to increment the temperature.
     */
    private static final int TEMP_INCREMENT = 5;

    /*
     * Instance variables
     */
    private boolean on;
    private int temperature;

    /**
     * A car air conditioner that is off by default.
     *
     */
    public AirConditioner() {
        this.temperature = DEFAULT_TEMP;
        on = false;
    }

    /**
     * Indicates if the air conditioner is on.
     *
     * @return true, if the air conditioner is on
     */
    public boolean isOn() {
        return on;
    }

    /**
     * Gets the current temperature.
     *
     * @return the temperature
     */
    public int getTemperature() {

        // Return the temperature if the air conditioner is on or
        // -1 if the temperature is off.
        if (isOn()) {
            return temperature;
        } else {
            return -1;
        }

    }

    /**
     * Turns the air conditioner on.
     */
    public void on() {
        on = true;
        System.out.println("Air conditioner now on, temperature "
                + temperature + " degrees F");
    }

    /**
     * Turns the air conditioner off.
     */
    public void off() {
        on = false;
        System.out.println("Air conditioner now off");
    }

    /**
     * Turns the temperature up.
     */
    public void temperatureUp() {
        if (isOn() && temperature < MAX_TEMP) {
            temperature += TEMP_INCREMENT;
            System.out.println("Temperature increased to " + temperature
                + " degrees F");
        }
    }

    /**
     * Turns the temperature down.
     */
    public void temperatureDown() {
        if (isOn() && temperature > MIN_TEMP) {
            temperature -= TEMP_INCREMENT;
            System.out.println("Temperature decreased to " + temperature
                + " degrees F");
        }
    }

}
