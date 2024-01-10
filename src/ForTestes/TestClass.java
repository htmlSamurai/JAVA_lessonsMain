package ForTestes;

import java.util.Scanner;
public class TestClass {
public static String[] strings2;

    public static void main(String[] args){

         strings2 = new String[4];

Scanner console = new Scanner(System.in);
for(int x = 0; x < strings2.length; x++){
   strings2[x] = console.next();
}
        boolean x = ( strings2[0] == strings2[2]);
        System.out.println(x);

        strings2[0] = "Привет";
        strings2[1] = "dsa";
        strings2[2] = "Привет";
        strings2[3] = "q";
        boolean xx = ( strings2[0] == strings2[2]);
        System.out.println(xx);


        for(int i = 0; i < 4; i++){
            for(int z = 0; z < 4; z++){
                if ( z == i) {
                    continue;
                } else {
                    boolean xxx = strings2[i] == strings2[z];
                    if (xxx) {
                        System.out.println(i + " " + z + " " + xxx);
                    }
                }

            }

        }

    }

}
