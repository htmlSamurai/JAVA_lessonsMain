package levels.level6.lecture1;

import java.lang.reflect.Array;

public class massiv {
    public static void main(String[] args) {

        // int[] Говорят, что будет хранится несколько значений,
        // new int[100], говорят, что создаём объект типа int на 100 элементов
        int[] array = new int[100];

        int[] a = new int[10];
        a[2] = 4; //в ячейку с индексом 2 записли значенеи 4
        a[7] = 9; //в ячейку с индексом 7 записали значение 9
        a[9] = a[2] + a[5]; //в ячейку с индексом 9 записываем сумму ячеек 2 и 5


        int[] b = a;
        a[9] = b[2] + a[7];
        System.out.println(a[9]);

        int n = 100;
        int[] c = new int[n];

        int m = 100;
        int[] g = new int[m * 2 + 3];
        g[m-1] = 2;

        array[2] = 103;
        array[10] = 3;
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }
}
