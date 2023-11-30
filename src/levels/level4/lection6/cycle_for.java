package levels.level4.lection6;
import java.io.BufferedReader;
import java.util.Scanner;
public class cycle_for {
    public static void main(String[] args) {
report();
System.out.println("_______LINE______");
report2();
        System.out.println("_______LINE______");
report3();
        System.out.println("_______LINE______");
        report4();

    }


    static void report() {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }
    }

        static void report2 () {

        for(int i  = 3; i >= 0; i--){
            System.out.println(i);
        }
        }

        static void report3(){
        Scanner console = new Scanner(System.in);
        for( boolean isExit = false; !isExit;){ // IS_EXIT = FALSE, Цикл работает пока IsExit <> true
            // true Она будет равна колда напишем exit

            String s = console.nextLine();
            isExit = s.equalsIgnoreCase("exit");
        }
        }


        static void report4() {
            Scanner console = new Scanner(System.in);
            for (; true; )
            {
                String x = console.nextLine();
                if (x.equals("EXIT"))
                    System.out.println("tikto");
                    break;
            }
        }

            }


