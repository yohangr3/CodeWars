package exercise44;

public class Kata {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        // Your code here
        int suma =0;
        int promedio=0;

        for (int i=0; i<classPoints.length; i++) {
            suma = (suma+classPoints[i]) ;
        }
        promedio=suma/classPoints.length;
        if(yourPoints> promedio)
            return true;
        else
            return false;

    }
}
