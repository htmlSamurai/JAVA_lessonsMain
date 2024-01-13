package levels.level6.lecture7;
import java.util.Arrays;
public class equals_for_massive {

    public static void main(String[] args) {
//Сравнивает только ссылки
        int[] x1 = {1, 2, 3};
        int[] x2 = {1, 2, 3};
        boolean b = x1 == x2;



        int[] x3 = {1, 2, 3};
        int[] x4 = {1, 2, 3};
        x3.equals(x4);

        int[] x5 = {1, 2, 3};
        int[] x6 = {1, 2, 3};
        x5.equals(x6);

        //arrays,equals работает только с одномерным массивом

        int[] x7 = {1, 2, 3};
        int[] x8 = {1, 2, 3};
        Arrays.equals(x7, x8);

        int[] x9 = {1, 2, 3};
        int[] x10 = {1, 2, 3, 4};
        Arrays.equals(x9, x10);

        //двумерные через deepEquals

        int[][] x11 = {{1, 2, 3}, {4, 5, 6}};
        int[][] x12 = {{1, 2, 3}, {4, 5, 6}};
        boolean x = Arrays.deepEquals(x11, x12);
System.out.println(x);
    }
}
