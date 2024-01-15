package levels.level7.lection3;

public class return_result {
    public static void main(String[] args) {

        //min(3, 4);
        System.out.println(min(3, 4));

    }

    public static int min(int a, int b){
        if(a < b)
            return a;
        else
            return b;
    }
}
