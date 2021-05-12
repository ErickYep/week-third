package day13;

public class Task13 {
    public static void main(String[] args) {
        System.out.println(notRepeated("8794213.0dszfdgfchbxrtdfh"));
    }
    static char notRepeated(String string){
        char[] chars = string.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            count = 0;
            for (int j = 0; j < chars.length; j++) {
                if (i == j){
                    count++;
                    continue;
                }
                if(chars[i] != chars[j])
                    count++;
            }
            if(count == chars.length)
                return chars[i];
        }
        return ' ';
    }
}
