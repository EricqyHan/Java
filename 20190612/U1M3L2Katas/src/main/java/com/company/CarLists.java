package com.company;

import java.util.*;

public class CarLists {

    public static void main(String[] args) {

        Car camry = new Car("Toyota", "Camry");
        Car corolla = new Car("Toyota", "Corolla");
        Car highlander = new Car("Toyota", "Highlander");

        Car mustang = new Car("Ford", "Mustang");
        Car fusion = new Car("Ford", "Fusion");
        Car taurus = new Car("Ford", "Taurus");

        Car accord = new Car("Honda", "Accord");
        Car civic = new Car("Honda", "Civic");
        Car fit = new Car("Honda", "Fit");

        List<String> myList = new ArrayList<>();

        //i Create a list called toyotaList to hold all the Car variables with"Toyota"
        // as the manufacture and add them to the list

        System.out.println("Toyota List");
        List<Car> toyotaList = new ArrayList<>();
        toyotaList.add(camry);
        toyotaList.add(corolla);
        toyotaList.add(highlander);
        for (Car temp : toyotaList) {
            System.out.println("Make: " + temp.getMake() + "   Model: " + temp.getModel());
        }
        System.out.printf(" %n");

        //ii Create a list called fordList to hold all the Car variables with"Ford"
        // as the manufacture and add them to the list

        System.out.println("Ford List");
        List<Car> fordList = new ArrayList<>();
        fordList.add(fusion);
        fordList.add(mustang);
        fordList.add(taurus);

        for (Car temp : fordList) {
            System.out.println("Make: " + temp.getMake() + "   Model: " + temp.getModel());
        }
        System.out.printf(" %n");

        //iii Create a list called hondaList to hold all the Car variables with"Honda"
        // as the manufacture and add them to the list

        System.out.println("Honda List");
        List<Car> hondaList = new ArrayList<>();
        hondaList.add(accord);
        hondaList.add(civic);
        hondaList.add(fit);
        for (Car temp : hondaList) {
            System.out.println("Make: " + temp.getMake() + "   Model: " + temp.getModel());
        }

        //iv Store all 3 list in a map with the manufacturer inside your map
        //Set<Map.Entry<String, String>> baseballEntries = baseballTeam.entrySet();

        Map<String, String> carList = new HashMap<>();
        //Toyota
        carList.put("Toyota", "Camry");
        carList.put("Toyota", "Corolla");
        carList.put("Toyota", "Highlander");
        //Ford
        carList.put("Ford", "Fusion");
        carList.put("Ford", "Mustang");
        carList.put("Ford", "Taurus");
        //honda
        carList.put("Honda", "Accord");
        carList.put("Honda", "Civic");
        carList.put("Honda", "Fit");



    }
    }
