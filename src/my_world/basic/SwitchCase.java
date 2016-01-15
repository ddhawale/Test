package my_world.basic;


/**
 * Created by root on 6/26/15.
 */
public class SwitchCase {
    public static void main(String[] args) {
        int x = 7;
        switch(x) {
            case 0:
                System.out.println(0);
            case 1:
                System.out.println(1);
            default:
                System.out.println("def");
            case 2:
                System.out.println(2);
            case 3:
                System.out.println(3);
            case 4:
                System.out.println(4);
        }
    }
}
/*
input 4 - only 4
input 7 - all below default
def
2
3
4
 */