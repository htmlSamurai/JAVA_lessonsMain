package levels.level6.level3;
//Лекция 3
import java.util.Arrays;
import java.util.Scanner;

//Программа ищет в массиве одинаковые значения и удаляет их.
public class task_delete_odinakovie_v_massive {
    public static String[] strings;

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        strings = new String[4];

        for (int x = 0; x < strings.length; x++) {
            strings[x] = console.nextLine();
        }


        for(int i = 0; i < strings.length; i++) {
            String text = strings[i];
            for (int z = 0; z < strings.length; z++) {
                if (z == i) {
                    continue;
                } else {

                    boolean check_null = text != null && strings[z] != null;
                    //  boolean xxx = strings[i].equals(strings[z]); // " strings[z];
                    if (check_null) {
                        boolean xxx = text.equals(strings[z]);
                        if (xxx) {
                            strings[i] = null;
                            strings[z] = null;
                        }
                    }
                }
            }
        }


        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");

       }
    }
}



