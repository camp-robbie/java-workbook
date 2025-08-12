package main.java.workbook2.returntype;

import java.util.Scanner;

class Person {
    // String name, int age 를 필드로 가지는 클래스 Person 입니다.
    // 편의를 위해 캡슐화는 진행하지 않았습니다.
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Q5 {
    // 비교 로직을 구현한 메소드입니다.
    public static Person olderPerson(Person p1, Person p2) {
        // 두 개의 클래스의 age를 직접 참조하여 비교합니다. (캡슐화가 안 되었기 때문)
        // 캡슐화를 진행했을 경우, p1.getAge() > p2.getAge() 와 같은 식으로 조건을 작성합니다.
        if (p1.age > p2.age) {
            return p1;
        }else  {
            return p2;
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

        // 메소드를 호출합니다.
        Person older = olderPerson(p1, p2);

        // 출력합니다. (직접 참조함)
        System.out.println(older.name+" "+older.age);
    }
}