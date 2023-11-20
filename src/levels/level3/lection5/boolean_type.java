package levels.level3.lection5;

public class boolean_type {

    public static void main(String[] args){

        int record = 612;
        int value = 615;

        boolean hasNewRecord = ( value > record);
        boolean check_value = (value < record);
        System.out.println(hasNewRecord + " " + check_value);

        int age = 70;
        boolean isSenior = (age > 65);
        if (isSenior)
            System.out.println("пора на пенсию");




    }
}
