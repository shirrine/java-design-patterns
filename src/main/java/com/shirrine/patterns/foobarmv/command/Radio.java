package com.shirrine.patterns.foobarmv.command;

/**
 * A car radio.
 *
 * @author Shirrine
 */
public class Radio {

    /**
     * The minimum radio volume.
     */
    public static final int MIN_VOLUME = 0;

    /**
     * The maximum radio volume.
     */
    public static final int MAX_VOLUME = 10;

    /**
     * The default radio volume.
     */
    public static final int DEFAULT_VOLUME = 5;

    /*
     * Instance variables
     */
    private boolean on;
    private int volume;

    /**
     * A car radio that is turned off by default and starts at the
     * default volume.
     */
    public Radio() {
        on = false;
        volume = DEFAULT_VOLUME;
    }

    /**
     * Indicates if the radio is on.
     *
     * @return true, if the radio is on
     */
    public boolean isOn() {
        return on;
    }

    /**
     * Gets the current volume.
     *
     * @return the volume
     */
    public int getVolume() {

        // Return the volume if the radio is on or
        // 0 if the radio is off.
        if (isOn()) {
            return volume;
        } else {
            return 0;
        }

    }

    /**
     * Turns the radio on.
     */
    public void on() {
        on = true;
        System.out.println("Radio now on, volume level " + volume);
    }

    /**
     * Turns the radio off.
     */
    public void off() {
        on = false;
        System.out.println("Radio now off");
    }

    /**
     * Turns the volume up.
     */
    public void volumeUp() {
        if (isOn() && volume < MAX_VOLUME) {
            volume++;
            System.out.println("Volume turned up to level " + volume);
        }
    }

    /**
     * Turns the volume down.
     */
    public void volumeDown() {
        if (isOn() && volume > MIN_VOLUME) {
            volume--;
            System.out.println("Volume turned down to level " + volume);
        }
    }

}
