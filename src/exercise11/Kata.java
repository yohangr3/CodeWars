package exercise11;

public class Kata {
    public String convertValue(boolean b1){
        String s1 = String.valueOf(b1);
        return s1;
    }

    public static void main(String[] args) {
        Kata b1 = new Kata();
        System.out.println(b1.convertValue(true));
    }
}
