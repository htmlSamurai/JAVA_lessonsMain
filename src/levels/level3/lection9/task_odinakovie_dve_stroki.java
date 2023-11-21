package levels.level3.lection9;

import java.util.Scanner;
public class task_odinakovie_dve_stroki {

    public static void main(String[] args) {
        report();
    }

    static void report() {
        Scanner scanner = new Scanner(System.in);

        String lv_text_first = scanner.next();
        String lv_text_second = scanner.next();

        if (lv_text_second.equals(lv_text_first)) {
            System.out.println("строки одинаковые");
        } else {
            System.out.println("строки разные");
        }

    }
}
