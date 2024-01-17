package levels.level8.lecture4;

public class classes {
    public static void printPoints(point[] points)
    {
        for (int i = 0; i < points.length; i++)
points[i].print();
    }

    public static void main(String[] args)
    {
        point[] data = new point[100];
        for (int i = 0; i < data.length; i++)
            data[i] = new point();
            printPoints(data);

        }
    }

