package my_world.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by root on 6/30/15.
 */
public class MapDemo {
    public static void main(String args[]) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1,"dd");
        Map<Integer,String> map1 = new HashMap<Integer, String>(map);
        map1.put(2,"sd");
        Map<Integer,String> map2 = new HashMap<Integer, String>();
        map2.putAll(map1);
        map2.put(3,"ssdd");
        Map<Integer,String> map3 = map; //this replaces
        map3.put(4,"sssdd");

        System.out.println(map);
        System.out.println(map1);
        System.out.println(map2);
        System.out.println(map3);
    }
}

/*
{1=dd, 4=sssdd}
{1=dd, 2=sd}
{1=dd, 2=sd, 3=ssdd}
{1=dd, 4=sssdd}
 */
