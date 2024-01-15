package levels.level7.lection3;

public class return_template {

    public static void main(String[] args) {

    }

    public static void signIn(String username){
        //напишите тут ваш код
        //String user = "user";

        if( username == "user") {
            return;
        }

        System.out.println("Добро пожаловать " + username);
        System.out.println("Очень скучали по Вам, " + username);
    }
}



