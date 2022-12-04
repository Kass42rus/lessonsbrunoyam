package Homework1;

import java.util.Scanner;

public class Homewwork1hard {
    public static void main(String[] args) {

        System.out.println("Что это такое: синий, большой, с усами и полностью набит зайцами?");

        Scanner inputanswer = new Scanner(System.in);
        String answer = inputanswer.next();

        switch (answer){
            case("Тролейбус"):
                System.out.println("Вы отгадали загадку");
               break;
            case("Не правильный ответ"):
                System.out.println("Вы не отгадали загадку");
                break;
            default:
                System.out.println("Попробуй отгадай!");
        }

    }
}
