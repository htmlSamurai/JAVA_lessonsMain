package levels.level7.lection7;

public class operator_this {

    int age;
    int weight;
    int height;

    operator_this(int age, int weight){
        this.age = age;
        this.weight = weight;
    }

    operator_this( int age, int weight, int height){
        this(age, weight);
        this.height = height;
    }
}
