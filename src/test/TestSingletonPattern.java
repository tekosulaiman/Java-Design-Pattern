package test;

import singletonpattern.SingleObject;

/**
 * @author tombisnis@yahoo.com
 */
public class TestSingletonPattern {
    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getSingleObject();
        singleObject.shoMessage();
    }
}