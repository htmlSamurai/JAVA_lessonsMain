package levels.level9.lecture4;

public class sleep_with_milisikinde {
    public static void main(String[] args) throws InterruptedException {
        printNumbers();
    }

    public static void printNumbers() throws InterruptedException {
        //напишите тут ваш код

        for (int i = 1; i <= 10; i++) {

            System.out.println(i);
            if (i != 10) {
                Thread.sleep(1, 300000);
            }
        }



    }
}

