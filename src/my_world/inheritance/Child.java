package my_world.inheritance;

/**
 * Created by root on 6/15/15.
 */
public class Child extends Parent {
    public void printInfo() {
        System.out.println("\n I am Child");
    }

    public void printChild() {
        System.out.println("\n I am print Child");
    }
    public static void printStatic() {
        System.out.println("\n I am static Child");
    }
}
