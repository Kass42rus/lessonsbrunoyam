package Lessons2;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

//        for (int i = 0; i < 100; i++) {
//            System.out.println("Hello World!");
//        }
//    }

        int count = 0;
        while (count < 5) {
            System.out.println("Hello, Java!");
            count = count + 1;
        }

        System.out.println();
        int y, x = 0;

        // Инкремент
        y = x++;
        System.out.println("x = " + x + ", y = " + y);
        y = ++x;
        System.out.println("x = " + x + ", y = " + y);

        // Декремент
        y = x--;
        System.out.println("x = " + x + ", y = " + y);
        y = --x;
        System.out.println("x = " + x + ", y = " + y);

        System.out.println();

        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Чтобы подтвердить, что вы не робот, введите 555");
//        int input = scanner.nextInt();
//
//        while (input != 555) {
//            System.out.println("Чтобы подтвердить, что вы не робот, введите 555");
//            input = scanner.nextInt();
//        }

        int input;
        do {
            System.out.println("Чтобы подтвердить, что вы не робот, введите 555");
            input = scanner.nextInt();
        } while (input != 555);
            System.out.println("Урааа! Вы успешно подтвердили, что вы не робот");


    }
}
