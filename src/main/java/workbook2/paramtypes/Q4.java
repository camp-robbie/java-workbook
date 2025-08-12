package main.java.workbook2.paramtypes;

import java.util.Scanner;

class Person {
    String name;
    Person(String name) { this.name = name; }
}

public class Q4 {
    // TODO: changeName 메서드 작성 (Person 객체와 새 이름을 받아 객체의 name 수정)
    public static void changeName(Person person, String newName) {
        person.name = newName;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String oldName = sc.next();
        String newName = sc.next();
        Person p = new Person(oldName);
        changeName(p, newName); // TODO: changeName 메서드 작성 후 주석 해제
        // TODO: p.name 출력
        System.out.println(p.name);
    }
}