package day13;

public class Task3 {
    public static void main(String[] args) {
//        function which checks if the given String contains a given character
        System.out.println(checkChar("Enter name",'n'));
        System.out.println(checkChar("Enter name",'k'));

    }
    static boolean checkChar(String str,char ch){
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)== ch)
                return true;
        }
        return false;
    }
}
