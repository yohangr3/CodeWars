package exercise61;

public class Kata {
    public static String chromosomeCheck(String sperm) {

        for(int i =0 ; i< sperm.length();i++){
            if(sperm.charAt(i) == 'Y'){
                return "Congratulations! You're going to have a son.";
            }
        }
        return "Congratulations! You're going to have a daughter.";
    }
}
