package exercise31;

public class Kata {
    public static boolean check(Object[] a, Object x) {
        // Your code here
        for(int i =0; i< a.length;i++){
            if(a[i] == x){
                return true;
            }
        }
        return false;
    }
}
