package day11;

public class Task9 {
    public static void main(String[] args) {
        System.out.println(isPolindrome(1661));
        System.out.println(isPolindrome(1662));
        System.out.println(isPolindrome(1234554321));
    }

    static boolean isPolindrome(int n) {
        String number = n + "";
        int count = 0;
        for (int i = 1; i <= number.length() / 2; i++) {
            if (number.charAt(i-1) == number.charAt(number.length() - i))
                count++;
        }
        return count == number.length() / 2;
    }
}
