package levels.level6.lecture5;
//РАБОТАЕТ ЮХУУУУУУУУУУУУУУУУУУ
import javax.swing.*;
import java.util.Arrays;

public class task_tablica_umnojeniya {
    public static int[][] MULTIPLICATION_TABLE;
    public static void main(String[] args) {
        //напишите тут ваш код

        MULTIPLICATION_TABLE = new int[10][10];

        for (int i = 1; i <= MULTIPLICATION_TABLE.length; i++) {

            for (int j = 1; j <= MULTIPLICATION_TABLE[i - 1].length; j++) {

                MULTIPLICATION_TABLE[i - 1 ][j - 1] = (i * j);

                System.out.print(MULTIPLICATION_TABLE[i - 1 ][j -1] + " ");
            }
            System.out.println();
        }
    }
}
