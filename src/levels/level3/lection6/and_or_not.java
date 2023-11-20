package levels.level3.lection6;

public class and_or_not {
    public static void main(String[] args){
        // И = &&
        // || = ИЛИ
        // ! = NOT
        var a = 1;
        var b = 2;

        boolean x_bool = (0 < a) && (b > 0);
        System.out.println(x_bool);


        int age = 35;
        boolean isYoung = (age < 18); // if age < 18 = true // false
        boolean isOld = (age > 65); // false
        if (!isYoung && !isOld) //если isyoung ne true and isold ne true
            System.out.println("можно работать");
        }
}
