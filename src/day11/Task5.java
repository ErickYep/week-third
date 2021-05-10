package day11;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(isPrime(17));
    }
    static boolean isPrime(int n){
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i ==0)
                count++;
        }
        if(count == 2)
            return true;
        return false;
    }
}
