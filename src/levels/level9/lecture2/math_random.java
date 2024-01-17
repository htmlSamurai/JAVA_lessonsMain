package levels.level9.lecture2;

public class math_random {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int x = getRandomDiceNumber();
            System.out.println(x);
        }
    }

    public static int getRandomDiceNumber(){
        return(int) (Math.random() * 6);
    }


}
