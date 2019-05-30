import java.util.Scanner;

public class RectangularPavingCompany2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        double costOfCement;
        double costOfFooting;
        int widthFeet;
        int lengthFeet;

        System.out.println("What is the width of the driveway?");
        widthFeet = Integer.parseInt(myScanner.nextLine());

        System.out.println("What is the length of the driveway?");
        lengthFeet = Integer.parseInt(myScanner.nextLine());

        System.out.println("What is the cost of cement?");
        costOfCement = Double.parseDouble(myScanner.nextLine());

        System.out.println("What is the cost of cement?");
        costOfFooting = Double.parseDouble(myScanner.nextLine());

        // area of rectangle is length * width
        int areaOfDriveway = (widthFeet * lengthFeet);
        System.out.println("The area of the driveway is " + areaOfDriveway + " feet.");

        // perimeter of rectangle is 2(length  + width)
        int perimeterOfDriveway = 2*(widthFeet + lengthFeet);
        System.out.println("The perimeter of the driveway is " + perimeterOfDriveway + " feet.");

        // Cement cost what user says it cost
        double cementCost = (areaOfDriveway * costOfCement);
        System.out.printf("The cost of the cement will be %.2f \n", cementCost);

        // framing/footers cost what user says it cost
        double framingCost = (perimeterOfDriveway * costOfFooting);
        System.out.printf("The cost of the framing footers will be %.2f \n", framingCost);
    }
}
