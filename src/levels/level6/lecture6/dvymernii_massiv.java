package levels.level6.lecture6;

import java.util.Arrays;
import java.util.Scanner;

public class dvymernii_massiv {
    public static int[][] multiArray;
    public static void main(String[] args){

        Scanner console = new Scanner(System.in);
        int[][] multiArray2;
        int n = console.nextInt();
        int[] array = new int[n];

        for (int x = 0; x < n ; x++) {
            array[x] = console.nextInt();
        }

        for (int i = 0; i < n; i++) {
          //  System.out.println(array[i]);

            for (int j = 0; j < 1; j++) {
                int number = array[i];

                multiArray2 = new int[number][];

               System.out.print(Arrays.deepToString(multiArray2));
                System.out.println();
            }
           // System.out.print(Arrays.deepToString(multiArray2));
            //System.out.print(multiArray[i]);
           // System.out.println();
            }
        }
    }


