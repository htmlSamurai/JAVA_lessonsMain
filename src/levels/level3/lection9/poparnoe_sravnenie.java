package levels.level3.lection9;

public class poparnoe_sravnenie {
    public static String string1 = "Амиго";
    public static String string2 = string1;
    public static String string3 = new String(string1);

    public static void main(String[] args) {
        report();
    }

    static void report() {
        String same = "ссылки на строки одинаковые";
        String different = "ссылки на строки разные";
        //напишите тут ваш код
        // System.out.println(same);
        // System.out.println(different);


        System.out.println( string1 == string2 ? same : different);
        System.out.println( string2 == string3 ? same : different);
        System.out.println( string1 == string3 ? same : different);
        /*
        if (string1 == string2) {
            System.out.println(same);
        } else {
            System.out.println(different);

        }

        if (string2 == string3) {
            System.out.println(same);
        } else {
            System.out.println(different);

        }

        if (string1 == string3) {
            System.out.println(same);
        } else {
            System.out.println(different);
        }
        */

    }
}
