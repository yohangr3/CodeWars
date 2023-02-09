package exercise27;

public class Kata {
    public static int getAverage(int[] marks){
        int suma = 0;
        for(int i=0; i<marks.length; i++) {
            suma = marks[i]+suma;

        }
        int promedio = suma/marks.length;
        return promedio;
    }
}
