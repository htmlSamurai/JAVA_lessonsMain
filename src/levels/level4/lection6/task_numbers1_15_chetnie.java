package levels.level4.lection6;
import java.util.Scanner;
public class task_numbers1_15_chetnie {

    public static void main(String[] args){

report();

template();

    }

    static void report(){
        Scanner console = new Scanner(System.in);
        for(int i = 1; i <= 15; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }

        }
    }

    static void template(){
        for (int i = 1; i <= 23; i++){
            if ( (i % 7) == 0 ) continue;
            System.out.println(i);
        }
    }
}
