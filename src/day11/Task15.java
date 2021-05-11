package day11;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        //finding best grade and average of grades
        int[] array = grade();
        System.out.println("Average grade is :" + averageGrade(array));
        System.out.println("Max is :"+maxGrade(array));
        System.out.println("Min is :" + minGrade(array));
    }

    static int[] grade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student count :");
        int count = scanner.nextInt();
        int[] gradeArray = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Enter the grade(0-100) for student " + (i + 1));
            gradeArray[i] = scanner.nextInt();
            if (gradeArray[i] > 100 || gradeArray[i] < 0) {
                System.out.println("Please enter again");
                i--;
            }
        }
        return gradeArray;
    }

    static double averageGrade(int[] array) {
        double count = 0;
        for (int j : array) {
            count += j;
        }
        return (double) Math.round((count / array.length) * 100) / 100;
    }

    static int maxGrade(int[] array) {
        int max = array[0];
        for (int j : array) {
            if (max < j)
                max = j;
        }
        return max;
    }
    static int minGrade(int[] array) {
        int min = array[0];
        for (int j : array) {
            if (min > j)
                min = j;
        }
        return min;
    }
}
