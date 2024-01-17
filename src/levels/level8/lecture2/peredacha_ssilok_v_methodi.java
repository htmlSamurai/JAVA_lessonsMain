package levels.level8.lecture2;
//Заполняем массив array текстом Hello в каждую ячейку
public class peredacha_ssilok_v_methodi {
    public static void fill(String[] array, String value){
        for(int i = 0; i < array.length; i++)
            array[i] = value;
    }

    public static void main(String[] args) {
        String[] data = new String[10];
        fill(data, "Hello");
    }

}
