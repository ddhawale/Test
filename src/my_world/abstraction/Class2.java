package my_world.abstraction;

/**
 * Created by root on 6/17/15.
 */
public class Class2 extends Class1 implements Interface1,Interface2 {
    @Override
    void printClass1() {
        System.out.println("I am calling class 1");
    }

    @Override
    public void printInterface1() {
        System.out.println("I am calling Interface 1");
    }

    @Override
    public void printInterface2() {
        System.out.println("I am calling Interface 2");
    }
}
