package levels.level4.lecture8;
import java.util.Scanner;
public class do_while_templates {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String s;
        do
        {
            s = console.nextLine();
            }
        while (!s.equals("exit"));
        }
    }

