package levels.level4.lection4;

public class task_treugolnik_2 {
 public static void main(String[] args) {

     int s = 0;
     while (s < 10){
         if(s == 0){
             int x = 0;
             while (x < 10){
                 System.out.print("X");
                 x++;
           if(x == 10){
            //   System.out.print("J");
           }
             }
         }
         // System.out.print("S");
         s++;
         if (s == 9 ) {

             System.out.println();

             int v = 0;
             int q = 0;
             while (v < 5) {
                 //System.out.println("V");


                 while (q < 5) {
                     System.out.print("V");
                     int w = 0;
                     while (w < 8) {
                         System.out.print("W");
                         w++;

                         int la = 0;
                         if (w == 8){
                         while (la < 1) {
                             System.out.print("L");
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
             while (k < 10){
                 System.out.print("K");
                 k++;
             }

         }

     }

    }
}
