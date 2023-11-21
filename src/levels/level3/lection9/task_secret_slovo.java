package levels.level3.lection9;
import java.util.Scanner;
public class task_secret_slovo {

    public static String secret = "AmIGo";
    public static void main(String[] args){
        report();
    }
    static void report(){

        Scanner scanner = new Scanner(System.in);

        String lv_input = scanner.next();
        String lv_not = "доступ запрещен";
        String lv_yes = "доступ разрешен";

        System.out.println((lv_input.equalsIgnoreCase(secret)) ? lv_yes : lv_not );
        String result = lv_input.equalsIgnoreCase(secret) ? lv_yes : lv_not ;
        System.out.println(result);

/*if (lv_input.equalsIgnoreCase(secret)) {
    System.out.println(lv_yes);
    else
        if ( lv_input == )

 */
}



    }
