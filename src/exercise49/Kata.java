package exercise49;

public class Kata {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        // TODO May the force be with you
        int count = 0;
        for(int i=0; i<arrayOfSheeps.length; i++){
            if(arrayOfSheeps[i]!= null && arrayOfSheeps[i]== true){
                count++;
            }
        }
        return count;
    }
}
