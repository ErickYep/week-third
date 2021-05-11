package day12;

public class Task10 {
    public static void main(String[] args) {
        //Sum of digits or sum of digits % num
    }

    static int reminder(int a) {
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }

    static int reminder(int a, int b) {
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum % b;
    }
}
