package levels.level6.lecture1;

public class protivopolojnii_znak_massiva {
    public static int[] array = new int[]{-1, 2, 3, -4, -5};

    public static void main(String[] args) {

        report();
    }
    static void report(){
//чтобы поментяь знак на противоположный надо умножить число на -1
        for (int i = 0; i <= 4; i++){
            if (array[i] % 2 == 0){
            array[i] = array[i] * -1;
            }
        }

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);

    }
}
