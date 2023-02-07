import java.util.*;

class main {

    public static void main(String[] args) {

        int[] a = {7, 2, 4, 8, 3, 9, 1, 5, 10, 6};
        main m = new main();
        System.out.println(m.min(a));
        System.out.println(m.max(a));




    }

    public int min(int[] a){
        int temporal = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < (a.length - i); j++) {
                if (a[j - 1] > a[j]) {
                    temporal = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temporal;
                }
            }
        }
        return a[0];
    }

    public int max(int[] a){
        int temporal = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < (a.length - i); j++) {
                if (a[j - 1] > a[j]) {
                    temporal = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temporal;
                }
            }
        }
        return a[a.length-1];
    }

}

