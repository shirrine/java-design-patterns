package com.shirrine.patterns.foobarmv.abstractfactory.van;

import com.shirrine.patterns.foobarmv.abstractfactory.Windows;

/**
 * Van implementation of the <code>Windows</code> interface.
 *
 * @author Shirrine
 *
 */
public class VanWindows implements Windows {

    /*
     * (non-Javadoc)
     *
     * @see patterns.abstractfactory.example1.Windows#getWindowParts()
     */
    @Override
    public String getWindowParts() {
        return "Van window parts!";
    }

}
