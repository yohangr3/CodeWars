package exercise43;

public class Kata {
    public static int[] map(int[] arr) {
        int[] array = new int[arr.length];

        for (int i = 0; i < array.length;i++){
            array[i] = arr[i]*2;
        }
        return array;
    }
}
