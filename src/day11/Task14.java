package day11;

public class Task14 {
    public static void main(String[] args) {

    }
    public static int[] copyOf(int[] array){
        int [] arrCopy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrCopy[i] = array[i];
        }
        return arrCopy;
    }
}
