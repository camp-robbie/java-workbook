package main.java.workbook2.paramtypes;

import java.util.Scanner;

// Person 클래스 정의 //
class Person {
    String name;             // 필드 선언(name, 기본값 null)
    Person(String name) {    // 생성자 정의
        this.name = name;    // 필드 초기화
    }
}

public class Q4 {
    // TODO: changeName 메서드 작성 (Person 객체와 새 이름을 받아 객체의 name 수정)
    public static void changeName(Person p, String newName) {  // changeName 메서드 정의 (매개변수: Person p, String newName)
        p.name = newName;                                      // p.name에 newName 값을 대입
    }                                                          // p가 참조하는 같은 객체의 name 필드를 newName 으로 변경(참조변경x)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                   // Scanner 생성
        String oldName = sc.next();                            // 문자열 1개 읽어 oldName에 저장 (공백/개행 전 문자열 1개)
        String newName = sc.next();                            // 문자열 1개 읽어 newName에 저장 (공백/개행 전 문자열 1개)
        Person p = new Person(oldName);                        // oldName 객체 생성 (생성자가 name 초기화)
        // TODO: changeName 메서드 작성 후 주석 해제
        changeName(p, newName);                                // changeName 메서드 호출 -> p의 이름을 newName으로 이름 변경
        // TODO: p.name 출력
        System.out.println(p.name);                            // p.name (변경된 이름) 출력

        sc.close();                                            // 입력 닫기
    }
}