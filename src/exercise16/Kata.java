package exercise16;

public class Kata {
    public int pitagora(int[] triple) {


        final int a2 = triple[0] * triple[0];
        final int b2 = triple[1] * triple[1];
        final int c2 = triple[2] * triple[2];
        return a2 + b2 == c2 || a2 + c2 == b2 || b2 + c2 == a2 ? 1 : 0;
    }
}
