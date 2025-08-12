package main.java.workbook2.paramtypes;

import java.util.Scanner;

class Person {

    // Person 클래스입니다.
    // 편의를 위해 캡슐화하지 않았습니다. (직접적으로 이름을 변경하는 메서드가 존재함.)
    // 만약 setter를 사용한다면, changeName 메서드에서 person.setName(name) 을 통해 수정할 수 있습니다.

    // 이름을 필드로 가집니다.
    String name;
    // 생성자 : 이름을 입력하여 생성합니다.
    Person(String name) { this.name = name; }
}

public class Q4 {
    public static void changeName(Person person, String name) {
        // 클래스는 기본적으로 참조형의 형태를 띱니다.
        person.name = name;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String oldName = sc.next();
        String newName = sc.next();

        // 객체 person의 이름(name 필드)을 oldName 으로 하여 생성합니다.
        Person p = new Person(oldName);

        // 메서드를 호출합니다. (생성한 객체와 newName을 파라미터로 함)
        changeName(p, newName);

        // 출력합니다.
        System.out.println(p.name);
    }
}