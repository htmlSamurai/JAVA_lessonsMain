package levels.level3.lection4;

import javax.sound.midi.SysexMessage;

public class nuances_if {

    public static void main(String[] args){

            first_variant();
            right_variant();
            osobennost_if();

        }

        static void first_variant(){
            int temperature = 9;
            if (temperature > 20)
                System.out.println("Надеть рубашку");
            else // тут температура меньше или равна 20
            {
                if (temperature > 10 )
                    System.out.println("Надеть свитер");
                else //тут температура меньше или равна 10
                {
                    if (temperature > 0)
                        System.out.println("Надеть плащ");
                    else
                        System.out.println("Надеть теплое пальто");
                }
            }
    }

    static void right_variant(){

        int temperature = 9;

        if (temperature > 20)
            System.out.println("Надеть рубашку");
        else if (temperature > 10)
            System.out.println("Надеть свитер");
        else if (temperature > 0)
            System.out.println("Надеть плащ");
        else
            System.out.println("Надеть пальто");

    }

    static void osobennost_if(){
        // тут не отработает тк это всё одна вложенность,

        int age = 65;
        if (age < 60)
            if ( age > 20)
                System.out.println("надо рабоатьь");
        else
            System.out.println("можно не работать");

        // Это тоже самое что и

        int ages = 65;
        if (age < 60 )
        {
            if (age> 20)
                System.out.println("надо работать");
            else
                System.out.println("можно не работать");

        }
    }


}
