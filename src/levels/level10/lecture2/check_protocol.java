package levels.level10.lecture2;

public class check_protocol {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }

    public static String checkProtocol(String url) {

        char symbol;
        String protocol;
        protocol = "" + "";

        for (int i = 0; i < url.length(); i++) {
            symbol = url.charAt(i);

            if (symbol == ':') {
                break;
            }

            protocol = protocol + symbol;

        }

        //напишите тут ваш код
        if (!protocol.equals("http") && !protocol.equals("https")) {
            protocol = "неизвестный";
        }

            return protocol;
        }



        public static String checkDomain (String url){
            char symbol;
            String domain;
            domain = "" + "";


            for (int i = url.length() - 1; i != 0; i--) {
                symbol = url.charAt(i);

                if (symbol == '.') {
                    break;
                }

                domain = symbol + domain  ;

            }

            //напишите тут ваш код
            if (!domain.equals("com") && !domain.equals("net") && !domain.equals("org")
            && !domain.equals("ru")) {
                domain = "неизвестный";
            }

            return domain;
        }
        }





/*
Метод checkProtocol(String) проверяет, какой сетевой протокол (http или https) у URL-адреса,
полученного входящим параметром, и возвращает результат проверки — строку название сетевого протокола.
 метод checkDomain(String) проверяет, какой домен (com, net, org или ru) у URL-адреса, полученного входящим параметром,
 и возвращает результат проверки — строку название домена.
 Если URL-адрес начинается не с http или https, то результат будет — "неизвестный". Если URL-адрес заканчивается не на
 com, net, org или ru, то результат будет — "неизвестный".

main не принимает участие в тестировании.
 */