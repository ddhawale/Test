package project_test;

/**
 * Created by root on 9/1/14.
 */
public class ReplaceString {
    public static void main (String args[])
    {
        String originalString = "ds_internal_401_part_0_dinkar_idx";
        String firstPartition = "ds_internal_401_part_0";
        System.out.println("\n Original Sting : " + originalString);

        String [] ids = originalString.split("_");
        for(String s : originalString.split("_"))
        {
            System.out.println(s);
        }
        System.out.println(ids[2]);
        System.exit(0);
        for(int i=0;i<2;i++)
        {
            originalString = originalString.replaceFirst("part_[0-9]*", "part_" + Integer.toString(i));
            System.out.println(" Replaced Sting : " + originalString);
            String thisPartition = firstPartition.substring(0, firstPartition.length()-1) + Integer.toString(i);
            System.out.println(" New  Replaced Sting : " + originalString.replaceFirst(firstPartition, thisPartition));
        }
    }
}
