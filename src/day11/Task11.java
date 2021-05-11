package day11;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        //counting sum of numbers which have eight
        magicSum();
    }

    static void magicSum() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.println("Enter number or enter -1 to end");
            int n = scanner.nextInt();
            if (n == -1) {
                break;
            }
            String number = n + "";
            for (int i = 0; i < number.length(); i++) {
                if (number.charAt(i) == '8')
                    count += n;
            }
        }
        System.out.println(count);
    }
}
