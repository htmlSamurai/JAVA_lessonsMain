package levels.level3.lection9;

public class sravnenie_strok {
    public static void main(String[] args){
report();
    }

    static void report(){
        String s1 = "Привет";
        String s2 = "ПРИВЕТ";
        String s3 = s1.toUpperCase();
        // сранвить именно содержимое
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s3));

        System.out.println(s2 == s3);


        System.out.println("_________________");

        boolean a = "Привет".equals("ПРИВЕТ");
        System.out.println(a);

        String s = "Привет";
        boolean b = "Привет".equals(s);
        System.out.println(b);

        s = "При";
        boolean c = "Привет".equals(s + "вет");
        System.out.println(c);

        s = "П";
        boolean d = (s + "ривет").equals(s + "ривет");
        System.out.println(d);

        String lv_string1 = "Привет";
        String lv_string2 = "ПРИвЕт";
        String lv_string3 = lv_string1.toUpperCase();

        System.out.println("_________________");

        System.out.println(lv_string1.equalsIgnoreCase(lv_string2));
        System.out.println(lv_string1.equalsIgnoreCase(lv_string3));
        System.out.println(lv_string2.equalsIgnoreCase(lv_string3));
    }
}
