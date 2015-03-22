package com.shirrine.patterns.foobarmv;

import com.shirrine.patterns.foobarmv.flyweight.Engine;

/**
 * A vehicle with an engine and a color.
 *
 * @author Shirrine
 *
 */
public interface Vehicle extends Cloneable {

    /**
     * The vehicle color.
     * <ul>
     *  <li>{@link #UNPAINTED}</li>
     *  <li>{@link #BLUE}</li>
     *  <li>{@link #BLACK}</li>
     *  <li>{@link #GREEN}</li>
     *  <li>{@link #RED}</li>
     *  <li>{@link #SILVER}</li>
     *  <li>{@link #WHITE}</li>
     *  <li>{@link #YELLOW}</li>
     *  </ul>
     */
    public static enum Color {

        /**
         * Unpainted.
         */
        UNPAINTED,

        /**
         * Blue color.
         */
        BLUE,

        /**
         * Black color.
         */
        BLACK,

        /**
         * Green color.
         */
        GREEN,

        /**
         * Red color.
         */
        RED,

        /**
         * Silver color.
         */
        SILVER,

        /**
         * White color.
         */
        WHITE,

        /**
         * Yellow color.
         */
        YELLOW
    }

    /**
     * Gets the vehicle engine.
     *
     * @return the engine
     */
    Engine getEngine();

    /**
     * Gets the vehicle color.
     *
     * @return the color
     */
    Vehicle.Color getColor();

    /**
     * Paints the vehicle the specified color.
     *
     * @param color
     *            the color to paint
     */
    void paint(final Vehicle.Color color);

    /**
     * Gets the vehicle price.
     *
     * @return the vehicle price
     */
    int getPrice();

    /**
     * Clones a vehicle.
     *
     * @return the clone
     */
    Object clone();

    /**
     * Cleans the interior of a vehicle.
     */
    void cleanInterior();

    /**
     * Cleans the exterior of a vehicle.
     */
    void cleanExteriorBody();

    /**
     * Polishes the vehicle windows.
     */
    void polishWindows();

    /**
     * Takes vehicle for a test drive.
     */
    void takeForTestDrive();
}
