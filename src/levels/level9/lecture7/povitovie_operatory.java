package levels.level9.lecture7;

public class povitovie_operatory {
    public static void main(String[] args) {
        not();
        and();
        operator_and();
        operator_or();
        operator_xor();
        operator_otrajeniya();
        operator_sdivg_vpravo();
        operator_sdviga_vlevo();
        nulevoi_operator_sdviga_vpravo();
    }

    public static void not(){
        int a = 10;

        System.out.println( " a " + a + ", bianry string " + Integer.toBinaryString(a));
        System.out.println("~a = " + ~a + "binary string :" + Integer.toBinaryString(~a));
    }

    public static void and(){
        int a = 10;
        int b = 11;
        int result = a & b ;
        System.out.println("operator and");
        System.out.println( a + " & " + b);
        System.out.println("RESULT = " + result);
        System.out.println("Result in binary string = " + Integer.toBinaryString(result));
    }

    public static void operator_and(){
        System.out.println("Побитовый оператор AND");
        System.out.println(55 & 24);
        //Сравнивает у двух чисех их биты
        // 55 это 110111 (Источник: https://calculat.io/ru/number/dec-to-bin/55)
        // 24 это  11000 (Источник: https://calculat.io/ru/number/dec-to-bin/24)
        // И тут идёт сравнение битов
        // Те 1 сравнивается с пустотой = 0
        // Вториые цифры это единицы, 1 сравнивается с 1 = 1
        // 3 строка = 0 <> 1 = 0;
        // 4 строка = 1 <> 0 = 0;
        // 5 строка = 1 <> 0 = 0;
        // 6 строка = 1 <> 0 = 0;
        // Получаем в битах число 010000
        // Ведущий ноль убираем, и получаем число 10000,
        // А в десятичной системе число 10000 будет равно 16, перевод из двоичной в десятичную

        int x =  (3 & 4);
    }

    public static void operator_or(){
        System.out.println("Побитовый оператор OR");
        // бинарный Оператор OR копирует бит, если он существует в любом из операндов
        System.out.println(55 | 24);
        /*
         // 55 это 110111
         // 24 это  11000
         111111 = 63
         */
    }

    public static void operator_xor(){
        // Бинарный опертаор XOR копирует бит, если он установлен в одном операнде, НО НЕ В ОБОИХ!
        System.out.println(55 ^ 24);
        // 55 это 110111
        // 24 это  11000
        // 101111 = 47
    }

    public static void operator_otrajeniya(){
        //Бинарный оператор дополениня и имеет эффект отражения бит
        System.out.println(~55); //будет -56
    }

    public static void operator_sdviga_vlevo(){
        System.out.println(55<<2);
        // 55 было  ..110111
        // 55 стало 11011100 а это = 220

    }

    public static void operator_sdivg_vpravo(){
        System.out.println(55>>2);
        // 55 было .110111
        // 55 стало убираем  последние 2 символа поулчаем
        // = 1101
    }

    public static void nulevoi_operator_sdviga_vpravo(){
        // Нулевой оператор сдвига вправо
        // значение левых операндов перемещаются вправо ан коло во бит,
        // заданных правым операндом, а сдвинутые значения заполянются нулями
        System.out.println(55>>>2);
        //110111 было
        //001101 стало
        System.out.println("OTEVET");
        System.out.println(1 << 4);
    }
}
