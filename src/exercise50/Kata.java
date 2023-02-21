package exercise50;

public class Kata {
    public static void main(String[] args) {
        String beast = "great blue heron";
        String dish = "garlic nann";
        char primeroX = beast.charAt(0);
        char ultimoX = beast.charAt(beast.length() - 1);
        char primeroY = dish.charAt(0);
        char ultimoY = dish.charAt(dish.length() - 1);

        if(primeroX == primeroY && ultimoX == ultimoY)
            System.out.println(true);






    }
}
