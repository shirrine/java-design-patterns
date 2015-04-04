package com.shirrine.patterns.foobarmv.interpreter;

/**
 * An expression to be interpreted.
 *
 * @author Shirrine
 */
public interface Expression {

    /**
     * The northerly keyword.
     */
    String NORTHERLY = "northerly";

    /**
     * The southerly keyword.
     */
    String SOUTHERLY = "southerly";

    /**
     * The easterly keyword.
     */
    String EASTERLY = "easterly";

    /**
     * The westerly keyword.
     */
    String WESTERLY = "westerly";

    /**
     * Interprets an expression.
     *
     * @return the resulting city
     */
    City interpret();

}
