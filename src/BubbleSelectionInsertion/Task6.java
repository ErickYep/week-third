package BubbleSelectionInsertion;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] arr = Task1.fillArray(7);
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int [] array){
        int min = array[0];
        int index = 0;
        int count = 0;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[j] < min) {
                    min = array[j];
                    index = j;
                    count++;
                }
            }
            if(count == 0){
                min = array[i+1];
                continue;}
            array[index] =array[i];
            array[i] = min;
            min = array[i+1];
            count = 0;
        }
    }
}
