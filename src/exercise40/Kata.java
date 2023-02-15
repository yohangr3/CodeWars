package exercise40;

public class Kata {
    public static int enough(int cap, int on, int wait) {
        // your code here
        return (cap-on-wait>=0)? 0: on+wait-cap;
    }
}
