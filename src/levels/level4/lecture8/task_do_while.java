package levels.level4.lecture8;
/*Ввести с клавиатуры строку и число number, которое больше 0 и меньше 5.
        Вывести на экран строку number раз с помощью цикла do-while.
        Каждое значение нужно вывести с новой строки.
        Если число number меньше/равно 0 или больше/равно 5,
        то введенную строку нужно вывести на экран один раз.

 */
import java.util.Scanner;
public class task_do_while {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String s = console.nextLine();
        int number = console.nextInt();
        int i = 0;

        do
        {
            i++;
            System.out.println(s);
        }
            while ( i != number && ( number > 0 && number < 5)) ;
    }
}
