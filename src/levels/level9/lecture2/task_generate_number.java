package levels.level9.lecture2;
/*
В этой задаче тебе предстоит реализовать метод generateNumber(), который будет возвращать случайное число от 0 до 99.
В методе generateNumber() используй метод Math.random().

Требования:
•	В классе Solution должен быть публичный статический метод generateNumber() с типом возвращаемого значения int.
•	Реализуй метод generateNumber() согласно условию.
 */
public class task_generate_number {
public static int number;
    public static void main(String[] args) {
        System.out.println(generateNumber());
    }

    public static int generateNumber() {
        //напишите тут ваш код
  return (int) (Math.random() * 100);
    }
}


