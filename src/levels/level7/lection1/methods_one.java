package levels.level7.lection1;

import java.util.Arrays;

public class methods_one {
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        //напишите тут ваш код
        int dlinna = 0;
        int first = array[0];
        int count = 0;
        int[] copy = new int[array.length];
        int element_number = 0;

        while ( count != array.length){


            for (int i = 1; i < array.length; i++) {

                if (array[i] > array[count]) {
                    element_number = element_number + 1;


                }
            }
            copy[element_number] = array[count];
            count = count + 1;

            element_number = 0;
        }

        for (int j = 0; j < array.length; j++){ //: copy){
            array[j] = copy[j];
        }
        for(int q : array){
            System.out.print(q + ", ");
        }
        System.out.println();
        //System.out.println(Arrays.toString(copy));
    }
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
