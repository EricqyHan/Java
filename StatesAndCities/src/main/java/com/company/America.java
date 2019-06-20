package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class America {
    private List<States> stateList;
    private Scanner myScanner;

    public America() {
        stateList = new ArrayList<>();
        myScanner = new Scanner(System.in);
    }

    public String getInput(String prompt){
        System.out.println(prompt);
        return myScanner.nextLine();
    }

    public void addState(){
States newStates = new States();

        newStates.setStateName(getInput("State: "));
        //newState.setPopulation(getInput("Population: "));

        boolean success = false;

        while(!success) {
            try {
                newStates.setStatePopulation(Integer.parseInt(getInput("State Population: ")));
                success = true;
            } catch (Exception e) {
                System.out.println("Invalid input. Please input only numbers.");
            }
        }
        stateList.add(newStates);
    }

    public void listStates(){
        for (int i = 0; i < stateList.size(); i++){
            States states = stateList.get(i);
            System.out.println("Index: " + i);
            states.printStateInfo();
        }
    }

}
