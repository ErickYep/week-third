package day14;

public class Task8 {
    public static void main(String[] args) {
        System.out.println(reverse("Hello"));
    }

  public static String reverse(String str, int length) {
        String reverseStr = "";
        if (length == 0)
        return str.charAt(0) + "";
        return reverseStr += str.charAt(length) + reverse(str, length - 1);
    }
    public static String reverse(String str ){
      return  reverse(str,str.length()-1);
    }
}
