package project_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zap
{
    public static void print(List<Integer> points)
    {
        String sep = "";
        for (Integer i : points)
        {
            System.out.print(sep + i);
            sep = ", ";
        }
        System.out.println();
    }

    public static void print(Integer[] points)
    {
        String sep = "";
        for (Integer i : points)
        {
            System.out.print(sep + i);
            sep = ", ";
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Integer[] points =
                { 100, 5, 99, 6, 4, 3, 2, 105, 30 };

        List<Integer> pivots0 = new ArrayList<Integer>(Arrays.asList(points));
        List<Integer> pivots1 = Arrays.asList(points);

        print(points);
        print(pivots0);
        print(pivots1);

        Arrays.sort(points);

        print(points);
        print(pivots0);
        print(pivots1);
    }
}

