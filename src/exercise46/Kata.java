package exercise46;

public class Kata {
    public static double sum(double[] numbers) {
        double suma = 0;

        if (numbers.length > 0) {
            for (int i = 0; i < numbers.length; i++) {
                suma = suma + numbers[i];
            }
            return (suma);
        } else {
            return (0);
        }
    }
}
