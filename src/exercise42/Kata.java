package exercise42;

public class Kata {
    public static int TwiceAsOld(int dadYears, int sonYears){
        //TODO: Add code here

        int x = (sonYears * 2) - (dadYears);
        if (x <0){
            return x*-1;
        }
        return x;

    }
}
