package levels.level2.lection9;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class aboutScanner {


    public static void main(String[] args){

        method_one();
        method_second();

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
        System.out.println("Спасибо! Вы ввелим число " + number);
    }

}
