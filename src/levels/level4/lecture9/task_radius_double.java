package levels.level4.lecture9;
import java.util.Scanner;
public class task_radius_double {
    public static void main(String[] args){
        int s;
        double pi = 3.14;
        Scanner console = new Scanner(System.in);
        int radius = console.nextByte();

        s =( (int)(pi * radius * radius));

        System.out.println(s);
    }
}
