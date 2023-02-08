package exercise20;

public class Kata {
    public static String shortcut(String input) {
        input = input.replaceAll("([aeiou])","");
        return input;
    }
}
