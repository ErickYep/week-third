package day14;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(triangle(5));
    }
    static int triangle(int n){
        if(n == 0)
            return n;
        return n + triangle(n-1);
    }
}
