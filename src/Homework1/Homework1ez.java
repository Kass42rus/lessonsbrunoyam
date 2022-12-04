package Homework1;

import java.util.Scanner;

public class Homework1ez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        System.out.println("Введите порядков8ый номер для дня недели от 1 до 7 включительно");

        input = scanner.nextInt();
        if (input >= 1 & input <= 7) {
            if (input == 1) {
                System.out.println("Вы ввели порядковый номер Понедельник");
            } else if (input == 2) {
                System.out.println("Вы ввели порядковый номер Вторник");
            } else if (input == 3) {
                System.out.println("Вы ввели порядковый номер Среда");
            } else if (input == 4) {
                System.out.println("Вы ввпли порядковый номер Четверг");
            } else if (input == 5) {
                System.out.println("Вы ввели порядковый номер Пятница");
            } else if (input == 6) {
                System.out.println("Вы ввели порядковый номер Суббота");
            } else if (input == 7) {
                System.out.println("Вы ввели порядковый номер Воскресенье");
            }
        } else {
            System.out.println("Вы лжец!");

        }
    }
}
