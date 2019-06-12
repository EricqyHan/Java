package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapFun {
    public static void main(String[] args) {
        HashMap<String, Integer> carList = new HashMap<>();

        carList.put("Toyota Camry", 2012);
        carList.put("Chevy Camaro", 1969);
        carList.put("Hyundai Genesis", 2015);
        carList.put("Jeep Wrangler", 2006);
        carList.put("Honda Civic", 2018);
        carList.put("Toyota Supra", 1995);
        carList.put("Pontiac GTO", 1964);

        //Key Value Pairs
        Set<Map.Entry<String, Integer>> myEntries = carList.entrySet();

        for(Map.Entry<String, Integer> entry : myEntries){
            System.out.println("Key - " + entry.getKey() + " - Value " + entry.getValue());
        }

        // Add Two new entries to the Map
        carList.put("Ford Explorer", 2012);
        carList.put("Smart ForTwo", 2013);

        // Print out all key/value pairs in the Map
        for(Map.Entry<String, Integer> entry : myEntries){
            System.out.println("Key after  - " + entry.getKey() + " - Value " + entry.getValue());
        }

        carList.remove("Jeep Wrangler");

        // Print out all key/value pairs in the Map
        for(Map.Entry<String, Integer> entry : myEntries){
            System.out.println("Key after remove - " + entry.getKey() + " - Value " + entry.getValue());
        }

    }
}


