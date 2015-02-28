package com.shirrine.patterns.foobarmv.chainofresponsibility;

import org.junit.*;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

/**
 * Test ChainOfResponsibility
 *
 * @author Shirrine
 */
public class ChainTest {

    /**
     * Tests that the service handler responds to a repair email.
     */
    @Test
    public void testService() {
        String response = AbstractEmailHandler.processEmail("I need my car repaired.");
        assertThat(response, is("Email handled by service department."));
    }

    /**
     * Tests that the spam handler responds to a spam email.
     */
    @Test
    public void testSpam() {
        String response = AbstractEmailHandler.processEmail("Try these new pills!");
        assertThat(response, is("This is a spam email."));
    }

    /**
     * Tests that the general handler responds to a general email.
     */
    @Test
    public void testGeneral() {
        String response = AbstractEmailHandler.processEmail("Hi! I'm Eysha Shirrine. :-)");
        assertThat(response, is("Email handled by general inquiries."));
    }

    /**
     * Tests that the manager handler responds to a complaint email.
     */
    @Test
    public void testManager() {
        String response = AbstractEmailHandler.processEmail("My coffee was bad.");
        assertThat(response, is("Email handled by manager."));
    }

    /**
     * Tests that the sales handler responds to a purchase inquiry email.
     */
    @Test
    public void testSales() {
        String response = AbstractEmailHandler.processEmail("I'd like to buy a new car please.");
        assertThat(response, is("Email handled by sales department"));
    }

}
