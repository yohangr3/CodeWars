package exercise14;

public class Kata {

    public double square(int n){
        return Math.pow(n,2);
    }

    public static void main(String[] args) {
        Kata kata = new Kata();
        System.out.println(kata.square(25));
    }
}
