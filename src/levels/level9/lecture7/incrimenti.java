package levels.level9.lecture7;

public class incrimenti{

        public static void main(String[] args) {
            int a = 3;
            int b = ++a + (a-- * ++a);
            System.out.println(b);
        }
}
