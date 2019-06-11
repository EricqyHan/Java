package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Classmate> classmates = new ArrayList<>();

        Classmate darylCimafranca = new Classmate("Daryl Cimafranca", "Black");
        Classmate perriLove = new Classmate( "Perri Love", "Black");
        Classmate mikeCirincione = new Classmate( "Michael Cirincione", "Strawberry Blonde");
        Classmate amoritaChristian = new Classmate( "Amorita Christian", "Black");
        Classmate muratSurenler = new Classmate( "Murat Surenler", "No Hair");

                classmates.add(darylCimafranca);
                classmates.add(perriLove);
                classmates.add(mikeCirincione);
                classmates.add(amoritaChristian);
                classmates.add(muratSurenler);

                for(Classmate element: classmates){
                    System.out.println("My classmate is " + element.getName() + " and their hair color is " + element.getHairColor());
                }
    }

}
