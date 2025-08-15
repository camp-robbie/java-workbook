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

public class Q5 {       // Person (참조형) 중 더 나이 많은 객체 반환
    // TODO: olderPerson 메서드 작성 (두 Person 중 나이가 더 많은 객체를 반환)

    /**
     * olderPerson: 두 사람 중 '나이가 더 많은' 사람 객체의 참조를 반환한다.
     * - 반환되는 것은 객체 그 자체가 아니라 '객체의 주소(참조)'
     * - 즉, 반환받은 참조로 필드를 수정하면 원래 객체(p1 또는 p2)가 함께 바뀐다.
     * - 동점(age가 같음)일 때는 p1을 반환하도록 정했다(명확한 규칙).
     */

    public static Person olderPerson(Person p1, Person p2) {
        if (p1.age >= p2.age) { // 동점 포함
            return p1;
        } else {
            return p2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 예: Alice 30 Bob 25
        String name1 = sc.next();
        int age1 = sc.nextInt();
        String name2 = sc.next();
        int age2 = sc.nextInt();

        Person p1 = new Person(name1, age1);
        Person p2 = new Person(name2, age2);

        Person older = olderPerson(p1, p2); // TODO: olderPerson 메서드 작성 후 주석 해제
        // TODO: older.name과 older.age 출력

        System.out.println(older.name + " " + older.age); // Alice 30

        sc.close();
    }
}