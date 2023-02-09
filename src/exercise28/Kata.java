package exercise28;

import java.util.HashMap;

public class Kata {
    public static String greet(String language) {
        HashMap<String, String> lengaujes = new HashMap<String, String>();
        lengaujes.put("english", "Welcome");
        lengaujes.put("czech", "Vitejte");
        lengaujes.put("danish", "Velkomst");
        lengaujes.put("dutch", "Welkom");
        lengaujes.put("estonian", "Tere tulemast");
        lengaujes.put("finnish", "Tervetuloa");
        lengaujes.put("flemish", "Welgekomen");
        lengaujes.put("french", "Bienvenue");
        lengaujes.put("german", "Willkommen");
        lengaujes.put("irish", "Failte");
        lengaujes.put("italian", "Benvenuto");
        lengaujes.put("latvian", "Gaidits");
        lengaujes.put("lithuanian", "Laukiamas");
        lengaujes.put("polish", "Witamy");
        lengaujes.put("spanish", "Bienvenido");
        lengaujes.put("swedish", "Valkommen");
        lengaujes.put("welsh", "Croeso");
        if (lengaujes.containsKey(language)) {
            return lengaujes.get(language);
        }
        return lengaujes.get("english");
    }
}
