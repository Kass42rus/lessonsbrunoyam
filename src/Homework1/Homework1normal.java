package Homework1;

import java.util.Scanner;

public class Homework1normal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input;

        System.out.println("Введите номер день недели");
        input = scanner.nextInt();

        switch (input) {
            case 1:
                System.out.println("Вы ввели поенедельник");
                break;
            case 2:
                System.out.println("Вы ввели вторник");
                break;
            case 3:
                System.out.println("Вы ввели среда");
                break;
            case 4:
                System.out.println("Вы ввели четверг");
                break;
            case 5:
                System.out.println("Вы ввели пятница");
                break;
            case 6:
                System.out.println("Вы ввели суббота");
                break;
            case 7:
                System.out.println("Вы ввели воскресенье");
                break;
            default:
                System.out.println("Не верный код");
        }
    }
}
