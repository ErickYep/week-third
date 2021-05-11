package day12;

public class Task1 {
    public static void main(String[] args) {
        //prints which method of overload are using
    }
    static void add(int a,int b){
        System.out.println("Number of parameters");
    }
    static void add(int a, float b){
        System.out.println("Data types of parameters");
    }
    static void add(float a, int b){
        System.out.println("Sequence of parameters");
    }
}
