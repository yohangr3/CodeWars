package exercise58;

public class ReverseWord {
    public static String reverseWordStringBuilder(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();

    }

    //Forma con ciclo for

    public static String reverseWord(String str){
        String reverse = "";
        for(int i = str.length()-1; i >=0 ; i--) {
            reverse += str.charAt(i);

        }
        return reverse;
    }

}
