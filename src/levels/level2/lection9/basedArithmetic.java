package levels.level2.lection9;

public class basedArithmetic {

    public static void main(String[] args){
        int x = 10;
        int y = 2;

        System.out.println(x+y); //сложение
        System.out.println(x-y); //вычетание
        System.out.println(x*y); //умножение
        System.out.println(x/y); //делить

        int z = 33%2; //33 на 2 не делиться, т.е будет полное число. 33/2 = будет 16 и лишний хвост
        // Этот хвост и будет резулоьтатом операции остаток отделения
        System.out.println(z);
        /*
        == равно или сравнение
        > больше
        < меньше
        >= больше или равно
        <= меньше или равно
        != не равно

         */

        int x_second = 33;
        int y_second = 555;
        System.out.println(x_second = y_second);  //Тут переменная y_second (999)  записалась в x_second
        System.out.println(x_second == y_second);  //а это оператор сравнениня

        int z_second = 1432;
        x_second = y_second = z_second; //Можно как и в ABAP присиваивать по цепочке
        System.out.println(x_second);

        //В JAVA есть унарные знаки, они меняют число на противоположное, с 999 на -999

        int value = 555;

        value = -value;
        System.out.println(value);

        value = -value;
        System.out.println(value);

        //Также можно увеличивать на единицу число,
        //++ Инкремент и -- декремент
        // ++ Увеличивает число, --Уменьшает

        int x_plus_minus = 5;
        x_plus_minus++;
        System.out.println(x_plus_minus);

        x_plus_minus--;
        System.out.println(x_plus_minus);



        /*
        x++ - постфиксная запись
        Постфиксная запись срабатывает после основного выражения

        например
        int x = 999;
        int y = x++;
        System.out.println(y);
        System.out.println(x);
          Результат будет
          999
          1000.


          Т.е.
          int y = x++; // сначала выполнится
          y = x; // и переменной y будет присвоино знгачение x, а только потом x++



        ++x - префиксная запись
        int x = 999;
        int y = ++x;
        System.out.println(y);


         */

        int lv_test = 1;
        while(lv_test != 10) {
        lv_test++;
        System.out.println(lv_test);

        System.out.println("Вызываем метод Инкримент и декримент " );
        incrementDecrement();
        }

    }
    public static void incrementDecrement(){
        int a = 1;
        // int b = a++;
        int c = ++a;
        c++;
        System.out.println("a = " + a);
        //System.out.println("b = " + b);
        System.out.println("c = " + c);

        int i = 0;
        System.out.println("строка 1, i = " + i);
        System.out.println("строка 2, Инкремент префикс ++i, i = " + ++i);
        System.out.println("строка 3, i = " + i);
        System.out.println("строка 4, Инкримент постфиксная форма i++, i = " + i++);
        System.out.println("строка 5, i = " + i);
        System.out.println("Строка 6, Декримент префиксная форма --i, i = " + --i );
        System.out.println("строка 7, i = " + i);
        System.out.println("строка 8, декримент постфиксная форма i--, i = " + i-- );
        System.out.println("строка 9, i = " + i);

        /*
        Короче при префиксе ++x; значение прибавляет сразу

        При постфиксной форме x++; значение прибавляет после операции, т.е вернётся сначала текущее значение,
        А уже после значение x увеличивается на 1
         */


        /*
        Также есть символы
        +=
        -=
        *=
        /=
        %=

       x += y означает x = x + y, просто для кратости используется два знака подряд.


       !  это оператор не
       например boolean x = true;
       System.out.println(!x); // выведет false

       И олператор && возвращает true только в том случае, если оба операнда являются true
         */

        System.out.println(100 > 10 && 100 > 200);
        System.out.println(100 > 50 && 100 >= 100);

        // Оператор || (ИЛИ) возвращает true если хотя бы одна из операндов будет истинной
        System.out.println(100 > 10 || 100 > 200);
        System.out.println("Оператор || (или)");

    }

}
