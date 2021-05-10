package day11;

public class Task10 {
    public static void main(String[] args) {
        System.out.println(hasEight(18));
        System.out.println(hasEight(45679));
    }
    static boolean hasEight(int n) {
        String number = n + "";
        int count = 0;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '8')
                count++;
        }
        return count>0;
    }
}
