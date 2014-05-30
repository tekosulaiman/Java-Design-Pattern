package singletonpattern;

/**
 * @author tombisnis@yahoo.com
 */
public class SingleObject {
    private static SingleObject singleObject = new SingleObject();
    
    private SingleObject(){
        
    }
    
    public static SingleObject getSingleObject(){
        return singleObject; 
    }
    
    public void shoMessage(){
        System.out.println("Hello World!");
    }
}