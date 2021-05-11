package day11;

public class Task1 {
    public static void main(String[] args) {
        //function finds the smallest of the given four numbers
        System.out.println(min(10,9,8,4));
    }
    static int min(int a, int b, int c, int d){
        int [] array = new int[4];
            array[0] = a;
            array[1] = b;
            array[2] = c;
            array[3] = d;
            int min = array[0];
        for (int i = 1; i < 4; i++) {
            if(array[i]<min)
                min = array[i];
        }
        return min;
    }
}
