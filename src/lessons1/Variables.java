package lessons1;

public class Variables {
    public static void main(String[] args) {
        int intVariable; // обьявляем переменную
        intVariable = 2000; // инициализируем переменную
        System.out.println(intVariable);


        /*бьявляем перееменную и инициализируем переменную
        в одной строке*/
        int intVariable2 = 999;
        System.out.println(intVariable2);

        int intVariable3 = intVariable + intVariable2; // доступные операции +, -, *, %, /
        System.out.println(intVariable3);

        //intVariable3 = intVariable3 + 10;
        intVariable3 += 10;
        System.out.println(intVariable3);


        byte byteVariable = (byte) 128;
        short shortVariable = (short) 77_777;
        long longVariable = 378_549_854L;
        System.out.println(byteVariable);

        double doubleVariable = 234.777755;
        float floatVariable = (float) 234.777755;
        System.out.println(doubleVariable);
        System.out.println(floatVariable);
/*
Написать преобразование метров в сантиметры
 */
        double meters = 10.5;
        double centimeters = meters * 100;
        System.out.println("В " + meters + " метрах, " + centimeters + " сантиметров");

        double hours = 1;
        double minutes = hours * 60;
        double seconds = minutes * 60;
        System.out.println("В " + hours + " часе, " + seconds + " секуед");

        double celsius = 5;
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Градусы цельсия " + celsius + " в фарингейты " + fahrenheit);

        char charVariable = 'a';
        System.out.println(charVariable);

        char charVariable2 = 97; // порядковый номер символа и позиции в ЮНИКОДЕ
        System.out.println(charVariable2);

        char charVariable3 = (char) (charVariable + 1);
        System.out.println(charVariable3);

        boolean booleanVariable = true; // принимает либо true либо false
        System.out.println(booleanVariable);

        boolean booleanVariable2 = 5 > 7; // доступные операции: >, <, >=, <=, ==, !=
        System.out.println(booleanVariable2);

        String stringVariable = "Hello, ";
        String stringVariable2 = new String("world!"); // не эффективный способ создания строки

        String stringVariable3 = stringVariable + stringVariable2;
        System.out.println(stringVariable3);
        System.out.println(stringVariable + "Java!");
        System.out.println("I am " + 15 + " years old");
        System.out.println(stringVariable3.length());
        System.out.println(stringVariable3.charAt(4));
        String s = "Hello, Bob!".toUpperCase();
        System.out.println(s);

    }
}
