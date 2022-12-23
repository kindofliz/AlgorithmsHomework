package HW2;

import java.util.Arrays;
import java.util.Random;

/**
 * Implement data sorting by Quick sort.
 * Choose a pivot as the middle element.
 * Sort the data in ascending order.
 * Determine a running time dependence on the input size when data is randomly distributed.
 * Use 3 small input sizes (20-150) and 3 large input sizes (>10 000);
 * with the same data size run at least 10 tests.
 */

public class Main {
    public static void main(String[] args) {

        //INSTANTIATION OF ARRAYS WITH SMALL INPUT SIZES
        int[] data20 = new int[20];
        int[] data90 = new int[90];
        int[] data150 = new int[150];

        //INSTANTIATION OF ARRAYS WITH LARGE INPUT SIZES
        int[] data10K = new int[10000];
        int[] data30K = new int[30000];
        int[] data50K = new int[50000];


        //CALL A STATIC METHOD TO SORT AND PRINT THE GIVEN ARRAY 10 TIMES
        int count = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println("#" + count);
            generateArrayAndCallQuickSort(data50K);
            count++;
        }
    }


    //STATIC METHOD THAT CREATES THE ARRAY, CALLS THE QUICKSORT AND PRINTS THE RESULTS
    private static void generateArrayAndCallQuickSort(int[] array) {
        generateArrayData(array);

        System.out.println("Unsorted Array (length: " + array.length + ")");
        System.out.println(Arrays.toString(array));
        System.out.println();

        long start = System.nanoTime();
        quickSort(array, 0, array.length - 1);
        long end = System.nanoTime();
        long duration = end - start;

        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println("Sorting took " + (duration + " nano time, or " + (duration) / 1000_000f + " milliseconds"));

        System.out.println("--------------------------------");
        System.out.println();
    }


    //METHOD TO GENERATE AND FILL ARRAY DATA
    private static void generateArrayData(int[] array) {
        Random randomNumber = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumber.nextInt(5000);
        }
    }


    //QUICKSORT ALGORITHM STATIC METHODS
    static int partition(int[] arr, int left, int right) {
        int pivot = arr[(left + right) / 2];
        int i = left;
        int j = right;
        int tmp;

        while (i <= j) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }
        return i;
    }

    static void quickSort(int[] arr, int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1)
            quickSort(arr, left, index - 1);
        if (index < right)
            quickSort(arr, index, right);
    }

}
