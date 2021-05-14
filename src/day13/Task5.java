package day13;

public class Task5 {
    public static void main(String[] args) {
        // function called reverseString, which prompts
        // the user for a String, and prints the reverse of the String
        System.out.println(reverseString("Enter"));
    }

    static String reverseString(String string) {
        String reverse = new String();
        for (int i = string.length() - 1; i >= 0; i--) {
            reverse += string.charAt(i);
        }
        return reverse;
    }
}
