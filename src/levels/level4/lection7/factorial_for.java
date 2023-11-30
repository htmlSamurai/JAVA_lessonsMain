package levels.level4.lection7;

public class factorial_for {

    public static void main(String[] args){
method();
    }

    static void method(){
        int f = 1;
        for (int i = 1; i <= 10; i++)
            f = f * i;
        System.out.println(f);
    }
}
