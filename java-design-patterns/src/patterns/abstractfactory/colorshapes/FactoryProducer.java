package patterns.abstractfactory.colorshapes;

public class FactoryProducer {

	public static ColorShapeFactory getFactory(String choice){
		
		// Validation
		if(choice == null){
			return null;
		}
		
		// Select factory
		switch(choice.toLowerCase()){
		case "shape": return new ShapeFactory();	
		case "color": return new ColorFactory();
		}
		
		return null;
	}
}
