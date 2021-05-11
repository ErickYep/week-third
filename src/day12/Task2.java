package day12;

public class Task2 {
    public static void main(String[] args) {
        //we cant write 2 functions with same name and same input type
        //we fixing it with changing input data type
    }
    static int returnValue(int a){
        return a;
    }
    static float returnValue(double a){
        float b = (float)a;
        return b;
    }
}
