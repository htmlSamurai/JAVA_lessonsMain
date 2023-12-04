package levels.level6.lecture1;

public class task_mediumlevel {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void main(String[] args) {

        int x = firstArray.length;
        int c = secondArray.length;
        resultArray = new int[x + c];
        int n = resultArray.length;
        //int b = 0;

        for (int q = 0; q < n; q++) {
           if (q < firstArray.length) {
               resultArray[q] = firstArray[q];
           } else {
               resultArray[q] = secondArray[ q - secondArray.length];
               //b++;
           }

        }

          for (int i = 0; i <resultArray.length; i++){
             System.out.println(resultArray[i] + ", ");
            }
    }
}
