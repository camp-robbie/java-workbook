package main.java.workbook2.returntype;

import java.util.Scanner;

class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Q5 {
    // TODO: olderPerson 메서드 작성 (두 Person 중 나이가 더 많은 객체를 반환)
    public static Person olderPerson(Person p1, Person p2) {
        if(p1.age >= p2.age) {  // p1의 age가 p2의 age보다 크거나 같으면
            return p1;          // p1을 반환함
        } else {                // 그렇지 않으면 (p2의 age가 더 크다면)
            return p2;          // p2을 반환함
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.next();
        int age1 = sc.nextInt();
        String name2 = sc.next();
        int age2 = sc.nextInt();
        Person p1 = new Person(name1, age1);
        Person p2 = new Person(name2, age2);
        Person older = olderPerson(p1, p2); // TODO: olderPerson 메서드 작성 후 주석 해제
        // TODO: older.name과 older.age 출력
        System.out.println(older.name + " " + older.age);   // 결과를 출력
    }
}