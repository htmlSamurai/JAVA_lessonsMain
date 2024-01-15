package levels.level7.lection1;
import java.util.Arrays;
public class method_reverce_poryadok {
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        //напишите тут ваш код
        int[] copy = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            array[i] = copy[array.length - 1 - i];
        }


    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
