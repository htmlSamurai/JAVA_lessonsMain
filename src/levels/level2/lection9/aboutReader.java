package levels.level2.lection9;

import javax.management.InstanceNotFoundException;
import java.io.*;

//Надо будет ввести например 12 при тесте
//+ Буффер BufferReader
public class aboutReader {

    public static void main(String[] args) throws IOException{

        InputStreamReader reader = new InputStreamReader(System.in);
            int x = reader.read();
            System.out.println(x);

            char lv_value = 1071;
            System.out.println(lv_value);

        BufferedReader lv_reader_new = new BufferedReader(new InputStreamReader(System.in));
        String s = lv_reader_new.readLine();
        System.out.println("Мы считали с клавиатуры эту строку");
        System.out.println(s);

    }
}
