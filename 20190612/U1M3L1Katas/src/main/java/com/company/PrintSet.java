package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PrintSet {
    //Map<String, Integer> heights = new HashMap<String, Integer>();
//5,1,2,1,4,1,5. Use an Iterator to print all members of the HashSet.
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<Integer>();

        hs.add(5);
        hs.add(1);
        hs.add(2);
        hs.add(1);
        hs.add(4);
        hs.add(1);
        hs.add(5);

        //System.out.println(hs);
        for (Integer Hset : hs) {
            System.out.println("Map Values " + Hset);

        }

    }
}
