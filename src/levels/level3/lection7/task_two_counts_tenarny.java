package levels.level3.lection7;
import java.util.Scanner;
public class task_two_counts_tenarny {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();

       /*
       if (numberA > numberB) {
            System.out.println(numberA);
        } else {
            System.out.println(numberB);
        }

        */


        int number = numberA > numberB ? numberA : numberB;
        System.out.println(number);


     //   String result = number < 5 ? "число меньше 5" : number > 5 ? "число больше 5" : "число равно 5";
//Ниже пример из тернарного сделали в if else
        String result;

        if (number < 5) {
            result = "число меньше 5";
            System.out.println(result);
        } else if (number > 5) {
            result = "число больше 5";
            System.out.println(result);
        } else {
            result = "число равно 5";
            System.out.println(result);

        }
        }


    }

