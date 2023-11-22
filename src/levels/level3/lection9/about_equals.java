package levels.level3.lection9;

public class about_equals {
    String model;
    int maxSpeed;

    int dnaCode;

    //Переопределяем класс
    public boolean equals(about_equals man){
        return this.dnaCode == man.dnaCode;
    }
    public static void main(String[] args){
    template();
    }

    static void template(){
        about_equals car1 = new about_equals();
        car1.model = "Ferrari";
        car1.maxSpeed = 300;

        about_equals car2 = new about_equals();
        car2.model = "Ferrari";
        car2.maxSpeed = 300;

        System.out.println(car1 == car2);

        /*
        Будет false Т.к оператор == сравнивает не свойства объектов, а ссылки. ССсылки у car1 и car2
        разные, указыв
         */

        about_equals man1 = new about_equals();
        man1.dnaCode = 1111222233;

        about_equals man2 = new about_equals();
        man2.dnaCode = 1111222233;

        System.out.println(man1 == man2);
        System.out.println(man1.equals(man2));

    }

}


