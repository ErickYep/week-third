package day12;

public class Task5 {
    public static void main(String[] args) {
        //first function returns size of array
        //2nd function overload search int in array and returns index
        //3rd function overload sees whether in array at that index is the number we give
    }
    static int search(int[] array){
        return array.length;
    }
    static int search(int[] array,int a){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == a)
                return i;
        }
        return -1;
    }
    static boolean search(int[] array, int argument, int index){
        return array[index] == argument;
    }
}
