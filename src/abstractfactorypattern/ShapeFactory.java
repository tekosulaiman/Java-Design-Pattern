package abstractfactorypattern;

/**
 * @author tombisnis@yahoo.com
 */
public class ShapeFactory extends AbstractFactory{

    @Override
    public Shape getShape(String shape) {
        
        if(shape == null){
            return null;
        }
        
        if(shape.equalsIgnoreCase("CIRCLE")){
            new Circle();
        }else if (shape.equalsIgnoreCase("RECTANGLE")){
            new Rectangle();
        }else if (shape.equalsIgnoreCase("SQUARE")){
            new Square();
        }
        
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }   
}