package com.shirrine.patterns.foobarmv.command;

/**
 * Execute a command to close a window.
 *
 * @author Shirrine
 */
public class WindowUpCommand implements Command {

    private ElectricWindow window;

    /**
     * Set the window for this command.
     *
     * @param window the window to close
     */
    public WindowUpCommand(final ElectricWindow window) {
        this.window = window;
    }

    /**
     * Executes the command.
     */
    @Override
    public void execute() {
        window.closeWindow();
    }
}
