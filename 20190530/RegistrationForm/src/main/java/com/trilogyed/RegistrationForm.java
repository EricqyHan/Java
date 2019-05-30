package com.trilogyed;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class RegistrationForm {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String firstname;
        String lastName;
        String email;
        String twitterHandle;
        int age;
        String country;
        String profession;
        String favoriteOperatingSystem;
        String favoriteProgrammingLanguage;
        String favoriteComputerScientist;
        String favoriteKeyboatdShortcut;
        Boolean builtComputer;
        String favoriteSuperHero;



        System.out.println("What is your first name?");
        firstname = myScanner.nextLine();

        System.out.println("What is your last name?");
        lastName = myScanner.nextLine();

        System.out.println("What is your email?");
        email = myScanner.nextLine();

        System.out.println("What is your Twitter handle?");
        twitterHandle = myScanner.nextLine();

        System.out.println("What is your age?");
        age = Integer.parseInt(myScanner.nextLine());

        System.out.println("What Country are you from?");
        country = myScanner.nextLine();

        System.out.println("What is your profession?");
        profession = myScanner.nextLine();

        System.out.println("What is your favorite operating system?");
        favoriteOperatingSystem = myScanner.nextLine();

        System.out.println("What if your favorite programming language?");
        favoriteProgrammingLanguage = myScanner.next();

        System.out.println("What if your favorite computer scientist?");
        favoriteComputerScientist = myScanner.next();

        System.out.println("What if your favorite keyboard shortcut?");
        favoriteKeyboatdShortcut = myScanner.next();

        System.out.println("Have you ever built your own computer?");
        builtComputer = myScanner.nextBoolean();

        System.out.println("If you could be any superohero, who would it be?");
        favoriteSuperHero = myScanner.next();


        System.out.println("First Name: " + firstname);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Twitter handle: " + twitterHandle);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
        System.out.println("Profession: " + profession);
        System.out.println("What is your favorite operating system: " + favoriteOperatingSystem);
        System.out.println("Favorite programming language: " + favoriteProgrammingLanguage);
        System.out.println("Favorite computer scientist: " + favoriteComputerScientist);
        System.out.println("Favorite keyboard shortcut: " + favoriteKeyboatdShortcut);
        System.out.println("Built your own computer:" + builtComputer);
        System.out.println("If you could be any superohero, it would be: " + favoriteSuperHero);



    }
}
