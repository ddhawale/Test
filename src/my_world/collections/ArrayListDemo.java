package my_world.collections;

import sun.security.util.BigInt;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by root on 6/29/15.
 */
public class ArrayListDemo {
    public static void main(String args[]) {
        List<String> al=new ArrayList<String>();//creating arraylist
        al.add("Ravi");//adding object in arraylist
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        List<String> ll=new LinkedList<String>();//creating arraylist
        ll.addAll(al);
        ll.add(0,"");
        System.out.println("arraylist: "+al);
        al.add(0,"Dinkar");
        al.add(2,"Pooja");
        System.out.println("arraylist: "+al);
        al.remove(1);
        System.out.println("arraylist: "+al);

        ListIterator<String> itr=al.listIterator();

        System.out.println("\n traversing elements in forward direction...");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("\n traversing elements in backward direction...");
        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }
    }
}
