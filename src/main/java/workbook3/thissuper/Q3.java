package main.java.workbook3.thissuper;

import java.util.Scanner;

class Animal {
    String name;

    Animal(String name) {
        System.out.println("Animal constructor");
        this.name = name;
    }
}

class Dog extends Animal /* TODO: Animal 클래스 상속 */ {
    Dog(String name) {
        // TODO: super() 호출
        super(name);
        System.out.println("Dog constructor");
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
         Dog dog = new Dog(n);
         // TODO: Dog 클래스 완성 후 아래 주석 해제
         System.out.println(dog.name);
    }
}