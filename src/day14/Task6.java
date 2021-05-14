package day14;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(countX("xxhixx",5));
    }

    static int countX(String n, int length) {
        if (length == 0)
            if (n.charAt(0) == 'x')
                return 1;
            else
                return 0;
        if (n.charAt(length) == 'x')
            return 1 + countX(n,length-1);
            return countX(n,length-1);
    }
}
