package com.company;

import java.util.*;

public class IterateAndPrint {

    public static void main(String[] args) {

        Map<String, String> baseballTeam = new HashMap<>();

        baseballTeam.put("Pitcher", "Mike Foltynewicz");
        baseballTeam.put("Catcher", "Brian McCann");
        baseballTeam.put("First Baseman", "Freddie Freeman");
        baseballTeam.put("Second Baseman", "Ozzie Albies");
        baseballTeam.put("Third Baseman", "Josh Donaldson");
        baseballTeam.put("Shortstop", "Dansby Swanson");
        baseballTeam.put("Left Fielder", "Ronald Acuna, Jr.");
        baseballTeam.put("Center Fielder", "Ender Inciarte");
        baseballTeam.put("Right Fielder", "Nick Markakis");

        System.out.println("1. Iterate through and print out all keys in the Map.");
        Set<String> keys = baseballTeam.keySet();
        for(String key : keys){
            System.out.println("Map  Key : " + key);
        }

        System.out.println("2. Iterate through and print out all values in the Map");
        Collection<String> values = baseballTeam.values();

        for(String value : values) {
            System.out.println("Map Values : " + value);
        }

        System.out.println("3. iterate through the Entry Set of the Map and print both the keys and values in the Map");
        Set<Map.Entry<String, String>> baseballEntries = baseballTeam.entrySet();

        for(Map.Entry<String, String> entry : baseballEntries){
            System.out.println("Key - " + entry.getKey() + " - Value " + entry.getValue());
        }

    }

}