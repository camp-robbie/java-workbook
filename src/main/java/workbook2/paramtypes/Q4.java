package main.java.workbook2.paramtypes;

import java.util.Scanner;

class Person {
    String name;
    Person(String name) { this.name = name; }
}

public class Q4 {             // 객체 상태 변경
    // TODO: changeName 메서드 작성 (Person 객체와 새 이름을 받아 객체의 name 수정)

    /**
     * Person 참조(주소)의 '복사본'이 전달되지만,
     * 두 복사본이 '같은 객체'를 가리키므로 그 객체의 상태(name)를 바꾸면 밖에서도 보입니다.
     */

    public static void changeName(Person p, String newName) {
        if (p != null) {
            p.name = newName; // 같은 Person 인스턴스의 필드를 수정
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String oldName = sc.next(); // 입력: 홍길동
        String newName = sc.next(); // 입력: 김철수

        Person p = new Person(oldName);

        changeName(p, newName); // TODO: changeName 메서드 작성 후 주석 해제
        // TODO: p.name 출력

        // 출력: "김철수"
        System.out.println(p.name);

        sc.close();
    }
}