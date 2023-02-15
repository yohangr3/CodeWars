package exercise41;

public class Kata {
    public static String updateLight(String current) {

        if (current.equals("green"))
            return "yellow";
        else if (current.equals("yellow"))
            return "red";
        else if (current.equals("red"))
            return "green";
        else {
            return "";
        }
    }
}
