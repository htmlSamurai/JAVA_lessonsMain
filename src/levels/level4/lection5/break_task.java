package levels.level4.lection5;
import java.util.Scanner;
/*
Вводим данные с клавиатуры и сразу их выводим на экран, пока не будет введено слово "enough".
Слово "enough" выводить не нужно.
Для этого необходимо использовать бесконечный цикл (while(true)).

Подсказка: чтобы завершить бесконечный цикл, используй оператор break.
 */
public class break_task {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        while(true){

            String text = console.nextLine();
            if (text.equals("stop") ){

                break;
            } else{
                System.out.println(text);
            }
        }
    }
}




