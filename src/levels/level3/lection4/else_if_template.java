package levels.level3.lection4;

import java.util.Scanner;

public class else_if_template {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();

        if ( a > b )
            System.out.println(a);
        else
            System.out.println(b);
    }

}
