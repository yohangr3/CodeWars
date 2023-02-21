import java.util.*;

class main {

    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4};
        int num = 4;


        for (int i = 0; i < n.length; i++) {
            if(num > n.length-1) {
                System.out.println("-1");
            } else if (num == i) {
                n[i] = (int)Math.pow(n[i],num);
                System.out.println(n[i]);
            }
        }
    }


}











