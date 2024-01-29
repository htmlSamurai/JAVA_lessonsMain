package levels.level10.lecture1;
import java.util.regex.Pattern;
/*
 Публичный статический метод toOctal(int) должен переводить целое число, полученное в качестве входящего параметра,
 из десятичной системы счисления в восьмеричную. А публичный статический метод toDecimal(int) наоборот — из восьмеричной в десятичную.
 Методы работают только с положительными числами. Если входящий параметр меньше или равен 0, методы возвращают 0.
 Твоя задача — реализовать эти методы.

 Один из алгоритмов перевода десятичного числа в восьмеричное следующий:
 i равно 0
         while(десятичное число не равно 0) {
     восьмеричное число = восьмеричное число + (остаток от деления десятичного числа на 8) * на 10 в степени i
     десятичное число = десятичное число / 8
     i увеличиваем на 1
 }

 Один из алгоритмов перевода восьмеричного числа в десятичное следующий:
 i равно 0
         while(восьмеричное число не равно 0) {
     десятичное число = десятичное число + (остаток от деления восьмеричного числа на 10) * на 8 в степени i
     восьмеричное число = восьмеричное число / 10
     i увеличиваем на 1
 }

 Метод main() не принимает участие в тестировании.

 Подсказка: чтобы возвести число в степень, можно использовать метод Math.pow(число, степень).

  */
public class perevod_iz_vosmerichnoi_v_desyatok {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        if(decimalNumber>0) {
            String ddecimalOctal = "";
            while (decimalNumber > 0) {
                int oststok = decimalNumber % 8;
                ddecimalOctal = oststok + ddecimalOctal;
                decimalNumber /= 8;
            }
            return (int) Double.parseDouble(ddecimalOctal);
        }
        return 0;
    }

    public static int toDecimal(int octalNumber) {
        if(octalNumber>0) {
            String linghtnum = "" + octalNumber;
            linghtnum = String.valueOf(linghtnum.length());
            int[] number = new int[(int) Double.parseDouble(linghtnum)];
            int res = 0;
            for (int i = 0; i < number.length; i++) {
                number[i] = octalNumber % 10;
                octalNumber /= 10;
            }
            for (int i = 0; i < number.length; i++) {
                number[i] = (int) (number[i] * Math.pow(8, i));
            }
            for (int i = 0; i < number.length; i++) {
                res += number[i];
            }
            return res;
        }


        return 0;
    }
}