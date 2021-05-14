package day14;

public class Task9 {
    public static void main(String[] args) {
        System.out.println(moveX("xxre"));
    }

    static String moveX(String str) {
        int count = Task6.countX(str, str.length() - 1);
        str = Task7.removeX(str, 0);
        for (int i = 0; i < count; i++) {
            str += "x";
        }
        return str;
    }
}
