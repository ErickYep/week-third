package day14;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(sevenCount(717));
    }

    static int sevenCount(int n) {
        if (n == 0)
            return n;
        if ((n % 10) % 7 == 0)
            return 1 + sevenCount(n/10);
        return sevenCount(n/10);
    }
}
