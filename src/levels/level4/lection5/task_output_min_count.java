package levels.level4.lection5;

import java.util.Scanner;

public class task_output_min_count {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = 0;
        int first_iteraciya = 0;


            while (console.hasNextInt()) {

                int value = console.nextInt(); //Присвоили значение
                ++first_iteraciya;
                if (first_iteraciya == 1) {
                    min = value;
                    max = value;
                } else {
                    if (value < min) {
                        min = value;
                    } else if (max < value) {
                        max = value;

                    }
                }

        }
        System.out.println(min);
System.out.println(max);


    }
}

