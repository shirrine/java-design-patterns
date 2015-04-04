package com.shirrine.patterns.foobarmv.interpreter;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

/**
 * An evaluator for cities and their locations.
 *
 * @author Shirrine
 */
public class DirectionalEvaluator {

    private Map<String, City> cities;

    /**
     * Defines the cities for evaluation.
     */
    public DirectionalEvaluator() {
        cities = new HashMap<String, City>();

        //CHECKSTYLE:OFF
        // TODO: Is there a public API for this ;-)

        cities.put("aberdeen", new City("Aberdeen", 57.15, -2.15));
        cities.put("belfast", new City("Belfast", 54.62, -5.93));
        cities.put("birmingham", new City("Birmingham", 52.42, -1.92));
        cities.put("dublin", new City("Dublin", 53.33, -6.25));
        cities.put("edinburgh", new City("Edinburgh", 55.92, -3.02));
        cities.put("glasgow", new City("Glasgow", 55.83, -4.25));
        cities.put("london", new City("London", 51.53, -0.08));
        cities.put("liverpool", new City("Liverpool", 53.42, -3.0));
        cities.put("manchester", new City("Manchester", 53.5, -2.25));
        cities.put("southampton", new City("Southampton", 50.9, -1.38));
        //CHECKSTYLE:ON

    }

    /**
     * Parse the route and expressions.
     *
     * @param route the expressions to evaluate
     * @return the result
     */
    public City evaluate(final String route) {

        // Define the syntax tree
        Deque<Expression> expressionStack = new LinkedList<Expression>();

        // Parse each token in the route string
        for (String token : route.split(" ")) {

            //CHECKSTYLE:OFF
            // TODO: Could use a Chain of Responsibility Pattern here
            //CHECKSTYLE:ON

            // Is the token a recognized city?
            if (cities.containsKey(token)) {

                // Add the city to the stack
                City city = cities.get(token);
                expressionStack.push(new CityExpression(city));

            } else if (token.equals(Expression.NORTHERLY)) {

                // Pop all prior expressions into the northerly expression then
                // add the northerly expression to the stack.
                expressionStack.push(new MostNortherlyExpression(
                                        loadExpressions(expressionStack)));
            } else if (token.equals(Expression.SOUTHERLY)) {

                // Pop all prior expressions into the southerly expression then
                // add the southerly expression to the stack.
                expressionStack.push(new MostSoutherlyExpression(
                        loadExpressions(expressionStack)));

            } else if (token.equals(Expression.EASTERLY)) {

                // Pop all prior expressions into the easterly expression then
                // add the easterly expression to the stack.
                expressionStack.push(new MostEasterlyExpression(
                        loadExpressions(expressionStack)));

            } else if (token.equals(Expression.WESTERLY)) {

                // Pop all prior expressions into the westerly expression then
                // add the westerly expression to the stack.
                expressionStack.push(new MostWesterlyExpression(
                        loadExpressions(expressionStack)));
            }
        }

        // Interpret the token value
        return expressionStack.pop().interpret();
    }

    /**
     * Loads prior expressions on the stack into a list for the directional
     * expression.
     *
     * @param expressionStack the stack of prior expressions
     * @return the list of popped expressions
     */
    private List<Expression> loadExpressions(
                                    final Deque<Expression> expressionStack) {

        List<Expression> expressions = new ArrayList<Expression>();

        // Pop all of the expressions from the stack and store in a list
        while (!expressionStack.isEmpty()) {
            expressions.add(expressionStack.pop());
        }

        return expressions;
    }

}
