package levels.level4.lection5;

public class operator_continue {
    public static void main(String[] args){
        int i = 0;
        while ( i <= 20){
        i++;
            if( i > 10 ) {
                continue;
            }
            System.out.println(i);
        }
    }
}
