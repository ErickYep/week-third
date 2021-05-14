package day14;

public class Task16 {
    public static void main(String[] args) {
        System.out.println(mirrorString("(a(b(c(d"));
    }

    static String mirrorString(String str) {
        String reverse = str + Task8.reverse(str);
        for (int i = str.length(); i < reverse.length(); i++) {
            if (reverse.charAt(i) == '(')
                reverse = reverse.substring(0, i) + ")" + reverse.substring(i + 1); }
        return reverse;
    }
}
