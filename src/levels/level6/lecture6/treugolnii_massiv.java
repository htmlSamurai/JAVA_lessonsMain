package levels.level6.lecture6;
import javax.swing.*;
import java.util.Arrays;
public class treugolnii_massiv {
    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        //напишите тут ваш код

// 1. заполнить массив где значение каждого элемента — это сумма его индексов. Например:


      //  result[0] = new int[1];
       // result[1] = new int[2];
        //result[2] = new int[3];
        //result[3] = new int[4];
        //result[4] = new int[5];

        for (int i = 0; i < result.length; i++) {
            //            for (int j = 0; j < i; j++) {
            result[i] = new int[i + 1];

            for (int j = 0; j < result[i].length; j++) {
                result[i ][j] = i+j; //result[i].length - 1;
                System.out.print(result[i][j] + " ");
            }
//https://javarush.com/groups/posts/mnogomernye-massivy
            //
System.out.println();


            }

    }
}

