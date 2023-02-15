package exercise39;

public class Kata {

    public static double find_average(int[] array){
        int suma = 0;
        for (int i = 0; i < array.length; i++) {

            suma = suma + array[i];

        }
        return suma/array.length;
    }
}
