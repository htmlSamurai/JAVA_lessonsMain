package levels.level6.lecture7;
import java.util.Arrays;
public class task_fill_massive {

    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;
    public static void main(String[] args) {

int middle = array.length - array.length / 2;


// читается так
        //заполнить массив array с 0 по Middle значениекм valuestart
        //заполинть массив array с middle по array.lenght значением valueend
Arrays.fill(array, 0, middle, valueStart);
Arrays.fill(array, middle, array.length, valueEnd);


        //Arrays.fill(array, 0, 1,3);
        System.out.println(Arrays.toString(array));

    }
}
