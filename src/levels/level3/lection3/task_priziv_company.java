package levels.level3.lection3;
import java.util.Scanner;
/*
Ввести с клавиатуры имя и возраст. Если возраст в пределах 18-28 (включительно),
то вывести надпись "Имя, явитесь в военкомат", где Имя - это имя, введенное ранее с клавиатуры.

Пример ввода:
Amigo
18
Пример вывода:
Amigo, явитесь в военкома
 */
public class task_priziv_company {

    public static void main(String[] args){

        String militaryCommissar = ", явитесь в военкомат";

        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        int age = scanner.nextInt();


        if( age >= 18 && age <= 28)
            System.out.println(name + militaryCommissar);

    }
}
