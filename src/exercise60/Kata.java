package exercise60;

public class Kata {
    public static int nthPower(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (n > array.length - 1) {
                return -1;
            } else if (n == i) {
                array[i] = (int) Math.pow(array[i], n);
                return array[i];
            }
        }

        return 0;
    }
}
