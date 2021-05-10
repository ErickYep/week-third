package day11;

public class Task7 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    static int factorial(int a){

        int count = 1;
        for (int i = 1; i <= a; i++) {
            count *=i;
        }
        return count;
    }
}
