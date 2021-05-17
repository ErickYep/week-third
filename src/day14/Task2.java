package day14;

public class Task2 {
    public static void main(String[] args) {
        //Write a fib(int) function which returns n-th fibonacci number.
        System.out.println(fibonacci(20));
    }
    static int fibonacci(int n) {
        if (n == 1 )
            return 0;
        if(n==2)
            return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
