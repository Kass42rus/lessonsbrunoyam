package Oop;

// Файл Dod.java:
public class Dog {
    private double volume = 5; // инициализированное поле - громкость
    private String name; // неинициализированное поле - кличка

    public void speak() {
        System.out.println("gaw gaw");
    }

    // конструкторы класса:
    public Dog(String name_){
        this.name = name_;
    }

    public Dog(String name_, double volume_) {
        this.name = name_;
        volume = volume_;
    }
}

