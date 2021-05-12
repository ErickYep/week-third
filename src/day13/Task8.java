package day13;

public class Task8 {
    public static void main(String[] args) {

    }
    static boolean isPalindrome(String string) {
        int count = 0;
        for (int i = 1; i <= string.length() / 2; i++) {
            if (string.charAt(i-1) == string.charAt(string.length() - i))
                count++;
        }
        return count == string.length() / 2;
    }
}
