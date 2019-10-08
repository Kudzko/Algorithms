package by.kudko.recursion;

import java.util.Arrays;

public class QuickSort {
    public static void sort(int[] array){
       int first = 0;
       int last = array.length - 1;

       quickSort(array, first, last);
    }

    public static void quickSort(int[] array, int first, int last) {
        if (array.length == 0){
            return;//if array has no elements then it's sorted
        }

        if (first >= last){
            return;//if array has only one element - one's sorted
        }

        // bearing element
        int middle = first + (last - first) / 2;
        int bearingEl = array[middle];

        // dividing array for subarrays
        int i = first, j = last;
        while (i <= j) {
            while (array[i] < bearingEl) {
                i++;
            }

            while (array[j] > bearingEl) {
                j--;
            }

            if (i <= j) {//swap elements
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // if array isn't sorted then sort subarrays
        if (first < j)
            quickSort(array, first, j);

        if (last > i)
            quickSort(array, i, last);
    }
    public static void main(String[] args) {
        int[] array = { 8, 0, 4, 7, 3, 7, 10, 12, -3 };
        System.out.println("input array");
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println("output array");
        System.out.println(Arrays.toString(array));
    }
}
