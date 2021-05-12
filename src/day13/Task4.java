package day13;

public class Task4 {
    public static void main(String[] args) {

    }

    static int vowelConstant(String string,int vowel) {
        char[] vowels = {'A', 'a', 'O', 'E', 'I', 'U', 'o', 'e', 'i', 'u'};
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (string.charAt(i) == vowels[j])
                    count++;
            }
        }
        return count;
    }
    static int vowelConstant(String string){

        return string.length() - vowelConstant(string);
    }
}
