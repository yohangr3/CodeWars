package Exercise7;

public class Solution {
    //Forma larga
    public static String repeatStr(final int repeat, final String string) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < repeat; i++) {
            sb.append(string);
        }
        return sb.toString();

    }
}
