package day14;

public class Task1 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        System.out.println(arraySum(a, 4));
        System.out.println(factorial(5));
    }
    static int arraySum(int [] arr,int length){
        if(length == 0)
            return arr[0];
        return arraySum(arr,length-1) + arr[length];
    }
    static int factorial(int n){
        if(n == 1)
            return 1;
        return n*factorial(n-1);
    }
}
