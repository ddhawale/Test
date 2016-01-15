package my_world.abstraction;

/**
 * Created by root on 6/17/15.
 */
public class AbstractionDemo {
    public static void main(String args[]) {
        Class2 class2 = new Class2();
        class2.printClass1();
        class2.printInterface1();
        class2.printInterface2();

        Interface1 interface12 = new Class2();
        interface12.printInterface1();

        Interface2 interface11 = new Class2();
        interface11.printInterface2();

    }
}
