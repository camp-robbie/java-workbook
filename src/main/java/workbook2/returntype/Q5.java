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
    /*
    static 으로 생성한 Preson 타입의 olderPerson 메서드를 메모리에 올리고 2개의 Person 값을 입력 받아 값을 비교
    만약 같은 값으로 존재 한다면 IllegalArgumentException()을 생성하여 예외 생성,
    try-catch로 예외를 잡아 예외 처리
     */
    // TODO: olderPerson 메서드 작성 (두 Person 중 나이가 더 많은 객체를 반환)
    public static Person olderPerson(Person p1, Person p2) {
        if (p1.age > p2.age) {
            return p1;
        } else if (p1.age == p2.age) {
            throw new IllegalArgumentException();
        } else {
            return p2;
        }
    }
    /*
    Scanner를 활용하여 이름과 나이를 입력 받아 각 변수에 저장한다.
    Person 클래스의 객체생성을 통해 Person 타입의 p1, p2 생성
    olderPerson에 p1,p2 를 전달하여 메서드로 나이의 값을 비교 후
    그 결과 값을 Person 타입의 older로 전달하여 그 값을 출력한다.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String name1 = sc.next();
            int age1 = sc.nextInt();

            String name2 = sc.next();
            int age2 = sc.nextInt();

            Person p1 = new Person(name1, age1);
            Person p2 = new Person(name2, age2);

            Person older = olderPerson(p1, p2); // TODO: olderPerson 메서드 작성 후 주석 해제

            // TODO: older.name과 older.age 출력
            System.out.println(older.name + " " + older.age);
        } catch (IllegalArgumentException e) { // 두사람이 같은 나이일 시
            System.out.println("두 사람의 나이는 같습니다."); // 예외 처리
        } finally { // 항상 실행
            sc.close(); // 자원 누수 방지
        }
    }
}