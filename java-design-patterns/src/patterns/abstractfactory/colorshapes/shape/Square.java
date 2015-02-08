package patterns.abstractfactory.colorshapes.shape;


/**
 * Square implementation of the <code>Shape</code> interface.
 * 
 * @author Shirrine
 *
 */
public class Square implements Shape{
	
	/**
	 * Draws a square.
	 */
	@Override
	public void draw(){
		System.out.println("Drawing a square!");
	}

}
