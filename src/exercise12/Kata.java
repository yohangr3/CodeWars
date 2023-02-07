package exercise12;

import java.util.Arrays;

public class Kata {

    /**
     * Solución con ArrayList
    public static void main(String[] args) {

        ArrayList<Double> num = new ArrayList<Double>();
        int n = 2;
        for (double i = 0; i <= n; i++) {
            double x = Math.pow(2, i);
            num.add(x);

            System.out.println(num);
        }
    }**/

    public static void main(String[] args) {
        System.out.println("Powers of two: " + Arrays.toString(powersOfTwo(5)));
    }

    public static long[] powersOfTwo(int n) {
        long[] a = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            a[i] = (long) Math.pow(2, i);
        }
        return a;
    }
}
