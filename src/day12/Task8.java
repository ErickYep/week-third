package day12;

public class Task8 {
    public static void main(String[] args) {
        //function returns distance of coordinates
    }

    static double distance(int a, int b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
    static double distance(int a, int b,int c,int d) {
        return Math.sqrt(Math.pow((a-c), 2) + Math.pow((b-d), 2));
    }
}
