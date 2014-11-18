package prototypepattern;

/**
 * @author tombisnis@yahoo.com
 */
public class Square extends Shape{

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square: :draw() method.");
    }  
}