package levels.level3.lection3;
import java.util.Scanner;
/*
Ввести с клавиатуры температуру на улице.
Если температура меньше 0, вывести надпись "на улице холодно", иначе - вывести надпись "на улице тепло".
 */

public class task_cold_or_warm {

    public static void main(String[] args) {
        String cold = "на улице холодно";
        String warm = "на улице тепло";

        Scanner scanner = new Scanner(System.in);

        int teplerature = scanner.nextInt();

        if ( teplerature < 0 )
            System.out.println(cold);
        else
            System.out.println(warm);
        //напишите тут ваш код
    }
}
