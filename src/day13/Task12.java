package day13;

public class Task12 {
    public static void main(String[] args) {
        //function that counts duplicate characters from a given string
        System.out.println(duplicChar("1122"));
    }

    static int duplicChar(String string) {
        int count = 0;
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (i == j)
                    continue;
                if (chars[i] == chars[j])
                    count++;
            }
        }
        return count;
    }
}
