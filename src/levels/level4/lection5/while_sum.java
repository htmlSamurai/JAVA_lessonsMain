package levels.level4.lection5;
import java.util.Scanner;

public class while_sum {

    public static void main(String[] args){
//report();
max();
    }

    static void report(){

        Scanner console = new Scanner(System.in);
        int sum = 0;

        while (console.hasNextInt()){
            sum +=  console.nextInt();
        }
        System.out.println(sum);
    }

    static void max(){
        Scanner console = new Scanner(System.in);
        int max = 0;

        while (console.hasNextInt()){
            int x = console.nextInt();
            if(x > max){
                max = x;
            }
        }
        System.out.println(max);

    }
}
