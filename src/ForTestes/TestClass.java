package ForTestes;

import java.util.Scanner;
public class TestClass {

    public static void main(String[] args){
        String str = "10 20 40 60";
        Scanner scanner = new Scanner(str);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println( a + b );
    }

}
