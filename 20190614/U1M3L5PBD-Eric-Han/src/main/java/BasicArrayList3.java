import java.util.ArrayList;
import java.util.Random;

public class BasicArrayList3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            arrayList.add(random.nextInt(90)+10);
        }
        System.out.println("Array List: " + arrayList);
    }
}
