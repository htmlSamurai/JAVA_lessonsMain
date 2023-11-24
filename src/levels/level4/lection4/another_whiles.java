package levels.level4.lection4;
import java.util.Scanner;
public class another_whiles {
    public static void main(String[] args){

        template1();
        System.out.println();
        template2();
        System.out.println();
        template3();
        System.out.println();
        template4();
    }

    static void template1(){
        int i = 3;
        while (i >= 0){
            System.out.println(i);
            i--;
        }
    }

    static void template2(){
        int i = 0;
        while (i < 3)
        {
            System.out.println(i);
            i++;
        }
    }

    static void template3(){
        Scanner console = new Scanner(System.in);
        boolean isExit = false;
        while (!isExit)
        {
            String s = console.nextLine();
            isExit = s.equalsIgnoreCase("exit");
        }
    }

    static void template4(){
        Scanner console = new Scanner(System.in);
        while (true){
            String s = console.nextLine();
            if (s.equalsIgnoreCase("exit"))
                break;
        }
    }
}
