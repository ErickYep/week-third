package day14;

public class Task14 {
    public static void main(String[] args) {
        System.out.println(asterisk("abcdefghijkl"));
    }

    static String asterisk(String str, int a) {
        String newStr = "";
        if (str.length() - 1 == a)
            return newStr+=str.charAt(str.length()-1);
        return newStr +=str.charAt(a) + "*" + asterisk(str, a + 1);
    }

    static String asterisk(String str) {
        return asterisk(str, 0);
    }
}
