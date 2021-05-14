package day14;

public class Task15 {
    public static void main(String[] args) {
        System.out.println(bracket("abcdeedcba"));
    }

    static String bracket(String string) {
        int len = string.length();
        if(len<=2)
            return "("+ string+")";
        return "(" + string.charAt(0) + bracket(string.substring(1,len-1))  + string.charAt(len - 1)+ ")";
    }


}
