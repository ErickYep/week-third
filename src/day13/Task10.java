package day13;

public class Task10 {
    public static void main(String[] args) {
        System.out.println(checkHexStr("123aBc"));
        System.out.println(checkHexStr("123aBcx"));
    }
    static boolean checkHexStr(String string){
        for (int i = 0; i < string.length(); i++) {
           if(string.charAt(i)<=47 || string.charAt(i) >= 58)
               if(string.charAt(i)<=64 || string.charAt(i)>=71)
                   if(string.charAt(i)<=96 || string.charAt(i)>=103)
                       return false;
        }
        return true;
    }
}
