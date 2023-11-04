import java.util.*;

public class Main {
    public static void main(String[] args) {
        //initilization of new array of size 10

        int[] intArray = new int[10];
        for(int i = 0; i < intArray.length; i++){
            //assigning the index i of an array to a number i.
            intArray[i] = i;
            //printing out this number located at the index i
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