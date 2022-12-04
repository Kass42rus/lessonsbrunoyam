package Homework1;

import java.util.Locale;
import java.util.Scanner;

public class equels {
    public static void main(String[] args) {

        System.out.println("Что это такое: синий, большой, с усами и полностью набит зайцами?");
        Scanner answer = new Scanner(System.in);

        String input = answer.nextLine();
        input = input.toUpperCase();

        if (input.equals("ТРОЛЛЕЙБУС")) {
            System.out.println("Вы разгодали загадку");
        } else {
            System.out.println("Подумай еще раз");
        }
    }
}
