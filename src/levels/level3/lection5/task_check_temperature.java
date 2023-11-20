package levels.level3.lection5;
import java.util.Scanner;
public class task_check_temperature {

    private static boolean isHigh;
    private static boolean isLow;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bodyTemperature = scanner.nextDouble();
        //напишите тут ваш код
        isHigh = bodyTemperature > 37;
        isLow = bodyTemperature < 36;
        if (isHigh) {
            System.out.println("температура тела высокая");
        } else if (isLow) {
            System.out.println("температура тела низкая");
        } else {
            System.out.println("температура тела нормальная");
        }
    }
}


     //
       // else if(isLow) {
        //    System.out.println("Температура тела низкая");
       // } else {
        //    System.out.println("Температура тела нормальная");
        //}



        /*
        if (bodyTemperature > 37) {
            System.out.println("температура тела высокая");
        } else if (bodyTemperature < 36){
            System.out.println("температура тела низкая");
        } else {
            System.out.println("температура тела нормальная");
        }

         */


