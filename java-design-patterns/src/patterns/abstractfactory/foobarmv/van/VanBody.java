package patterns.abstractfactory.foobarmv.van;

import patterns.abstractfactory.foobarmv.Body;

/**
 * Van implementation of the <code>Body</code> interface.
 * 
 * @author Shirrine
 *
 */
public class VanBody implements Body{
	
	/*
	 * (non-Javadoc)
	 * @see patterns.abstractfactory.example1.Body#getBodyParts()
	 */
	public String getBodyParts(){
		return "Van body parts!";
	}

}
