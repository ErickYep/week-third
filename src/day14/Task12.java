package day14;

public class Task12 {
    public static void main(String[] args) {
        System.out.println(maxDigit("196548735"));
    }

    static char maxDigit(String str, int a, char max) {
        if (max < str.charAt(a))
            max = str.charAt(a);
        if (a == str.length() - 1)
            return max;
        return maxDigit(str, a + 1, max);

    }

    static char maxDigit(String str) {
        return maxDigit(str, 0, '0');
    }
}
