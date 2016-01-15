package my_world.basic;


import my_world.abstraction.Interface2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by root on 7/8/15.
 */
public class ArrayTest {
    public static void main(String args[]) {
        ArrayTest arrayTest = new ArrayTest();
        Integer[] intArray = new Integer[10];
        intArray[0] = 10;
        intArray[1] = 20;

        List<Integer> intList =  Arrays.asList(intArray);
        arrayTest.print(intArray, intList);
        intArray[2] = 30;
        arrayTest.print(intArray, intList);
        intArray[1] = null;
        arrayTest.print(intArray, intList);

        List<Integer> intLists = new ArrayList<Integer>();
        intLists.add(1);
        intLists.add(2);
        intLists.add(3);
        Integer[] intArrays = new Integer[intLists.size()];
        intLists.toArray(intArrays);
        arrayTest.print(intArrays, intLists);
        intLists.add(4);
        arrayTest.print(intArrays, intLists);
        intArrays[1] = 20;
        arrayTest.print(intArrays, intLists);
    }
    private void print(Integer ints[],List<Integer> intList) {
        printArray(ints);
        printList(intList);
    }

    private void printArray(Integer ints[]) {
        System.out.println("\n\n Array - ");
        for(Object i : ints) {
            System.out.println(i);
        }
    }

    private void printList(List<Integer> intList) {
        System.out.println("\n\n List - ");
        for(Object i : intList) {
            System.out.println(i);
        }
    }

}
