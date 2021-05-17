package BubbleSelectionInsertion;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        //Bubble Sort function
        int [] array = fillArray(100);
        System.out.println(Arrays.toString(array));
        array = bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    static int[] fillArray(int n) {
        int[] array = new int[n];
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = rd.nextInt(101);
        }
        return array;
    }

    static int[] bubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}

