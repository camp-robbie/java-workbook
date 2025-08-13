package main.java.workbook2.paramtypes;

import java.util.Scanner;

class Person {
    String name; // String 타입의 name 이라는 필드를 가지고 있다.

    Person(String name) { // 생성자
        this.name = name;
    }
}

public class Q4 {
    /*
    static을 활용하여 changeName 메모리에 올리고
    Person 클래스와 name을 받아 person 클래스의 객체의 name을 String으로 받은 name으로 변환한다.
     */
    // TODO: changeName 메서드 작성 (Person 객체와 새 이름을 받아 객체의 name 수정)
    public static void changeName(Person person, String name) {
        person.name = name;
    }

    /*
    Scanner로 두 개의 이름을 입력받는다.
    첫번째 입력된 이름은 생성된 Person 클래스의 객체에 입력해주고
    생선된 Person 클래스의 객체와 두번째 입력된 이름은 호출한 changeName 메서드에 입력해준다.
    그 후 Person 클래스의 name을 출력 후 확인
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String oldName = sc.next();
            String newName = sc.next();
            Person p = new Person(oldName);
            changeName(p, newName); // TODO: changeName 메서드 작성 후 주석 해제
            // TODO: p.name 출력
            System.out.println(p.name);
        } finally { // 항상 실행
            sc.close(); // 자원 누수 방지
        }
    }
}