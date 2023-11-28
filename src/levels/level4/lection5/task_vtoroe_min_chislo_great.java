package levels.level4.lection5;
import java.util.Scanner;

public class task_vtoroe_min_chislo_great {
    public static void main(String[] args){
     report();
    }
    static void report(){

        Scanner console = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;

        while (console.hasNextInt()){
            int value = console.nextInt();
            if (value < min){
                second_min = min;
                min = value;
            } else if ( value < second_min && value != min){
                second_min = value;
            }
        }
        System.out.println(second_min);

    }
}
