package levels.level4.lection4;

public class while_operator {
    public static void main(String[] args){
        report();
    }
    static void report(){

        int n = 0;
        while (n < 4) {
            System.out.println("пиши этот текст");
            n++;
        }
        int b = 0;
        while (b < 5) {
            System.out.print("A+");
            b++;
        }
    }
}
