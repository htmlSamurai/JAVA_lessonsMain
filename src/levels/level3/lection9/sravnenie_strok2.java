package levels.level3.lection9;

public class sravnenie_strok2 {
    public static void main(String[] args){
        template();
    }
    static void template(){
        String s1 = "JavaRush - лучший сайт для изучения Java!";
        String s2 = new String("JavaRush - лучший сайт для изучения Java!");
        System.out.println(s1 == s2);

        String s3 = "JavaRush - лучший сайт для изучения Java!";
        System.out.println(s1 == s3);

        String s4 = "JavaRush - лучший сайт для изучения Java!";
        String s5 = new String("JavaRush - лучший сайт для изучения Java!");
        System.out.println(s4.equals(s5));

        String s6 = "JavaRush - лучший сайт для изучения Java!";
        String s7 = new String("JAVARUSH - ЛУЧШИЙ САЙТ ДЛЯ ИЗУЧЕНИЯ JAVA!");
        System.out.println(s6.equals(s7));

        String address1 = "г. Москва, ул. Академика Королева, дом 12";
        String address2 = new String("Г. МОСКВА, УЛ. АКАДЕМИКА КОРОЛЕВА, ДОМ 12");
        System.out.println(address1.equalsIgnoreCase(address2));
    }
}
