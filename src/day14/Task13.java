package day14;

public class Task13 {
    public static void main(String[] args) {
        System.out.println(countDigit("6574aw3d435e4g64sef"));
    }

    static int countDigit(String str, int a, int count) {
        if (str.charAt(a) >= 48 && str.charAt(a) <= 57)
            count++;
        if (str.length() - 1 == a)
            return count;
       return countDigit(str, a + 1, count);
    }

    static int countDigit(String str) {
        return countDigit(str, 0, 0);
    }
}
