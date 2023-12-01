package levels.level4.lecture9;
import java.util.Scanner;
public class task_double_cola {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int cola = console.nextInt();
        int people = console.nextInt();

        double result = (cola * 1.0) / people;
        System.out.println(result);
    }
}