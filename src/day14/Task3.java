package day14;

public class Task3 {
    public static void main(String[] args) {
//        Compute
//        recursively (no loops or multiplication) the total number of blocks in
//        such a triangle with the given number of rows
        System.out.println(triangle(5));
    }
    static int triangle(int n){
        if(n == 0)
            return n;
        return n + triangle(n-1);
    }
}
