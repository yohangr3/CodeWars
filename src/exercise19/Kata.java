package exercise19;

public class Kata {
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        double millas = distanceToPump/1.609; // convertimos la distancia a millas
        mpg = mpg*fuelLeft;
        if (millas < mpg) {
            return true;

        }
        return false;
    }

}
