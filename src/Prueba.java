import java.util.Arrays;

import static org.junit.jupiter.params.shadow.com.univocity.parsers.conversions.Conversions.toUpperCase;

public class Prueba {
    public static void main(String[] args) {

        System.out.println(century(1900));
    }

    public static int century(int number) {
        int siglo = 0;
        if (number > 1 && number < 100) {
            return  (number / 100) + 1;
        } else if (number > 100 && number <= 1000) {
            return  (number / 1000) + 1;
        } else if(number>1000 && number < 1999) {
            return  (number / 100) +1;
        }else {
            return (number / 100);
        }
    }


}
