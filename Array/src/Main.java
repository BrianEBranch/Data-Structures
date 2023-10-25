import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        An array is a collection of items following the order they were inserted in.
        Array items can be directly accessed by calling the index of the item.

        Array Advantages:
        - Random Access
        - Easy sorting and iteration
        - Replacement of multiple variables
        Array Disadvantages:
        - Size if fixed
        - Needs contiguous memory to get allocated
        - Difficult ot insert and delete.
         */
        //Array of integers implementation
        int[] intArray = new int[10];
        for(int i = 0; i < intArray.length; i++){
            intArray[i] = i;
            System.out.print(intArray[i] + ",");
        }
        //Array of strings implementation
        System.out.println("\n");
        String[] stringArray = new String[4];
        stringArray[0] = "This";
        stringArray[1] = "is";
        stringArray[2] = "an";
        stringArray[3] = "array";
        for(int i = 0; i < stringArray.length; i++){
            System.out.print(stringArray[i] + " ");
        }



    }
}