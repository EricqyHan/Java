import java.util.Scanner;

public class RectangularPavingCompany {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int widthFeet;
        int lengthFeet;

        System.out.println("What is the width of the driveway?");
        widthFeet = Integer.parseInt(myScanner.nextLine());

        System.out.println("What is the length of the driveway?");
        lengthFeet = Integer.parseInt(myScanner.nextLine());

        // area of rectangle is length * width
        int areaOfDriveway = (widthFeet * lengthFeet);
        System.out.println("The area of the driveway is " + areaOfDriveway + " feet.");

        // perimeter of rectangle is 2(length  + width)
        int perimeterOfDriveway = 2*(widthFeet + lengthFeet);
        System.out.println("The perimeter of the driveway is " + perimeterOfDriveway + " feet.");

        // Cement $12.50/square foot
        double cementCost = (areaOfDriveway * 12.50);
        System.out.printf("The cost of the cement will be $" + cementCost);

        // framing/footers $8.25/linear foot
        double framingCost = (perimeterOfDriveway * 8.50);
        System.out.printf("The cost of the framing footers will be $ " + framingCost);



    }
}
