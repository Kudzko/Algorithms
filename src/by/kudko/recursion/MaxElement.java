package by.kudko.recursion;

public class MaxElement {
    public static int maxElement(int[] array) {
        int max = -1;

        if (array.length == 2) {
            if (array[0] > array[1]) {
                max = array[0];
            } else {
                max = array[1];
            }
            return max;

        }
        return array[array.length - 1] > maxElement(cutArray(array)) ? array[array.length - 1] : maxElement(cutArray(array));

    }

    private static int[] cutArray(int[] array) {
        int[] newArray = new int[array.length - 1];
        for (int i = 0; i < array.length - 1; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }
}
