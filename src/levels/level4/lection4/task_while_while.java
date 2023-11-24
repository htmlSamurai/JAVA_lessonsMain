package levels.level4.lection4;

public class task_while_while {
    public static void main(String[] args){
        report();
    }
    static void report(){

        int n = 0;
        while (n < 5){
            System.out.print("A");

            int m = 0;
            while(m < 10){

                m++;
            }
            System.out.println("A");
            n++;
        }
    }
}
