package day14;

public class Task17 {
    public static void main(String[] args) {
//        tring containing only small English letters.
//        iForm a new line by "cutting" identical letters located at symmetrical places
        System.out.println(cutSymmetricChars("aEbrciccbka"));
    }

    static String cutSymmetricChars(String str) {
        if (str.length() - 1 <= 0)
            return str;
        if (str.charAt(0) == str.charAt(str.length() - 1))
            return cutSymmetricChars(str.substring(1, str.length() - 1));
        return str.charAt(0) + cutSymmetricChars(str.substring(1, str.length() - 1)) + str.substring(str.length() - 1);
    }
}
