package exercise52;

public class Kata {
    public static void main(String[] args) {
        int nb_petals =6;
        String[] arr ={"not at all", "I love you",  "a little", "a lot", "passionately", "madly"};
        System.out.println(arr[nb_petals%6]);
        System.out.println(nb_petals%6);
    }

}
