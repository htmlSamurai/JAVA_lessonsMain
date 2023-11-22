package levels.level4.lection3;
import javax.script.ScriptContext;
import java.util.Scanner;
public class while_loop {
    public static void main(String[] args){
        //template();
        //report();
        report_scanner();
    }
    static void template(){
        int n = 5;
        while (n > 0)
        {
            System.out.println(n);
            n--;
        }

        int a = 0;
        while (n < 10)
        {
            System.out.println(n);
            n++;
        }

    }

    static void report(){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt())
        {
            int x = scanner.nextInt();
        }

    }

    static void report_scanner(){
        Scanner console = new Scanner(System.in);
        boolean isExit = false;
        while (!isExit)
        {
            String s = console.nextLine();
            isExit = s.equals("exit");
        }
    }

}
