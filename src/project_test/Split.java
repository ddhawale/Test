package project_test;

/**
 * Created by root on 5/5/15.
 */
public class Split {
    public static void main (String args[])
    {
        String splitMe = "as$$ds$$dscs";
        String splitter = "$$";

        String split[] = splitMe.split(java.util.regex.Pattern.quote(splitter), 3);
        for (String s : split)
        {
            System.out.println("\n\n s : - " + s);
        }
    }
}
