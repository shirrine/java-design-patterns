package com.shirrine.patterns.foobarmv.abstractfactory.van;

import com.shirrine.patterns.foobarmv.abstractfactory.Body;

/**
 * Van implementation of the <code>Body</code> interface.
 *
 * @author Shirrine
 *
 */
public class VanBody implements Body {

    /*
     * (non-Javadoc)
     *
     * @see patterns.abstractfactory.example1.Body#getBodyParts()
     */
    @Override
    public String getBodyParts() {
        return "Van body parts!";
    }

}
