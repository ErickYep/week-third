package day12;

public class Task7 {
    public static void main(String[] args) {
        //this function and overloads returns max Value of this ints
    }

    static int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    static int max(int a, int b, int c) {
        if (a > b){
            if (a > c)
                return a;
            else return c;
        }
        else if (b>c)
            return b;
        else return c;
    }

    static int max(int a, int b, int c, int d){
        int max = a;
        int[] array = {a,b,c,d};
        for (int i = 1; i < array.length; i++) {
            if(max<array[i])
                max = array[i];
        }
        return max;
    }
}
