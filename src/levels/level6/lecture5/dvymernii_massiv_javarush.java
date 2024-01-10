package levels.level6.lecture5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class dvymernii_massiv_javarush {

    public static void main(String[] args){

        //Создаём массив с 3мя строками
        int[][] sadovaya_10 = new int[3][];

        sadovaya_10[0] = new int[]{ 10, 15, 16, 17};
        sadovaya_10[1] = new int[]{11, 12, 13 ,14};
        sadovaya_10[2] = new int[]{13,19,21,33};

        sadovaya_10[1][3] = 99;

        System.out.println(Arrays.deepToString(sadovaya_10));

        for (int i = 0; i < sadovaya_10.length ; i++) {
            for (int j = 0; j < sadovaya_10[i].length; j++) {
            System.out.print(sadovaya_10[i][j] + " ");
            }
            System.out.println();
        }

    }
}
