package by.kudko.recursion;

public class Main {
    public static void main(String[] args) {
        int[] array = new  int[5];

        for (int i = 0; i < array.length; i++){
            array[i] = i + 1;
        }

        System.out.println(SumRec.sum(array, array.length));
    }
}