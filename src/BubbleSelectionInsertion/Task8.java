package BubbleSelectionInsertion;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        String [] array = {"Armen","Hasmik","Karen","Vardan","Babken"};
        System.out.println(Arrays.toString(array));
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void insertionSort(String[] array) {
       String temp;
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j != 0) {
                if (array[j].compareTo(array[j - 1]) < 0) {
                   temp = array[j];
                   array[j] = array[j-1];
                   array[j-1] = temp;
                    // swap(array[i],array[i-1]);
                }
                j--;
            }
        }
    }

    static void swap(String a, String b) {
        String temp = a;
        a = b;
        b = temp;
    }
}
