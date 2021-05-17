package day14;

public class Task4 {
    public static void main(String[] args) {
        // return the sum of its digits recursively
        System.out.println(digitSum(12345));
    }
    static int digitSum(int n){
        if(n == 0)
            return n;
        return n%10 + digitSum(n/10);
    }
}
