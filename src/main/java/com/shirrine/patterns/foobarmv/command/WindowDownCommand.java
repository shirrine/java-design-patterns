package com.shirrine.patterns.foobarmv.command;

/**
 * Execute a command to open a window.
 *
 * @author Shirrine
 */
public class WindowDownCommand implements Command {

    private ElectricWindow window;
    private boolean wasClosed = false; // Prior state

    /**
     * Set the window for this command.
     *
     * @param window the window to open
     */
    public WindowDownCommand(final ElectricWindow window) {
        this.window = window;
    }

    /**
     * Executes the command.
     */
    @Override
    public void execute() {
        wasClosed = window.isClosed();
        window.openWindow();
    }

    /**
     * Undoes the command.
     */
    @Override
    public void undo() {

        System.out.println("Undo last command");

        // Revert to the previous state if changed
        if (wasClosed) {
            window.closeWindow();
        }
    }
}

