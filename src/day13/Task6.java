package day13;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        //program called countVowelsDigits, which get as parameter  a String,
        // counts the number of vowels (a, e, i, o, u, A, E, I, O, U) and digits (0-9)
        // contained in the string, and prints the counts and the percentages (rounded to 2 decimal places)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String string = scanner.nextLine();
        char[] vowels = {'A', 'a', 'O', 'E', 'I', 'U', 'o', 'e', 'i', 'u'};
        char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        double countVowels = 0;
        for (int i = 0; i < string.length(); i++) {
            for (char vowel : vowels) {
                if (string.charAt(i) == vowel)
                    countVowels++;
            }
        }
        double countNumbers = 0;
        for (int i = 0; i < string.length(); i++) {
            for (char number : numbers) {
                if (string.charAt(i) == number)
                    countNumbers++;
            }
        }
        double vowelPercent =  Math.round((100 * countVowels / string.length())*100)/100.0;
        double numberPercent = Math.round((100 * countNumbers / string.length())*100)/100.0;
        System.out.println("Count of vowels: " + countVowels + '(' + vowelPercent + "%)");
        System.out.println("Count of numbers: " + countNumbers + '(' + numberPercent + "%)");

    }
}
