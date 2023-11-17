package levels.level2.lection8;

import java.util.Scanner;

/*
Программа чтения чисел с ввода
 */
public class read_and_convert_strings {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int first = console.nextInt();
        int second = console.nextInt();
        int three = console.nextInt();

        System.out.println( (first + second + three) / 3 );
    }
}
