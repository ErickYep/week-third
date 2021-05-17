package BubbleSelectionInsertion;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] array = Task1.fillArray(10);
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(searchElement(array, 55));
    }

    static void bubbleSort(int[] array) {
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
        System.out.println("Max Value is :" + array[array.length - 1]);
        System.out.println(("Min Value is :" + array[0]));
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == (array[array.length - 1] + array[0]) / 2) {
                System.out.println(i + "rd index is equal to min and max average");
                count++;
            }
        }
        if (count == 0)
            System.out.println("there isn't a number equals array min and max average");
    }

    static boolean searchElement(int[] array, int element) {
        return searchElement(array, element, 0, array.length - 1);

    }

    static boolean searchElement(int[] array, int element, int start, int end) {
        int mid = start + (end - start) / 2;
        if (array[mid] == element)
            return true;
        if (end - start == 0)
            return false;
        if (array[mid] < element)
            return searchElement(array, element, mid, end);
        return searchElement(array, element, start, mid);

    }

}
