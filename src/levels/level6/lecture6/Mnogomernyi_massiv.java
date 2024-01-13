package levels.level6.lecture6;

import java.util.Arrays;

public class Mnogomernyi_massiv {

    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {

        for (int i = 0; i < multiArray.length; i++) {
            System.out.println(Arrays.deepToString(multiArray[i]));
        }
        //напишите тут ваш код
    }
}