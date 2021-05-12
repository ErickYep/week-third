package day13;

public class Task11 {
    public static void main(String[] args) {
        System.out.println(bin2Dec("1011"));
    }

    static double bin2Dec(String string) {
        double sum = 0;
        for (int i = 0; i < string.length(); i++) {
            sum += Integer.parseInt(String.valueOf(string.charAt(i))) * Math.pow(2,string.length()-i-1);
        }
        return sum;
    }
}
