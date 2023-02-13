package exercise33;

public class Kata {
    public static int[] countPositivesSumNegatives(int[] input) {
        if(input == null || input.length==0) return new int[0];
        int countPositives = 0;
        int sumNegatives = 0;
        for(int i = 0; i < input.length; i++){
            if(input[i] > 0) countPositives++;
            else sumNegatives += input[i];
        }
        return new int[]{countPositives, sumNegatives};
    }
}
