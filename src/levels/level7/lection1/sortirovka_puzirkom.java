package levels.level7.lection1;

import java.util.Arrays;

public class sortirovka_puzirkom {
    public static void main(String[] args) {
        method();
    }
    public static void method(){
        int[] massive = {11, 3, 14, 16, 7,};

        boolean isSorted = false;
        int buffer;

        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < massive.length - 1; i++) {
                if(massive[i] > massive[i + 1]){
                    isSorted = false;
                    buffer = massive[i];
                    massive[i] = massive[i + 1];
                    massive[i + 1] = buffer;
                }
            }

        }
        System.out.print(Arrays.toString(massive));
    }
}
