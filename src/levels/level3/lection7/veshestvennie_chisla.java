package levels.level3.lection7;

public class veshestvennie_chisla {

    public static void main(String[] args){
report();
    }

    static void report(){

        double a = 1.000001;
        double b = 1.000002;

        if ( ( b - a ) < 0.0001 )
                System.out.println("Числа равны");
        else
            System.out.println("Числа не равны");

        if ( Math.abs(b - a) < 0.0001)
            System.out.println("Числа равны");
        else
            System.out.println("Числа не равны");
    }
}
