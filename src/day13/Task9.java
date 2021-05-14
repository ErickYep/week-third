package day13;

public class Task9 {
    public static void main(String[] args) {
        // function called checkBinStr to verify a binary string.
        // The program shall prompt the user for a binary string;
        // and decide if the input string is a valid binary string
        System.out.println(checkBinStr("0101010101000101"));
        System.out.println(checkBinStr("12345678987654"));
    }
    static boolean checkBinStr(String string){
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) != '1' && string.charAt(i) != '0')
                return false;
        }
        return true;
    }
}
