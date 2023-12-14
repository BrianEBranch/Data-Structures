import java.util.Arrays;
public class Main {
    private static int iterationCount = 0;
    public static void main(String[] args) {
        //INSERTIONSORT

//        JUST CHANGE NUMBERS!
        /*
        int[] array = {12, 14, 15, 19, 2, 1, 6};
        insertionSort(array);
         */

        //MERGESORT
        /*
        CHANGE NUMBERS, IF YOU CHANGE ANYTHING ELSE CAN NOT GUARANTEE IT WILL PRINT LIKE YOU WANT.

        int[] array = {12, 14, 15, 19, 2, 1, 6, 8, 5, 10};
        System.out.println("Original array: " + arrayToString(array, 0 , array.length - 1));
        System.out.println();
        mergeSort(array, 0, array.length - 1);
        System.out.println("Sorted Array: " + arrayToString(array, 0, array.length - 1));
        
         */


        /*
        //QUICKSORT

        CHANGE NUMBERS, IF YOU CHANGE ANYTHING ELSE CAN NOT GUARANTEE IT WILL PRINT LIKE YOU WANT.

        int[] array = {12, 14, 15, 19, 2, 1, 6, 8, 5, 10};
        System.out.println("Original array: " + arrayToString(array, 0, array.length - 1));
        System.out.println();
        quickSort(array, 0, array.length - 1);
        System.out.println("Sorted array: " + arrayToString(array, 0, array.length - 1));
         */

        //HEAPSORT
        /*
        CHANGE NUMBERS, IF YOU CHANGE ANYTHING ELSE CAN NOT GUARANTEE IT WILL PRINT LIKE YOU WANT.

        int[] array = {12, 14, 15, 19, 2, 1, 6, 8, 5, 10};
        System.out.println("Original array: " + arrayToString(array, 0, array.length - 1));
        System.out.println();
        heapSort(array);
        System.out.println("Sorted array: " + arrayToString(array, 0, array.length - 1));

         */
    }
    public static void insertionSort(int[] array){
        int n = array.length;
        for(int i = 1; i < n; i++){
            int key = array[i];
            int j = i - 1;
            System.out.println("Iteration: " + i);
            System.out.println("Array before swapping: " + Arrays.toString(array));
            //move elemnts that are great than key to one position ahead of their current position.
            while(j >= 0 && array[j] > key){
                System.out.println("Comparison: " + array[j] + " > " + key);
                System.out.println("Swapped: " + array[j] + " and " + array[j + 1]);
                array[j + 1] = array[j];
                System.out.println("Arrays after swapping: " + Arrays.toString(array));
                j--;
                System.out.println( );
            }
            //place the key in its correct position.
            array[j + 1] = key;
            System.out.println("Array after iteration " + i + ": " + Arrays.toString(array));
            System.out.println();
        }
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            System.out.println("Dividing: " + arrayToString(array, left, mid) + " | " + arrayToString(array, mid + 1, right));

            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            merge(array, left, mid, right);

            System.out.println("Merging: " + arrayToString(array, left, right));
        }
    }
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            System.out.println("Array before partitioning: " + arrayToString(array, low, high));
            int pivotIndex = partition(array, low, high);
            System.out.println("Pivot: " + array[pivotIndex]);
            System.out.println("Array after partitioning: " + arrayToString(array, low, high));
            System.out.println("Array after placing pivot: " + arrayToString(array, low, high));
            System.out.println("Iterations: " + ++iterationCount);
            System.out.println();

            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }
    public static void heapSort(int[] array) {
        int n = array.length;

        // Build max heap
        buildMaxHeap(array, n);

        for (int i = n - 1; i > 0; i--) {
            System.out.println("Heap before extracting max: " + arrayToString(array, 0, i));
            // Swap the root (maximum element) with the last element
            swap(array, 0, i);

            System.out.println("Heap after extracting max: " + arrayToString(array, 0, i - 1));
            System.out.println("Iterations: " + ++iterationCount);
            System.out.println();

            // Heapify the reduced heap
            heapify(array, i, 0);
        }
    }
    public static void buildMaxHeap(int[] array, int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }
    }

    public static void heapify(int[] array, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(array, i, largest);

            // Recursively heapify the affected sub-tree
            heapify(array, n, largest);
        }
    }
    public static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; ++i) {
            leftArray[i] = array[left + i];
        }

        for (int j = 0; j < n2; ++j) {
            rightArray[j] = array[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        System.out.println("Choosing pivot: " + pivot);

        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                System.out.println("Array before swapping: " + arrayToString(array, low, high));
                swap(array, i, j);
                System.out.println("Swapped " + array[i] + " and " + array[j]);
                System.out.println("Array after swapping: " + arrayToString(array, low, high));
                System.out.println();
            }
        }

        swap(array, i + 1, high);

        System.out.println("Final placement of pivot: " + arrayToString(array, low, high));
        System.out.println();
        return i + 1;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static String arrayToString(int[] array, int start, int end) {
        StringBuilder result = new StringBuilder("[");
        for (int i = start; i <= end; i++) {
            result.append(array[i]);
            if (i < end) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}