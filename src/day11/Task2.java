package day11;

public class Task2 {
    public static void main(String[] args) {
        //calculating the value of a to the power of n
        System.out.println(powerOf(2,3));
    }
    static double powerOf(double a, int n){
        double count = a;
        if(n == 1)
            return count;
        for (int i = 1; i < n; i++) {
            count *= a;
        }
        return count;
    }
}
