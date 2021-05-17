package BubbleSelectionInsertion;

public class Task9 {
    public static void main(String[] args) {
        int[] array = Task1.fillArray(15);
        Task6.selectionSort(array);
        System.out.println(binarySearch(array,5 ));
    }

    static int binarySearch(int[] array, int num, int start, int end) {
        int mid = start + (end - start) / 2;
        if (array[mid] == num)
            return mid;
        if (array[mid] < num)
            return binarySearch(array, num, mid, end);
        return binarySearch(array, num, start, mid);
    }

    static int binarySearch(int[] array, int num) {
        return binarySearch(array, num, 0, array.length - 1);
    }
}
