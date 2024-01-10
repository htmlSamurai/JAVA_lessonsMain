package levels.level6.lecture5;

import java.util.Arrays;

public class dvumernie_massivi {
    public static void main(String[] args) {
        int[][] massive = new int[35][180]; //двумерный массив, ширина/ высота
        int[][] data = new int[2][5];

        data[1][1] = 5;
        System.out.println(Arrays.deepToString(data));


        int[] odnomernii_massiv = new int[10];
        odnomernii_massiv[0] = 0;
        odnomernii_massiv[1] = 1;
        odnomernii_massiv[2] = 2;
        odnomernii_massiv[3] = 3;
        odnomernii_massiv[4] = 4;
        odnomernii_massiv[5] = 5;
        odnomernii_massiv[6] = 6;
        odnomernii_massiv[7] = 7;
        odnomernii_massiv[8] = 8;
        odnomernii_massiv[9] = 9;


        int[][] months = {{31, 28, 31}, {30, 31, 30}, {31, 31, 31}, {31, 30, 31}};

        int[][] matrix = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
        int[][] matrix2 = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5}
        };

            System.out.println(Arrays.deepToString(matrix));


        for (int i = 0; i < odnomernii_massiv.length ; i++) {
            System.out.println(odnomernii_massiv[i]);
        }

        int[][] matrix_test = {
                {1, 2, 3, 4, 5},
                {5, 4, 3, 2, 1}
        };

        int[] tmp = matrix_test[0];
        matrix_test[0] = matrix_test[1];
        matrix_test[1] = tmp;


    }
}
