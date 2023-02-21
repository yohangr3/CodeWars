package exercise48;

public class Kata {
    public static int areaOrPerimeter (int l, int w) {
        // code away...
        int vC = l*l;
        int vR = l*w;

        if(l == w){
            return vC;
        }else {
            return vR;
        }
    }
}
