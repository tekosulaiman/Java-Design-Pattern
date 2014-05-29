package abstractfactorypattern;

/**
 * @author tombisnis@yahoo.com
 */
public class Green implements Color{

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}