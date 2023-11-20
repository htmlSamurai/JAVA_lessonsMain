package levels.level3.lection5;

import java.util.Scanner;
public class task_three_counts {

    public static void main(String[] args) {

      //  variant();
        variant_pro();

    }

        static void variant() {
            Scanner scanner = new Scanner(System.in);

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            System.out.println(a + " " + b + " " + c);

            if (a == b && b == c)
                System.out.println("Все 3 числа равны");
            else if (a == b)
                System.out.println("а и б равны");
            else if (a == c)
                System.out.println("a и ц равны");
            else if (b == c)
                System.out.println("б и ц равны");
        }


        static void variant_pro() {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
            String empty_row = " ";

            boolean ab = a == b;
            boolean ac = a == c;
            boolean bc = b == c;

            if (ab && bc && ac)
                System.out.println(a + empty_row + b + empty_row + c);
            else if (ab)
                System.out.println(a + empty_row + b);
            else if (ac)
                System.out.println(a + empty_row + c);
            else
            System.out.println(b + empty_row + c);



        }
    }

