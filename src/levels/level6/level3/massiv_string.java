package levels.level6.level3;
//Лекция 3
import java.util.Scanner;
public class massiv_string {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String[] array = new String[10];

        for (int i = 0; i < 10; i++) {
            array[i] = console.nextLine();
        }

        for (int i = 9; i >= 0; i--){
            System.out.println(array[i]);
        }

        String[] massiv = new String[10];

        massiv[1] = "Привет";
        massiv[2] = "Привет"; //massiv[1];
        massiv[3] = new String("Привет");
// сравниваем
       boolean x = massiv[1] == massiv[2];
       boolean z = massiv[1] == massiv[3];
       boolean c = massiv[1].equals(massiv[3]);
       boolean v = massiv[1].equalsIgnoreCase(massiv[3]);

       System.out.println(x + " " + z + " " + c + " " + v);


    }
}
