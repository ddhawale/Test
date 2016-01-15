package project_test;

import java.util.*;

/**
 * Created by root on 10/14/14.
 */
public class RetrieveColumnName {
    public static void main (String args[])
    {
        Map<IndexedColumnList, Set<String>> indexFields = new HashMap<IndexedColumnList, Set<String>>();
        Set<String> unIndexedFields = new HashSet<String>();
        indexFields.put(IndexedColumnList.UnIndexedFields, unIndexedFields);

        Set<String> indexedFields = new HashSet<String>();
        indexedFields = indexFields.get(IndexedColumnList.UnIndexedFields);
        System.out.println("\n\n Tell me is it empty ?? : " + indexedFields.isEmpty());
        System.exit(0);

        Set<String> existingIndexedFields = new HashSet<String>();
        existingIndexedFields.add("lower((e_pk)::text)");
        existingIndexedFields.add("lower((e)::text)");
        existingIndexedFields.add("lower(d_pk::text)");
        existingIndexedFields.add("lower(d::text)");

        System.out.println("\n\n Original Map : ");
        print(existingIndexedFields);

        Set<String> caseInsensitiveIndexedFields = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        for(String indexField : Collections.<String>emptyList())
        {
            if(indexField.contains("("))
            {
                indexField = indexField.replaceAll(".*\\(|\\).*", "");;
                if(indexField.contains(":"))
                    indexField = indexField.replaceAll(":.*", "");;
            }
            caseInsensitiveIndexedFields.add(indexField);
        }

        System.out.println("\n\n Modified Map : ");
        print(caseInsensitiveIndexedFields);
    }
    static void print(Set<String> fields)
    {
        for(String indexField : fields)
        {
            System.out.println("\n  : " + indexField);
        }

    }
    public enum IndexedColumnList {
        IndexedFields,
        UnIndexedFields;

        public static IndexedColumnList toEnum(Boolean value) {
            if (value != null && value) {
                return IndexedFields;
            } else {
                return UnIndexedFields;
            }
        }
    }
}
