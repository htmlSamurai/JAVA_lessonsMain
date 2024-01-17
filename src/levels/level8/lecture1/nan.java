package levels.level8.lecture1;

public class nan {

    public static void main(String[] args) {
        //напишите тут ваш код
        double a = 0.0;
        double b = a * 100;
        div(a, a);
        div(b, a);
    }

    public static void div(double a, double b){
        System.out.println(b/a);
    }

}
