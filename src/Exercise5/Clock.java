package Exercise5;

public class Clock {
    public static int Past(int h, int m, int s) {
        int horaAMls= 3600000;
        int minAMls = 60000;
        int segAMls = 1000;
        if(h>=0 && h<=23){
            h = h*horaAMls;
        }
        if(m>=0 && m<=59){
            m = m*minAMls;
        }
        if(s>=0 && s<=59){
            s=s*segAMls;
        }
        return h+m+s;
    }

    public static void main(String[] args) {
        Clock hora = new Clock();
        System.out.println(hora.Past(0,1,1));
    }
}
