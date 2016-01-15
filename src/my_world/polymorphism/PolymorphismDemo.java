package my_world.polymorphism;

/**
 * Created by root on 6/15/15.
 */
class Parent {
    public void printInfo() {
        System.out.println("\n I am Parent");
    }

    public void printParent() {
        System.out.println("\n I am super Parent");
    }
}

class Child extends Parent {
    public void printInfo() {
        System.out.println("\n I am Child");
    }
    public void printChild() {
        System.out.println("\n I am super Child");
    }
}

public class PolymorphismDemo {


    public static void main(String args[]) {
        Parent pp = new Parent();
        Child cc = new Child();
        //Overriding
        PolymorphismDemo pd = new PolymorphismDemo();
        pp.printInfo();
        cc.printInfo();

        //Overloading
        pd.calArea(1);
        pd.calArea(1,2);
        // Child cp = new Parent(); invalid
    }
    public void calArea(int a) {
        System.out.println("\n I am super Parent " + a);
    }

    public void calArea(int a, int b) {
        System.out.println("\n I am super Parent " + a + " and " + b);
    }

}

/*
Result -
 I am Parent

 I am Child

 I am super Parent 1

 I am super Parent 1 and 2

 */