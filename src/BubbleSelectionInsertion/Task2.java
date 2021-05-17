package BubbleSelectionInsertion;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int [] array = Task1.fillArray(10);
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }


    static void bubbleSort(int arr[]){
        bubbleSort(arr,arr.length);
    }
    static void bubbleSort(int arr[], int n)
    {
        if (n == 1)
            return;
        for (int i=0; i<n-1; i++)
            if (arr[i] > arr[i+1])
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        bubbleSort(arr, n-1);
    }
}
