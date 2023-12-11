import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //initilization of new array of size 10
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        int[] intArray = new int[10];
        for(int i = 0; i < intArray.length; i++){
            //assigning the index i of an array to a number i.
            intArray[i] = i;
            integerArrayList.add(i);
            //printing out this number located at the index i
            System.out.print("Regular Array: " + intArray[i] + ",");
            System.out.println("ArrayList: " + integerArrayList.get(i));
        }
        //Array of strings implementation
        System.out.println("\n");
        String[] stringArray = {"this", "is", "an", "array"};

        for (String s : stringArray) {
            System.out.print(s + " ");
        }

    }
}