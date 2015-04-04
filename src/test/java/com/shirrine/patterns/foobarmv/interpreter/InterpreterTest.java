package com.shirrine.patterns.foobarmv.interpreter;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * @author Shirrine
 */
public class InterpreterTest {

    private static DirectionalEvaluator evaluator;

    /**
     * Sets the evaluator.
     */
    @BeforeClass
    public static void setup() {
        evaluator = new DirectionalEvaluator();
    }

    /**
     * Tests one directional expression
     */
    @Test
    public void test1() {

        String input = "london edinburgh manchester southerly";
        String expectedOutput = "London";
        assertThat(evaluator.evaluate(input).getName(),
                        is(equalTo(expectedOutput)));
    }

    /**
     * Tests two directional expressions
     */
    @Test
    public void test2() {

        String input =
                "london edinburgh manchester southerly aberdeen westerly";
        String expectedOutput = "Aberdeen";
        assertThat(evaluator.evaluate(input).getName(),
                is(equalTo(expectedOutput)));
    }

}
