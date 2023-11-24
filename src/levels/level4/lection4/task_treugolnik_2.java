package levels.level4.lection4;

public class task_treugolnik_2 {
 public static void main(String[] args) {

     int s = 0;
     while (s < 20){
         if(s == 0){
             int x = 0;
             while (x < 20){
                 System.out.print("Б");
                 x++;
           if(x == 20){
            //   System.out.print("J");
           }
             }
         }
         // System.out.print("S");
         s++;
         if (s == 19 ) {

             System.out.println();

             int v = 0;
             int q = 0;
             while (v < 8) {
                 //System.out.println("V");


                 while (q < 8) {
                     System.out.print("Б");
                     int w = 0;
                     while (w < 18 ) {
                         System.out.print(" ");
                         w++;

                         int la = 0;
                         if (w == 18 ){
                         while (la < 1) {
                             System.out.print("Б");
                             la++;
                         }
                         }
                     }
                     System.out.println();

                     q++;

                 }

                 v++;
               //  q++;
             }
             int k = 0;
             while (k < 20){
                 System.out.print("Б");
                 k++;
             }

         }

     }

    }
}
