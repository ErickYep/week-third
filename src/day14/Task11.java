package day14;

public class Task11 {
    public static void main(String[] args) {
        System.out.println(primeOrNot(7, 2));
    }

    static boolean primeOrNot(int n, int divisor) {
        if (n <= 2)
            return true;
        if(n==divisor)
            return true;
        if (n % divisor == 0)
            return false;

        return(primeOrNot(n,divisor+1));
    }
}
