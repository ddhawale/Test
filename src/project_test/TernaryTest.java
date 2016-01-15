package project_test;

/**
 * Created by root on 12/22/15.
 */
public class TernaryTest {
    public static void main(String args[]) {
        Integer intRef = true ? getData() : new Integer(1);
        System.out.println("Value of intRef is " + intRef);

        Integer intRef2 = true ? null : new Integer(1);
        System.out.println("Value of intRef2 is " + intRef2);

        Integer intRef3 = true ? null : 1;
        System.out.println("Value of intRef3 is " + intRef3);

        Integer intRef1 = true ? getData() : 1;
        System.out.println("Value of intRef1 is " + intRef1);

        int intVal = true ? getData() : 1;
        System.out.println("Value of intVal is " + intVal);

    }
    private static Integer getData() {
        return null;
    }
}
