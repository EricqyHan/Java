package com.company;

import java.util.Scanner;

public class AgeAgain {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String grade;
        String planningAttendCollege;
        String futureCollege;
        String postHSPlan;
        String job;

        System.out.println("How old are you?");
        int age = Integer.parseInt(myScanner.nextLine());

        if (age < 14) {
            System.out.println("What grade are you in?");
            grade = myScanner.nextLine();
            System.out.println("Wow! " + grade +  " grade - that sounds exciting!");
        }

        if (age >= 14 && age <= 18) {
            System.out.println("Are you planning on attending College?");
            planningAttendCollege = myScanner.nextLine();
            if (planningAttendCollege.equals("yes")) {
                System.out.println("Which college are you planning on attending?");
                futureCollege = myScanner.nextLine();
                System.out.println(futureCollege + " is a great school!");
            } else if (planningAttendCollege.equals("no")) {
                System.out.println("What do you want to do after High School?");
                postHSPlan = myScanner.nextLine();
                System.out.println("Wow, " + postHSPlan + " sounds like a plan!");
            }
        }

        if (age > 18) {
            System.out.println("What is your job?");
            job = myScanner.nextLine();
            System.out.println(job + " sounds like a great job!");
        }

    }
}
