package levels.level6.lecture7;

import java.util.Arrays;

public class Arrays_binary_search {
    public static void main(String[] args) {
        method_binary_search();
    }
    static void method_binary_search(){
        int[] x = {11, -2, 3, 0, 999, -20, 8, -20, 99, -20};
        Arrays.sort(x);
// Тут сначала отсортирует массив, и будет искать его индекс,
        // массив после соритровки будет -20, -20, -20, -2, 0, 3, 8, 11, 99, 999
        //Индексы начинаются с 0, значит число 0 будет пятым индексом ( 0 = -20, 1 = -20, 2 = -20, 3 = -2, 4 = 0 )
        int index1 = Arrays.binarySearch(x, 0);
        System.out.println(index1);

        int index2 = Arrays.binarySearch(x, -20);
        int index3 = Arrays.binarySearch(x,99);
        int index4 = Arrays.binarySearch(x,5); //Элемент в массиве не найден, индекс будет отрицательным
       System.out.println(index2 + " " + index3 + " " + index4 + " ");
    }
}
