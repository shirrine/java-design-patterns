package com.shirrine.patterns.foobarmv.command;

/**
 * A car window.
 *
 * @author Shirrine
 */
public class ElectricWindow {

    private boolean open;

    /**
     * A car window that is closed by default.
     */
    public ElectricWindow() {
        open = false;
        System.out.println("Window is closed");
    }

    /**
     * Indicates if the window is open.
     *
     * @return true, if the window is open
     */
    public boolean isOpen() {
        return open;
    }

    /**
     * Indicates if the window is closed.
     *
     * @return true, if the window is closed
     */
    public boolean isClosed() {
        return !open;
    }

    /**
     * Opens the window.
     */
    public void openWindow() {
        open = true;
        System.out.println("The window is now open");
    }

    /**
     * Closes the window.
     */
    public void closeWindow() {
        open = false;
        System.out.println("The window is now closed");
    }

}
