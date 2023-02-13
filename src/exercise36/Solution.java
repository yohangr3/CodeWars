package exercise36;

public class Solution {
    public static int century(int number) {
        // your code goes here
        return ((number % 100 == 0))? (number = number / 100 ) :  (number = (number / 100) + 1);
    }
}