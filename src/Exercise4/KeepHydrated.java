package Exercise4;

public class KeepHydrated {
    public int Liters(double time)  {

        //Your code goes here! Hint: You should change that -1
        final double litersOfWater = 0.5;

        double numberLitersDrink = time*litersOfWater;
        Math.floor(numberLitersDrink);
        return  (int) numberLitersDrink;

    }
}
