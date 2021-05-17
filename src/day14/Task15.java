package day14;

public class Task15 {
    public static void main(String[] args) {
        // Add opening and closing parentheses according to the following pattern:
        // "example" -> "(e (x (a (m) p) l) e)"
        System.out.println(bracket("abcdeedcba"));
    }

    static String bracket(String string) {
        int len = string.length();
        if(len<=2)
            return "("+ string+")";
        return "(" + string.charAt(0) + bracket(string.substring(1,len-1))  + string.charAt(len - 1)+ ")";
    }


}
