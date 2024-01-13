package levels.level6.lecture7;

import java.util.Arrays;

public class arrays_fill {
    public static void main(String[] args) {
        int[] x = new int[100];
        for (int i = 0; i < x.length ; i++) {
            x[i] = i;
           // System.out.println(Arrays.toString(x));
        }


        int[] array = new int[100];
        Arrays.fill(x,999);
        System.out.println(Arrays.toString(x));
    }
}
