public class Main {

    public static void main(String[] args) {
        int[] numeros = {1,2,3,4};

        int result = 1;
        for (int a : numeros) {
            result *= a;
            System.out.println(result);
        }

     }
}