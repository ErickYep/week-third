package day11;

import java.util.Random;

public class Task13 {
    public static void main(String[] args) {
        Random rd = new Random();
        int [] array = new int[10];
        for (int i = 0; i <10 ; i++) {
            array[i] = rd.nextInt(10);
        }
        System.out.println(search(array,5));
    }
    public static int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == key)
                return i;
        }
        return -1;
    }
}
