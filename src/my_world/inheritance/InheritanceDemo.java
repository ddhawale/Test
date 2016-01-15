package my_world.inheritance;

/**
 * Created by root on 6/15/15.
 */
public class InheritanceDemo {
    public static void main(String args[]) {
        Parent pp = new Parent();
        Child cc = new Child();
        Parent pc = new Child();
        // Child cp = new Parent(); invalid

        System.out.println("\n Parent ref and parent obj\n======================= ");
        pp.printInfo();
        pp.printParent();

        System.out.println("\n Child ref and child obj \n" +
                "======================= ");
        cc.printInfo();
        cc.printChild();
        cc.printParent();

        System.out.println("\n Parent ref and child obj \n" +
                "======================= ");
        pc.printInfo();
        pc.printParent();
    }
}

/*
 Parent ref and parent obj
=======================

 I am Parent

 I am print Parent

 Child ref and child obj
=======================

 I am Child

 I am print Child

 I am print Parent

 Parent ref and child obj
=======================

 I am Child

 I am print Parent

 */