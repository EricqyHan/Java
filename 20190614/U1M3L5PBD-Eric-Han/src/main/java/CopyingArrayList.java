import java.util.ArrayList;
import java.util.Random;

public class CopyingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Random random = new Random();

        // Create an array list of integers

        for(int i = 0; i < 10; i++){
            arrayList.add(random.nextInt(100)+1);
        }
        System.out.println("Original Array List");
        System.out.println("ArrayList 1: " + arrayList);
        //arrayList.clone();
        System.out.println("ArrayList 2: " + arrayList.clone());


        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        for(int element : arrayList){
            arrayList2.add(element);
        }
        //System.out.println("array list 2 " + arrayList2);
        arrayList.set(9,-7);

        System.out.println("New Array List");
        System.out.println("ArrayList 1: " + arrayList);
        System.out.println("ArrayList 2: " + arrayList2);

    }

}
