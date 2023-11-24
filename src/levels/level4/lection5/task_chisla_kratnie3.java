package levels.level4.lection5;

public class task_chisla_kratnie3 {
    public static void main(String[] args) {
        int sum = 0;
        int value = 0;
        while (value <= 100) {
            value++;
            if (value > 100) {
                continue;
            } else {
                if ((value % 3) != 0)
                  //  System.out.println(value);
                 sum+= value;
                {

                }

            }
        }
        System.out.println(sum);
    }
}