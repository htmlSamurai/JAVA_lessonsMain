package levels.level4.lection5;
import java.util.Scanner;

// Вывести макситмальное чётное число из введённых
public class while_max_count {

    public static void main(String[] args){

        report();

    }
    static void report(){

        int max_value = Integer.MIN_VALUE;
        Scanner console = new Scanner(System.in);

        while (console.hasNextInt()){

            int value = console.nextInt();


            if ( value > max_value && (value % 2 == 0 )  ){
                max_value = value;
            }

        }
        System.out.println(max_value);

    }
}
