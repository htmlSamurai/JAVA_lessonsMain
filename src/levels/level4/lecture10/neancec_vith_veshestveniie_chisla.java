package levels.level4.lecture10;

public class neancec_vith_veshestveniie_chisla {
    public static void main(String[] args){
        report();
    }

    static void report(){

        //Метод Math.round() округляет число до ближайшего целого:
        long x = Math.round(2.7); // 3
        int b = (int) Math.round(2.7); // 3

        int g = (int) Math.round(4.1); //4
        int z = (int) Math.round(4.5); // 5
        int m = (int) Math.round(4.9); //5

        System.out.println(x);
        System.out.println(b);
        System.out.println(g);
        System.out.println(z);
        System.out.println(m);
//Метод Math.ceil() округляет число до целого вверх, примеры:

        System.out.println("");
        int q = (int) Math.ceil(4.1);
        int w = (int) Math.ceil(4.5);
        int e = (int) Math.ceil(4.9);
        System.out.println(q);
        System.out.println(w);
        System.out.println(e);

        // Метод Math.floor() округляет число до целого вниз, примеры:

        int r = (int) Math.floor(4.1);
        int t = (int) Math.floor(4.5);
        int y = (int) Math.floor(4.9);
        System.out.println(r);
        System.out.println(t);
        System.out.println(y);
    }
}
