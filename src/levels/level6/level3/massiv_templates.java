package levels.level6.level3;
//Лекция 3
import java.util.Scanner;
public class massiv_templates {
    public static void main(String[] args) {
        report();
    }

    static void report(){

        //заполнение массива из 10 чисел  числами от 0 до 9
        int[] array = new int[10];
        for(int i = 0; i < 10; i++){
            array[i] = i;
        }
        //заполняем массив из 10 чисел числами от 1 до 10
        int[] massiv = new int[10];
        for(int q = 0; q < 10; q++){
            massiv[q] = q + 1;
        }

        //заносим числа от 10 до 1
        int[] new_massiv = new int[10];
        for (int n = 0; n < 10; n++){
            new_massiv[n] = 10 - n;
        }

        Scanner console = new Scanner(System.in);
        int[] massiv_test = new int[10];
        for (int x = 0; x < 10; x++){
            massiv_test[x] = console.nextInt();
        }
        for (int x = 9; x >= 0; x--){
            System.out.println(massiv_test[x]);
        }

    }
}
