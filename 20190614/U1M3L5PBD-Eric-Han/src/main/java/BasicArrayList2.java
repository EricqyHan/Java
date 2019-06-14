import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BasicArrayList2 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> arrayListTwo = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            arrayListTwo.add(random.nextInt(100)+1);
        }
        System.out.println("Array list: " + arrayListTwo);
    }
}

