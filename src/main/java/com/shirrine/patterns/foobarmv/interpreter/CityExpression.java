package com.shirrine.patterns.foobarmv.interpreter;

/**
 * An expression representing a city.
 *
 * @author Shirrine
 */
public class CityExpression implements Expression {

    private City city;

    /**
     * Creates a city expression for the given city.
     *
     * @param city the city to interpret
     */
    public CityExpression(final City city) {
        this.city = city;
    }

    /**
     * Interprets the expression for the city.
     *
     * @return the city
     */
    public City interpret() {
        return city;
    }

}
