package levels.level3.lection9;

public class ternarny_operator2 {

    private int age;

    public ternarny_operator2(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
    public static void main(String[] args){
        template();
    }

    static void template(){

        ternarny_operator2 man = new ternarny_operator2(22);

        String securityAnswer;

        if (man.getAge() >= 18) {
            securityAnswer = "Всё ок, проходите";
        } else {
            securityAnswer = "Этот фильм не подвходит для вашего возраста";
        }
        System.out.println(securityAnswer);


      String newAnswer = man.getAge() >= 18 ? "Всё впорядке проходите" : "Этот фильм не для вашего возраста";
      System.out.println(newAnswer);

        }

}
