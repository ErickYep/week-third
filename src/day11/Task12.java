package day11;

import java.util.Random;

public class Task12 {
    public static void main(String[] args) {
        Random rd = new Random();
        int [] array = new int[10];
        for (int i = 0; i <10 ; i++) {
            array[i] = rd.nextInt(10);
        }
        System.out.println(contains(array,7));
    }

    static boolean contains(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == n)
                return true;
        }
        return false;
    }
}
