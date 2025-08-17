package main.java.workbook3.abstractinterface;

import java.util.Scanner;

//추상 클래스
abstract class Animal {
    //추상 메서드 : 모든 Animal은 sound() 메서드를 구현해야 함
    abstract void sound();
}
//Animal 클래스를 상속받은 Cat 클래스
class Cat extends Animal {
    // Cat의 소리 출력
    void sound() {
        // TODO: "Meow" 출력
        System.out.println("Meow");
    }
}
//Animal 클래스를 상속받은 Dog 클래스
class Dog extends Animal {
    // Dog의 소리 출력
    void sound() {
        // TODO: "Woof" 출력
        System.out.println("Woof");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("강아지 : 'dog' 입력 | 고양이 'cat' 입력");
        String a1 = sc.next();
        System.out.println("강아지 : 'dog' 입력 | 고양이 'cat' 입력");
        String a2 = sc.next();
        // a1, a2 값에 따라 Animal 객체 생성
        Animal animal1 = a1.equals("cat") ? new Cat() : new Dog();
        Animal animal2 = a2.equals("cat") ? new Cat() : new Dog();
        // Animal 객체의 sound() 호출 (실제 타입에 따라 Cat/Dog 메서드 실행)
        animal1.sound();
        animal2.sound();
    }
}