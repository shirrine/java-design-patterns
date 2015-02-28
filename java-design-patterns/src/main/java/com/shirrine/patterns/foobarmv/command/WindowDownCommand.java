package com.shirrine.patterns.foobarmv.command;

/**
 * Execute a command to open a window.
 *
 * @author Shirrine
 */
public class WindowDownCommand implements Command {

    private ElectricWindow window;

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
        window.openWindow();
    }
}

