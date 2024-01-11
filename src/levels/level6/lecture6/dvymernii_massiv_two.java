package levels.level6.lecture6;
import java.util.Arrays;
import java.util.Scanner;

public class dvymernii_massiv_two {
    public static int[][] multiArray;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // Вводим n c клавиатуры
        multiArray = new int[n][]; // Создаем двумерный массив с n строк.
        for (int i = 0; i < n; i++) {  // Создаем цикл для инициализации строк массива
            int a = scanner.nextInt(); // пока цикл не завершится вводим числа с клавиатуры
            multiArray[i] = new int[a]; // Каждое число == колличеству элементов в массиве
        }
        for (int i = 0; i < multiArray.length; i++) {  // Выводим массив на экран
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print(multiArray[i][j]);
            }
            System.out.println();
        }
    }
}