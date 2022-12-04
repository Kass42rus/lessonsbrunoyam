package Lessons2;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Введите целое число: ");
//        int input = scanner.nextInt(); // число
//        System.out.println("Вы ввели: " + input);
//
//        System.out.println("Введите ваше имя: ");
//        String input = scanner.next(); // слово
//        System.out.println("Вы ввели: " + input);
//
//        System.out.println("Введите ФИО: ");
//        String input = scanner.nextLine(); // полностью предложение
//        System.out.println("Вы ввели: " + input);

        System.out.println("Введите радиус окружности, для которого хотите вычислить площадь");
        double radius = scanner.nextDouble();
        double s = Math.PI * Math.pow(radius, 2); // это Р в квадрате
        System.out.printf("Площадь окружности с радиусом %f равняется %.14f", radius, s);

    }
}
