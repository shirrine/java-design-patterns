package com.shirrine.patterns.foobarmv.command;

/**
 * Execute a command to close a window.
 *
 * @author Shirrine
 */
public class WindowUpCommand implements Command {

    private ElectricWindow window;
    private boolean wasOpen; // Prior state

    /**
     * Set the window for this command.
     *
     * @param window the window to close
     */
    public WindowUpCommand(final ElectricWindow window) {
        this.window = window;
        wasOpen = false;
    }

    /**
     * Executes the command.
     */
    @Override
    public void execute() {
        wasOpen = window.isOpen();
        window.closeWindow();
    }

    /**
     * Undoes the command.
     */
    @Override
    public void undo() {

        System.out.println("Undo last command");

        // Revert to the previous state if changed
        if (wasOpen) {
            window.openWindow();
        }
    }
}
