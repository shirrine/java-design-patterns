package com.shirrine.patterns.foobarmv.command;

import org.junit.*;

/**
 * Test the Command design pattern.
 *
 * @author Shirrine
 */
public class CommandTest {

    /**
     * Tests the speech recognizer with a radio and a window.
     */
    @Test
    public void testRecognizer(){

        // Create a radio and associated commands
        Radio radio = new Radio();
        radio.on();
        Command volumeUpCommand = new VolumeUpCommand(radio);
        Command volumeDownCommand = new VolumeDownCommand(radio);

        // Create a window and associated commands
        ElectricWindow window = new ElectricWindow();
        Command windowUpCommand = new WindowUpCommand(window);
        Command windowDownCommand = new WindowDownCommand(window);

        // Speech recognition!
        SpeechRecognizer recognizer = new SpeechRecognizer();

        // Control the radio
        recognizer.setCommands(volumeUpCommand, volumeDownCommand);
        System.out.println("Speech recognition controlling the radio.");
        recognizer.hearUpSpoken();
        recognizer.hearUpSpoken();
        recognizer.hearUpSpoken();
        recognizer.hearDownSpoken();

        // Control the window with the same recognizer
        recognizer.setCommands(windowUpCommand, windowDownCommand);
        System.out.println("Speech recognition controlling the window.");
        recognizer.hearDownSpoken();
        recognizer.hearUpSpoken();

    }

    /**
     * Tests the ability to undo a given command and reset
     * to the previous state.
     */
    @Test
    public void testUndo(){

        // Create a radio and associated commands
        Radio radio = new Radio();
        radio.on();
        Command volumeUpCommand = new VolumeUpCommand(radio);
        Command volumeDownCommand = new VolumeDownCommand(radio);

        // Create a window and associated commands
        ElectricWindow window = new ElectricWindow();
        Command windowUpCommand = new WindowUpCommand(window);
        Command windowDownCommand = new WindowDownCommand(window);

        // Speech recognition!
        SpeechRecognizer recognizer = new SpeechRecognizer();

        // Control the radio
        recognizer.setCommands(volumeUpCommand, volumeDownCommand);
        System.out.println("Speech recognition controlling the radio.");
        recognizer.hearUpSpoken();
        recognizer.hearUpSpoken();
        recognizer.hearUpSpoken();
        recognizer.hearDownSpoken();
        recognizer.hearUndoSpoken();

        // Control the window with the same recognizer
        recognizer.setCommands(windowUpCommand, windowDownCommand);
        System.out.println("Speech recognition controlling the window.");
        recognizer.hearDownSpoken();
        recognizer.hearUpSpoken();
        recognizer.hearUndoSpoken();

    }

    /**
     * Tests the new air conditioner.
     */
    @Test
    public void testAirConditioner() {

        // Create an air conditioner and associated commands
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.on();

        // Create commands
        Command temperatureUpCommand =
                new TemperatureUpCommand(airConditioner);
        Command temperatureDownCommand =
                new TemperatureDownCommand(airConditioner);

        // Add speech recognition
        SpeechRecognizer recognizer = new SpeechRecognizer();
        recognizer.setCommands(temperatureUpCommand, temperatureDownCommand);
        System.out.println("Speech recognition controlling the A/C.");

        // Control the air conditioner
        recognizer.hearUpSpoken();
        recognizer.hearUpSpoken();
        recognizer.hearDownSpoken();
        recognizer.hearUndoSpoken();
    }
}
