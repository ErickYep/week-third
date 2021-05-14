package day14;

public class Task10 {
    public static void main(String[] args) {
        System.out.println(cleanString("yyzzzzaa"));
    }
    static String cleanString(String str){
        if(str.length()<2)
            return str;
        if(str.charAt(0) == str.charAt(1))
            return cleanString(str.substring(1));
        return str.charAt(0) + cleanString(str.substring(1));
    }
}
