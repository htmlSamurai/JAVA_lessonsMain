package levels.level4.lection5;

import javax.swing.*;
import java.util.Scanner;
public class task_vtoroe_min_chislo {

    public static void main(String[] args) {
        report();
    }

    static void report() {

        int count = 0;
        int last_value = Integer.MIN_VALUE;
        int min_two = Integer.MIN_VALUE;
        int min = Integer.MIN_VALUE;
        int first_znach = Integer.MIN_VALUE;

        Scanner console = new Scanner(System.in);

        int value = Integer.MIN_VALUE;

        while (console.hasNextInt()) {
            ++count;

            if (count == 1){
                first_znach = console.nextInt();
            }
            if (count < 2){
                continue;
            }

            if (count == 2){
                value = console.nextInt();

                if (value < first_znach ) {
                    min_two = first_znach;
                    min = value;
                } else {
                    min_two = value;
                    min = first_znach;
                } }
            if (count > 2){

                value = console.nextInt();

                if (value < min_two){  //<=
                    if(value > min) { //>=
                        min_two = value;
                    } else {
                        if (value == min){
                            continue;
                        } else {

                            min_two = min;
                            min = value;

                        }
                    }


                } else {
                    if (value > min_two && min == min_two) {
                        min_two = value;

                    }
                    //  min = min_two;
                    //  min_two = value;
                    // value >= min_two
                    //  System.out.println("VALUE <= MIN_TWO");

                }

            }


        }

        //System.out.println(min);
        if (count > 1) {
            System.out.println(min_two );
        }



    }
}

