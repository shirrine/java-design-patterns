package com.shirrine.patterns.foobarmv.chainofresponsibility;

import org.junit.*;

/**
 * Test ChainOfResponsibility
 *
 * @author Shirrine
 */
public class TestChain {

    @Test
    public void test1() {
        AbstractEmailHandler.process("I need my car repaired.");
    }

}
