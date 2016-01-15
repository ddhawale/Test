package my_world.interview_problem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by ddhawale on 8/3/15.
 */
public class PowerSet {
    public static void main(String args[]) {
        Set<Integer> mySet = new HashSet<Integer>();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(4);
        for (Set<Integer> s : getPowerSet(mySet)) {
            System.out.println(s);
        }
    }

    static Set<Set<Integer>> getPowerSet(Set<Integer> inputSet) {
        Set<Set<Integer>> sets = new HashSet<Set<Integer>>();

        if (inputSet.isEmpty()) {
            sets.add(new HashSet<Integer>());
            return sets;
        }

        List<Integer> pendingElements = new ArrayList<Integer>(inputSet);
        Integer firstElement = pendingElements.get(0);
        Set<Integer> restOfTheSet = new HashSet<Integer>(pendingElements.subList(1, pendingElements.size()));

        for (Set<Integer> oldSet : getPowerSet(restOfTheSet)) {
            Set<Integer> newSet = new HashSet<Integer>();
            newSet.add(firstElement);
            newSet.addAll(oldSet);

            sets.add(newSet);
            sets.add(oldSet);
        }

        return sets;
    }

}
