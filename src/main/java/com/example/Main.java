package com.example;

public class Main {

    public static void main(String[] args) {
        var dog = new Dog();
        dog.woof();

        var cat = new Cat();
        cat.meow();

        System.out.println("dog.logger == cat.logger : " 
        + (dog.getLogger()==cat.getLogger()));
    }

}
