package levels.level4.lection3;
/*Ввести с клавиатуры имя и, используя цикл while, 10 раз вывести: <имя> любит меня (переменная text).
        Каждый вывод - с новой строки.
        Пример вывода на экран для имени Света:

 */
import java.util.Scanner;
public class while_10_times {
public static void main(String[] args){
    int n = 1;
    String text = " любит меня.";
    Scanner console = new Scanner(System.in);
    String name = console.next();

    while (n <= 10){
        System.out.println(name + text);
        n++;
    }

}
}
