package levels.level6.level3;
/*
Считывает с консоли целое число N.
Если считанное число N больше 0, то программа дальше считывает целые числа, количество которых равно N.
Вывести в консоль считанные числа, если N нечетное — в порядке ввода, иначе — в обратном порядке.
 */
import java.util.Arrays;
import java.util.Scanner;
public class task_massiv_reverse {

    public static void main(String[] args) {
        report();
    }

    static void report() {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        int[] array = new int[n];

        if (n > 0) {
            for (int x = 0; x < n; x++) {

                array[x] = console.nextInt();
            }

            int lenght = array.length;
            if (n % 2 != 0) { //нечётное
                for (int z = 0; z < lenght; z++){
                    System.out.println(array[z]);
                }

            } else {
            for(int r = lenght; r >= 1; r--){
                System.out.println(array[r - 1]);
            }
            }

        }
    }
}
