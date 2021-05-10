package day11;

import java.util.Random;
import java.util.Scanner;

public class arrayClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        System.out.println("Enter the size");
        int size = scanner.nextInt();
        array = initializeArray(size);
        printArray(array);
        reverseSign(array);
        printArray(array);
    }


    public static int[] initializeArray(int size) {
        Random random = new Random();
        int[] name = new int[size];
        for (int i = 0; i < size; i++) {
            name[i] = random.nextInt();
        }
        return name;
    }

    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");

        }
        System.out.println();
    }

    public static void reverseSign(int[] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i]<0)
                array [i] *= -1;
        }
    }
}
