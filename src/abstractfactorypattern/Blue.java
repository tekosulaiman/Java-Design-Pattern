package abstractfactorypattern;

/**
 * @author tombisnis@yahoo.com
 */
public class Blue implements Color{

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}