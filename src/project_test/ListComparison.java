package project_test;

import java.util.*;

/**
 * Created by root on 9/12/14.
 */
public class ListComparison {
    public static void main (String args[])
    {
        List<String> newIndexedFieldList =  new ArrayList<String>();
        List<String> existingIndexedFieldList =  new ArrayList<String>();

        newIndexedFieldList.add("dinkar");
        newIndexedFieldList.add("gaNesh");

        Set<String> a = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        a.add("dinkar");
        a.add("Dinkar");
        a.add("Omkar");
        a.add("omkar");
        print(a);
        System.exit(0);

        listToSet(newIndexedFieldList);

        Set<String> newFields =  new HashSet<String>();
        newFields.add("dinkar");
        newFields.addAll(newIndexedFieldList);
        print(newFields);
        System.exit(0);

        existingIndexedFieldList.add("dinkar");
        existingIndexedFieldList.add("ganesh");

        print(newIndexedFieldList);
        print(existingIndexedFieldList);
        System.out.println("\n Comparison " + isIndexedFieldModified(newIndexedFieldList,existingIndexedFieldList));
    }

    private static void listToSet(List<String> newIndexedFieldList)
    {
        Set a = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        a.addAll(newIndexedFieldList);
        print(newIndexedFieldList);
        a.add("Omkar");
        a.add("omkar");
        print(a);
        System.exit(0);
    }

    private static void print(Collection<String> indexes)
    {
        System.out.println("\n\n Index Name : " + indexes);
        for(String index : indexes)
        {
            System.out.println("\n " + index);
        }
    }

    private static boolean isIndexedFieldModified(List<String> newIndexedFieldList, List<String> existingIndexedFieldList)
    {
        if(( newIndexedFieldList == null || newIndexedFieldList.isEmpty()
                && existingIndexedFieldList == null || existingIndexedFieldList.isEmpty()))
        {
            return true;
        }
        else if(newIndexedFieldList.size() == existingIndexedFieldList.size())
        {
            for(String index : newIndexedFieldList)
            {
                if(!existingIndexedFieldList.contains(index))
                {
                    return false;
                }
            }
            return true;
        }
        else
        {
            return false;
        }
    }
}
