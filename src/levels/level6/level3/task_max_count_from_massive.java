package levels.level6.level3;
//Лекция 3
import java.util.Scanner;
public class task_max_count_from_massive {

    public static int[] array;

    public static void main(String[] args) throws Exception{
    report();
    }
    static void report(){
        Scanner console = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int n = console.nextInt();

        array = new int[n];

        for (int i = 0; i < n; i++){
            array[i] = console.nextInt();
        }

        for(int x = 0; x <= array.length - 1; x++){
            if(array[x] > max){
                max = array[x];
            }
        }
System.out.println(max);
    }


}
