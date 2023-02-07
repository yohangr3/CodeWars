package Exercise10;

public class Kata {
    public static void main(String[] args) {
        System.out.println(reverseWord("hello world"));
        String word = "hello world";
        String s1 = word;
        String[] words=s1.split("\\s");
        for(int i= words.length-1; i>=0; i--){
            System.out.print(words[i]+ " ");
        }
    }
    public static String reverseWord(String word){

        String s1 = word;
        String[] words=s1.split("\\s");
        for(int i= words.length-1; i>=0; i--){
            return words[i]+ " ";
        }
        return null;
    }

}

