package levels.level4.lection5;

import java.util.Scanner;

public class operator_break {
    public static void main(String[] args) {
        old_report();
        System.out.println("Конец работы первой программы");
    new_report();
    System.out.println("Конец работы второй программы");
    }

        static void old_report () {
            Scanner console = new Scanner(System.in);
            boolean isExit = false;
            while (!isExit) { // Цикл будет работать пока isExit не будет равна true
                //Если ввести слово "exit", То isExit станет true, а условие !isExit станет false, цикл закончится

                String s = console.nextLine();
                isExit = s.equalsIgnoreCase("EXIT");
            }
        }

        static void new_report(){
        Scanner console = new Scanner(System.in);
        while (true){
            String s = console.nextLine();
            if (s.equalsIgnoreCase("exit")){
                break;
            }
        }
        }

    }
