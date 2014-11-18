package prototypepattern;

import java.util.Hashtable;

/**
 * @author tombisnis@yahoo.com
 */
public class ShapeCache {
    
    private static Hashtable<String, Shape> hashtable = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId){
        Shape cachedShape = hashtable.get(shapeId);
        
        return (Shape)cachedShape.clone();
    }
    
    public static void loadCache(){
        
        Circle circle = new Circle();
        circle.setId("1");
        hashtable.put(circle.getId(), circle);
        
        Square square = new Square();
        square.setId("2");
        hashtable.put(square.getId(), square);
        
        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        hashtable.put(rectangle.getId(), square);
    }
}