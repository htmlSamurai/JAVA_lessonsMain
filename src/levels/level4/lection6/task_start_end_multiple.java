package levels.level4.lection6;
import java.util.Scanner;
/*
В методе main с клавиатуры считывается 3 целых числа: start, end (start <= end), multiple.
        Допиши программу, чтобы на экран выводилась сумма чисел от start (включительно) до end (не включительно),
        кратных multiple.
        Для этого используй цикл for.
        Подсказка: чтобы перейти к следующей итерации цикла, используй оператор continue.

 */
public class task_start_end_multiple {

    public static void main(String[] args){
method_report();
    }

    static void method_report(){
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();

        int sum = 0;

        int count_cycle = end - start + 1 ;
        //напишите тут ваш код

        int lv_nachalo = 0;
        for (int i = start; i < end; i++){//!= count_cycle; i++){
            lv_nachalo = i;
            if( ( lv_nachalo % multiple ) != 0) {
                continue;
            } else {
             //   System.out.println(lv_nachalo);
                sum = sum + i; //;lv_nachalo;
            }
        }

        System.out.println(sum);
    }
}
