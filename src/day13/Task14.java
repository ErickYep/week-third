package day13;

public class Task14 {
    public static void main(String[] args) {

    }
    static int occurrences(String string, char ch){
        char[] chars = string.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if(ch==chars[i])
                count++;
        }
        return count;
    }
}
