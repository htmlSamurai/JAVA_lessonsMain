package levels.level6.lecture7;

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {

        sorted();
    }

    static void sorted(){

        int[] x = {11, -2, 3, 0, 999, -20, 8, -20, 99, -20};

        Arrays.sort(x);

        String str = Arrays.toString(x);

        System.out.println(str);

        Arrays.sort(x, 5, x.length);
        String new_string = Arrays.toString(x);

        System.out.println(new_string);

    }
}
