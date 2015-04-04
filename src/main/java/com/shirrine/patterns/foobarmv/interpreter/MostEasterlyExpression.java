package com.shirrine.patterns.foobarmv.interpreter;

import java.util.List;

/**
 * An expression representing the most easterly expression in a given list.
 *
 * @author Shirrine
 */
public class MostEasterlyExpression implements Expression {

    private List<Expression> expressions;

    /**
     * Defines a list of expressions.
     *
     * @param expressions the expressions to interpret
     */
    public MostEasterlyExpression(final List<Expression> expressions) {
        this.expressions = expressions;
    }

    /**
     * Interprets the list of expressions.
     *
     * @return the most easterly city in the list
     */
    @Override
    public City interpret() {

        //CHECKSTYLE:OFF
        // Base city (low latitude, longitude)
        City resultingCity = new City("Nowhere", -999.9, -999.9);
        //CHECKSTYLE:ON

        // Iterate all expressions
        for (Expression currentExpression : expressions) {

            // Interpret the expression to get the city
            City currentCity = currentExpression.interpret();

            // Update the resulting city when the longitude is greater
            if (currentCity.getLongitude() > resultingCity.getLongitude()) {
                resultingCity = currentCity;
            }
        }
        return resultingCity;
    }


}
