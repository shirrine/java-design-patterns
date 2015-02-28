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

}
