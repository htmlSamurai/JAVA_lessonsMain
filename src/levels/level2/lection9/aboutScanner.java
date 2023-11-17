package levels.level2.lection9;

import java.util.Scanner;

public class aboutScanner {


    public static void main(String[] args){

        method_one();
        method_second();
        method_three();

    }

    public static void method_one() {

        Scanner scaner = new Scanner("Люблю тебя, Петра творение,\n" +
                "люблю твой строгий, стройный вид,\n" +
                "невы державное теченье,\n" +
                "Береговой её гранит");
        String s = scaner.nextLine();
        System.out.println(s);

    }
    public static void method_second(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");

        int number = sc.nextInt(); //

        System.out.println("Спасибо! Вы ввелим число " + number);
    }

    public static void method_three(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Дарова чучело, вводи число");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            System.out.println("Спасибо вы ввели число " + number);
        } else {
            System.out.println("Извините, но это не число, перезагрузи прогу и попробуй снова");
        }

        //После использования Scanner, его надо закрывать с помощью close();
        // чтобы не тратить память

        sc.close(); //вот так, теперь всё чётко

    }

}
