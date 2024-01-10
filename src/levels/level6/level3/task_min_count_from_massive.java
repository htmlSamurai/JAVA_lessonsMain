package levels.level6.level3;
//Лекция 3
import java.util.Scanner;
/*
Чтобы выполнить эту задачу, тебе нужно:

Ввести с клавиатуры число N.
Считать N целых чисел и заполнить ими массив.
Найти минимальное число среди элементов массива и вывести в консоль.
 */
public class task_min_count_from_massive {
    public static void main(String[] args) {
        report();
    }
    static void report(){
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        int[] array = new int[n];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n ; i++) {
            array[i] = console.nextInt();
        }

        for (int x = 0; x <= array.length - 1; x++){

            if (array[x] < min) {
                min = array[x];
            } else {
                continue;
            }
        }
System.out.println(min);
    }
}
