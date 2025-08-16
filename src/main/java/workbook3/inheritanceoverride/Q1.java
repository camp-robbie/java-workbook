package main.java.workbook3.inheritanceoverride;

class Animal {
    String name;
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {                                              // Dog 클래스가 Animal 클래스를 상속받음
    public Dog() {
        super.name = "Dog";}                                             // super 키워드 맛보기(부모클래스의 필드에 접근)
    void bark() {
        System.out.println("Barking...");
    }                   // Dog 클래스의 메서드
}

public class Q1 {
    public static void main(String[] args) {
        Dog dog = new Dog();                                            // Dog 클래스 객체 생성(Animal 클래스도 상속받았으므로 Animal의 멤버도 사용 가능)
        System.out.println("dog.name = " + dog.name);                   // 상속받은 Animal클래스의 name 필드 값 출력
        dog.eat();                                                      // 상속받은  Animal 클래스의 메서드 호출
        dog.bark();                                                     // Dog클래스 메서드 호출
    }
}
