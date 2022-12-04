package Lessons2;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("На улице идет дождь? Если да, то введите 'true', иначе ввете 'false' ");
//
//        boolean is_Raining = scanner.nextBoolean();
//        if (is_Raining) {
//            System.out.println("Возьмите с собой зонт!");
//        } else{
//            System.out.println("Можно не брать с собой зонт");
//        }
//    }

  /*
  Ввести с клавиатуры два целых числа A и B
  написать программу, определяющую делится ли на цело А на B

  Подсказка: использовать деление по модулю (%)
   */

//        System.out.println("Введите два целые число: ");
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//
//        if (a % b == 0) {
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//        }

        int input;

//        System.out.println("Загадайте число от 1 до 5 включительно");
//        input = scanner.nextInt();
//
//        if (input >= 1 & input <= 5) {
//            if (input == 1) {
//                System.out.println("Вы загадали цифру 1");
//            } else if (input == 2) {
//                System.out.println("Вы загадали цифру 2");
//            } else if (input == 3) {
//                System.out.println("Вы загадали цифру 3");
//            } else if (input == 4) {
//                System.out.println("Вы загадали цифру 4");
//            } else if (input == 5) {
//                System.out.println("Вы загадали цифру 5");
//            }
//        } else {
//            System.out.println("Вы лжец!");
//        }

//        System.out.println("Загадайте число от 1 до 5 включительно");
//        input = scanner.nextInt();
//
//        switch (input) {
//            case 1:
//                System.out.println("Вы загадали цифру один");
//                break;
//            case 2:
//                System.out.println("Вы загадали цифру два");
//                break;
//            case 3:
//                System.out.println("Вы загадали цифру три");
//                break;
//            case 4:
//                System.out.println("Вы загадали цифру четыре");
//                break;
//            case 5:
//                System.out.println("Вы загадали цифру пять");
//                break;
//            default:
//                System.out.println("Некорректный ввод");
//        }

        /*
        Ввести с клавиатуры число в диапазоне 1...10
        Написать программу, определяющую является ли четным числом
        подсказка: использовать давление по модулю (%)
        */

//        System.out.println("Введите с клавиатуры число в диапазоне от 1 до 10 ");
//        input = scanner.nextInt();
//
//        if (input % 2 == 0 ){
//            System.out.pr intln("Вы ввели четное число");
//
//        }else {
//            System.out.println("Вы ввели нечетное число");
//        }

        System.out.println("Введите с клавиатуры ччисло в диапазоне от 1 до 10 ");
        input = scanner.nextInt();

        switch (input) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
                System.out.println("Вы ввели четное число");
                break;
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
                System.out.println("Вы ввели нечетное число");
            default:
                System.out.println("Число вне диапазона");
        }
    }
}