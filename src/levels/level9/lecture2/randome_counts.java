package levels.level9.lecture2;

public class randome_counts {

    public static int a = 41;
    public static int c = 11119;
    public static int m = 11113;
    public static int seed = 1;

    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++){
            System.out.println(getNextRandom());
        }

    }

    public static int getNextRandom(){
        seed = (a * seed + c) % m;
        return seed;

    }


}
