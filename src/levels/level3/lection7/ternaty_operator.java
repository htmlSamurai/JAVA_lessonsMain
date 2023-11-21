package levels.level3.lection7;

public class ternaty_operator {

    public static void main(String[] args){

        teplate();
    }

    static void teplate(){

        int a = 2;
        int b = 3;
        int min = a < b ? a : b;
        System.out.println(min);

        //тут читается так, если age > 30, То присвоить 100 в Money, иначе присвоить 50 в Money
        int age = 25;
        int money = age > 30 ? 100 : 50;

    }
}
