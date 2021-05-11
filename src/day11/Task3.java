package day11;

public class Task3 {
    public static void main(String[] args) {
        //xor function returns true or false depending on arguments.
        System.out.println(xor(false,false));
        System.out.println(xor(false,true));
        System.out.println(xor(true,false));
        System.out.println(xor(true,true));
    }
    static boolean xor(boolean a, boolean b){
        return a ^ b;
    }
}
