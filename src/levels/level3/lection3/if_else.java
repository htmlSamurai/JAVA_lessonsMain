package levels.level3.lection3;

public class if_else {

    public static void main(String[] args){

        Template_one();
        template_second();

    }

   static void Template_one() {

       int age = 17;
       if (age < 18)
           System.out.println("Вы ещё ребёнок");
       else
           System.out.println("Вы взрослый");

   }




    static void template_second() {

        int temperateure = 5;
        if (temperateure < 0)
            System.out.println("мороз");
        else
            System.out.println("тепло");

        int age_second = 18;

        if (age_second == 18)
            System.out.println("тебе уже 18, оформляй доки");
        else
            System.out.println("Всё равно офрмляй доки");
    }

    }


