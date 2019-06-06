package com.company;



public class App {

    public static TV createTV(){
        return new TV("Zenith", "U2121H", 83, "NBC", 55, false);
    }


    public static Radio createRadio(){
        return new Radio("Sony", "V32", 2, "WUNV", 30, true);
    }

    public static Microwave createMicrowave(){
        return new Microwave("Haier", "X1200w", 45, "12:00", false);
    }
    public static CoffeeMaker createCoffeeMaker(){
        return new CoffeeMaker("Sunbeam", "C12", 12, 8, true);
    }

    public static Car createCar(){
        return new Car("Honda", "Accord", "Sedan", "Blue", "2.6L V6", "CVT", 4, 31.7, 25218);
    }

    public static ComputerMouse createComputerMouse(){
        int [] arr = new int[] {0,0};
        return new ComputerMouse("Razer", "Naga", 960, 540, arr);
    }

}


