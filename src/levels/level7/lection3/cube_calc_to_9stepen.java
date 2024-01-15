package levels.level7.lection3;

public class cube_calc_to_9stepen {
    public static void main(String[] args) {
        ninthDegree(3);
    }

    public static long cube(long a) {

        return a * a * a;

    }

    public static long ninthDegree(long nine) {

return cube(cube(nine));
    }

    //напишите тут ваш код
}


