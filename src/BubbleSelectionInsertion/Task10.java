package BubbleSelectionInsertion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        String string = "trxtfcgvhhiuttdyrr";
        System.out.println(string);
        string = insertionSort(string);
        System.out.println(string);
        System.out.println(binarySearch(string,'r'));
    }
    static String insertionSort(char[] array) {
        char temp;
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j != 0) {
                if (array[j]<array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
                j--;
            }
        }
        return new String(array);
    }
    static String insertionSort(String string) {

      return  insertionSort(string.toCharArray());
    }

    static int binarySearch(char[] string, char ch, int start, int end) {
        int mid = start + (end - start) / 2;
        if (string[mid] == ch)
            return mid;
        if (string[mid] < ch)
            return binarySearch(string, ch, mid, end);
        return binarySearch(string, ch, start, mid);
    }

    static int binarySearch(String string, char ch) {
        return binarySearch(string.toCharArray(), ch, 0, string.length() - 1);
    }
}
