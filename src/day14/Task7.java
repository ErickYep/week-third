package day14;

public class Task7 {
    public static void main(String[] args) {
        // compute recursively a new string where all the 'x' chars
        //have been removed.
        System.out.println(removeX("xxre",0));
    }
    static String removeX(String str,int length){
        String strNew = "";
        if(length == str.length() -1)
            if(str.charAt(length) == 'x')
                return "";
            else
                return str.charAt(length)+"";
            if(str.charAt(length) == 'x')
                return removeX(str,length+1);
            return strNew +=str.charAt(length) + removeX(str,length+1);
    }
}
