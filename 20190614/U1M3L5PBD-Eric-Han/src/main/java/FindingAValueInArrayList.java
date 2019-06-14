import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FindingAValueInArrayList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        Scanner myScanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(50)+1);
        }
        System.out.println("ArrayList: " + arrayList);
        System.out.println("Value to find ");
        String userInput = myScanner.nextLine();
        int userNum = Integer.parseInt(userInput);

        for(int i = 0; i < 10; i++){
            if (arrayList.get(i) == userNum){
                System.out.println(userInput + " is in the array");
            }
        }

    }
}
