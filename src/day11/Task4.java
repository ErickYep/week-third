package day11;

public class Task4 {
    //returns boolean which is most used
    public static void main(String[] args) {
    System.out.println(election(false, false, true));
    System.out.println(election(true, false, false));
    System.out.println(election(false, true, false));
}
    static boolean election(boolean x, boolean y, boolean z){
        if (x==z)
            return x;
        if(y == z)
            return y;
        return x;
    }
}
