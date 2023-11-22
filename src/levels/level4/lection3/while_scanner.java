package levels.level4.lection3;

/*

Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму,
пока пользователь не введет слово "ENTER".
Вывести на экран полученную сумму и завершить программу.

 */
import java.util.Enumeration;
import java.util.Scanner;
public class while_scanner {
    private String string;
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int n = 0;
        String text = "ENTER";
        String x;
        boolean lv_enter = false;
        int number;
        //   while (!lv_enter) {  //пока lv_enter <> TRUE, TRUE = "ENTER"
        //  n = n + console.nextInt();
        //      text = console.nextLine();


        while( !lv_enter ){
            while (console.hasNextInt()){
                n = (n + console.nextInt());
            }
            text = console.nextLine();
            lv_enter = text.equals("ENTER");
        }
        System.out.println(n);


        }
    }




