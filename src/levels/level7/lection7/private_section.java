package levels.level7.lection7;

public class private_section {

    private String name;
    private int age;
    private int weight;

    public private_section(String name,int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }



    public private_section(){
getAge();
getName();
    }

    public void sayMeow(){
        System.out.println("Мяу");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

}
