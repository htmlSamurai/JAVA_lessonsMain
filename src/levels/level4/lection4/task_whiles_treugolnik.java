package levels.level4.lection4;

/*

Используя вложенные циклы while (цикл в цикле) выведи на экран незаполненный прямоугольник
(его контур) размером 10 (высота) на 20 (ширина) из букв 'Б'.

Незаполненная часть состоит из пробелов.

Пример вывода:
ББББББББББББББББББББ
Б                  Б
Б                  Б
Б                  Б
Б                  Б
Б                  Б
Б                  Б
Б                  Б
Б                  Б
ББББББББББББББББББББ
 */

public class task_whiles_treugolnik {
    public static void main(String[] args) {

        int z = 0;

       while (z < 20){
           z++;
           System.out.print("Z");

           int v = 10;
           while (v > 0 && ( z == 10  ) ){
               v--;
               System.out.println();

               int s = 0;
               while (s < 1){

                   s++;

                   int k = 0;
                   while (k < 10){
                       k++;

                   }
               }
               System.out.print("S");


              // System.out.print(" ");

           }


          //  System.out.println("S");

           System.out.print("V");
       }

        }
    }







