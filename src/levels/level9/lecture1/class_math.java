package levels.level9.lecture1;

public class class_math {

public static int N = 10;

public static void drawValue(double y) {
    int value = (int) (y * N) + N;
    for (int i = 0; i < 2; i++) {
        char c = i == N ? '|' : '.';
        if( i == value)
            c = '*';
        System.out.print(c);
    }
}



    public static void main(String[] args)
    {
        for (int i = 0; i < 10 * N; i++)
        {
            double x = i * 1.0 / N;
            double y = Math.sin(x);
            drawValue(y);
        }
    }
}
