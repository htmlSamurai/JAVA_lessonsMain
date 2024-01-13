package levels.level6.lecture7;
import java.util.Arrays;
import java.util.Optional;
//Сортировка массива по возрастанию и убыванию
public class find_massiv_element {

    public static void main(String[] args) {
        method();
    }

    static void method(){

        int[] array = new int[]{3,5,1,-3,4,2,17,-97,15,14,35};
int[] copy_po_vozrostaniy  = new int[array.length];
int[] copy_po_ubivaniy = new int[array.length];


System.arraycopy(array, 0, copy_po_vozrostaniy, 0, copy_po_vozrostaniy.length);

int lv_count_minus = 0;
int lv_count_plus = 0;
        int lv_min_value = array[0];
        int kyda_stavit = 0;


        //Сравнить 2 элемента в массиве и поменять их местаим
        for (int x = 0; x < array.length; x++){
            lv_count_minus  = 0;
            lv_count_plus = 0;
        for (int j = 0; j < array.length; j++){
            if(array[j]> array[x]){
                lv_count_plus = lv_count_plus + 1;
            } else if (array[j]< array[x] ){
                lv_count_minus = lv_count_minus + 1;
            } else {
                lv_count_minus = lv_count_minus + 1;
                lv_count_plus = lv_count_plus + 1;
            }
            }
         kyda_stavit = lv_count_minus - 1;
            copy_po_vozrostaniy[kyda_stavit] = array[x];

            kyda_stavit = lv_count_plus - 1;
            copy_po_ubivaniy[kyda_stavit] = array[x];
        }

        System.out.println(Arrays.toString(copy_po_vozrostaniy));
        System.out.println(Arrays.toString(copy_po_ubivaniy));

        for (int i = 1; i <= 1 ; i++) {
            System.out.println(copy_po_vozrostaniy[i]);
        }

      //  System.out.println(lv_min_value);


    }
}
