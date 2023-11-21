package levels.level3.lection7;
import java.util.Locale;
import java.util.Scanner;
public class Ssilki {
    public static void main(String[] args){
report();
    }
    public static void report(){
        String text = "Это очень важное сообщение";
        String message = text;

        Scanner scanner = new Scanner(System.in);

        String text2 = "10 20 40 80";
        Scanner console = new Scanner(text2);
        int a = console.nextInt();
        int b = console.nextInt();
        System.out.println(a + " " +  b);

        String text3 = "Hello";
        String message2 = text3;
        String s1 = text3.toUpperCase();
        String s2 = text3.toUpperCase();

        System.out.println(text3);
        System.out.println(message2);
        System.out.println(s1);
        System.out.println(s2);


        String text4 = "привет";
        String message4 = text4;
        String lv_s = text4.toUpperCase();
        String lv_s2 = text4.toUpperCase();
        String lv_lower = text4.toLowerCase();
        System.out.println( text4 == message4);
        System.out.println(text4 == lv_s);
        System.out.println(lv_s == lv_s2);

        System.out.println(text4 == lv_lower);
    }
}
