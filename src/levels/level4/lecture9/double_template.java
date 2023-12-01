package levels.level4.lecture9;

public class double_template {

    public static void main(String[] args){

        method_double();

        anothers();

    }
    static void method_double(){
        double price = 5.0;
        double weight = 2;
        double x = 1.0, y = 2.0, z = 3.0;

        int  s = (int)(5.5); // Будет 5

        double a = 5.999;
        int preobrazovanie = (int)(a); // Будет 5

        double lv_a = 5.999;
        int b = 2;
        int lv_final = (int)( lv_a * b);

    }

    static void anothers(){
        double d = 5.0 / 2;
        double c = 5 / 2.0;
        double g = 5.0 / 2.0;
        System.out.println(d + " " +  c + " "  + " " + g);

        int lv_a = 5;
        int lv_b = 2;
        double lv_d = lv_a * 1.0 / lv_b;
        System.out.println(lv_d);
    }
}
