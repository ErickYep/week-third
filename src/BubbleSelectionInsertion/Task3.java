package BubbleSelectionInsertion;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        String[] str = {"awdiug", "udrfgkj", "afiytwe8y", "qiwyeyt", "wdiyyg"};
        System.out.println(Arrays.toString(str));
        bubbleSort(str);
        System.out.println(Arrays.toString(str));
    }
    static void bubbleSort(String[] sr) {
        bubbleSort(sr,sr.length);
    }
    static void bubbleSort(String[] sr,int n) {
        if (n == 1)
            return;
        String  temp;
        for (int i = 0; i < sr.length-1; i++) {
            if(sr[i].compareTo(sr[i+1])>0){
                temp = sr[i];
                sr[i] = sr[i+1];
                sr[i+1] = temp;
            }
        }
        bubbleSort(sr,n-1);
    }

}
