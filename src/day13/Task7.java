package day13;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        //function called caesarCode to cipher Caesar's code
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word");
        String string = scanner.nextLine();
        System.out.println("Enter number");
        int num = scanner.nextInt();
        System.out.println(caesarCode(string, num));

    }

    static String caesarCode(String string, int n) {
        string = string.toUpperCase();
        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= (91 - n)) {
                charArray[i] = (char)((charArray[i] + n) % 91 + 65);
                continue;
            }
            charArray[i] = (char) ((charArray[i] + n) % 91);

        }
        return String.valueOf(charArray);
    }
}
