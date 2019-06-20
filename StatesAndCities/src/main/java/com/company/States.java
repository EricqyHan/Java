package com.company;

public class States {
    private String stateName;
    private int statePopulation;

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public int getStatePopulation() {
        return statePopulation;
    }

    public void setStatePopulation(int statePopulation) {
        this.statePopulation = statePopulation;
    }

    public void printStateInfo(){
        System.out.println("State Name: " + getStateName());
        System.out.println("State Population: " + getStatePopulation());

    }
}
