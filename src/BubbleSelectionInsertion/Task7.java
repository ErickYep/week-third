package BubbleSelectionInsertion;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        String [] array = {"Armen","Hasmik","Karen","Vardan","Babken"};
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(Arrays.toString(array));

    }
    static void selectionSort(String [] array){
        String min = array[0];
        int index = 0;
        int count = 0;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[j].compareTo(min)<0) {
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
