package my_world.typecast;

/**
 * Created by root on 6/15/15.
 */
class Parent {

    Parent() {
        System.out.println("\n I am Parent default Constructor");
    }

    {
        System.out.println("\n I am Parent block");
    }

    public void printParent() {
        System.out.println("\n I am Parent");
    }

}

class Child extends Parent {
    Child() {
        System.out.println("\n I am Child default Constructor");
    }

    {
        System.out.println("\n I am Child block");
    }

    Child(int a) {
        System.out.println("\n I am Child default Constructor " + a);
    }

    public void printChild() {
        System.out.println("\n I am Child");
    }

}

public class TypeCastDemo {


    public static void main(String args[]) {
        System.out.println("\n --------------------");
        Parent pp = new Parent();
        System.out.println("\n --------------------");
        Child cc = new Child();
        System.out.println("\n --------------------");
        Child cc1 = new Child(2);
        System.out.println("\n --------------------");

        Parent cp = new Child();

        cp.printParent();
        ((Child)cp).printChild();
        System.out.println("\n --------------------");
    }

}
/*
Result :
--------------------

 I am Parent block

 I am Parent default Constructor

 --------------------

 I am Parent block

 I am Parent default Constructor

 I am Child block

 I am Child default Constructor

 --------------------

 I am Parent block

 I am Parent default Constructor

 I am Child block

 I am Child default Constructor 2

 --------------------

 I am Parent block

 I am Parent default Constructor

 I am Child block

 I am Child default Constructor

 I am Parent

 I am Child

 --------------------

 */
