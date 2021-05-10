package day11;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(fib(11));
    }

    static int fib(int n) {
        int first = 0;
        int second = 1;
        int count = 0;
        if(n == 1)
            return 0;
        if(n == 2)
            return 1;
        for (int i = 1; i <= n-2; i++) {
            count = first + second;
            first = second;
            second = count;
        }
        return count;
    }
}
