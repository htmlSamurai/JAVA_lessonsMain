package levels.level9.lecture7;

public class operatory_java {
    public static void main(String[] args) {

        unarnii_operator();
        incriment_decriment();
    }

    public static  void  unarnii_operator(){
        int x = 0;
        x = (+5) + (+15);
        System.out.println("x =" + x);

        int y = -x;
        System.out.println("y = " + y);
    }

    public static void incriment_decriment(){
        System.out.println("Инкримент и дикреимент");
        int x = 9;
        x++;
        System.out.println(x);

        int y = 21;
        y--;
        System.out.println(y);
    }

    public static void operatori_sravneniya(){
        int a = 1;
        int b = 2;

        boolean comparisonResult = a == b;
        System.out.println(" a == b :" + comparisonResult);

        comparisonResult = a != b;
        System.out.println("a != b : " + comparisonResult);

        comparisonResult = a > b;
        System.out.println("a >  b :" + comparisonResult);

        comparisonResult = a >= b;
        System.out.println("a >= b :" + comparisonResult);

        comparisonResult = a < b;
        System.out.println("a <  b :" + comparisonResult);

        comparisonResult = a <= b;
        System.out.println("a <= b :" + comparisonResult);
    }


}
