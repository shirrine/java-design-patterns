package patterns.abstractfactory.colorshapes.shape;


/**
 * A rectangle implementation of the <code>Shape</code> interface.
 * @author Shirrine
 *
 */
public class Rectangle implements Shape{
	
	/*
	 * (non-Javadoc)
	 * @see patterns.abstractfactory.colorshapes.Shape#draw()
	 */
	@Override
	public void draw(){
		System.out.println("Drawing a rectangle!");
	}

}
