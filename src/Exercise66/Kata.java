package Exercise66;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Kata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un saludo: ");
        String lenguaje = scanner.nextLine();

        Map<String, String> map = new HashMap<>();
        map.put("english", "Welcome");
        map.put("czech", "Vitejte");
        map.put("danish", "Velkomst");
        map.put("dutch", "Welkom");
        map.put("estonian", "Tere tulemast");
        map.put("finnish", "Tervetuloa");
        map.put("flemish", "Welgekomen");
        map.put("french", "Bienvenue");
        map.put("german", "Willkommen");
        map.put("irish", "Failte");
        map.put("italian", "Benvenuto");
        map.put("latvian", "Gaidits");
        map.put("lithuanian", "Laukiamas");
        map.put("polish", "Witamy");
        map.put("spanish", "Bienvenido");
        map.put("swedish", "Valkommen");
        String x = "";

        /*x = map.get(lenguaje);


            if(map.keySet().contains(lenguaje)) {
                x =map.get(lenguaje);
            }else {
                x =(map.get("english"));
            }

            map.getOrDefault(lenguaje,map.get("english"));*/


        System.out.println(map.get(map.keySet().contains(lenguaje) ? lenguaje : "english"));
    }
}
