package project_test;/*
 * -------------------------------------------------------------------- *
 *  STRONGMAIL SYSTEMS                                                  *
 *                                                                      *
 *  Copyright 2014 StrongMail Systems, Inc. - All rights reserved.      *
 *                                                                      *
 *  Visit http://www.strongmail.com for more information                *
 *                                                                      *
 *  You may incorporate this Source Code in your application only if    *
 *  you own a valid license to do so from StrongMail Systems, Inc.      *
 *  and the copyright notices are not removed from the source code.     *
 *                                                                      *
 *  Distributing our source code outside your organization              *
 *  is strictly prohibited                                              *
 *                                                                      *
 * -------------------------------------------------------------------- *
 */


import java.util.*;

/**
 * Created by root on 7/10/14.
 */
public class DD
{
    public static void main (String args[])
    {
        Map<String, String> userDefinedIndexes = new HashMap<String, String>();
        userDefinedIndexes.put("a","a");
        userDefinedIndexes.put("b","b");


        String[] dd = new String[]{"s","b"};
        List<String> pivots = new ArrayList<String>( Arrays.asList(dd) );
        List<String> pivots1 = Arrays.asList(dd);
        System.out.println("\n\n 1" + pivots);
        System.out.println("\n\n 2" + pivots1);
    }
}

// singleton, bridge, builder

