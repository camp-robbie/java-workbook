package main.java.workbook2.returntype;

import java.util.Scanner;

class Person {                         // Person 클래스
    String name;
    int age;
    Person(String name, int age) {     // 생성자 선언 + 필드 초기화
        this.name = name;              // 필드 초기화 -> 매개변수값을 인스턴스 필드에 대입
        this.age = age;
    }
}

public class Q5 {
    // TODO: olderPerson 메서드 작성 (두 Person 중 나이가 더 많은 객체를 반환)
    // olderPerson 정적 메서드 // 반환형 Person => return 값 필요
    public static Person olderPerson(Person p1, Person p2) {
        // 동갑일 때 예외 발생
        if (p1.age == p2.age) {
            throw new IllegalArgumentException("두 사람의 나이가 같습니다.");
        }
        // 조건 맞으면 p2 아니면 p1 반환
        return (p1.age < p2.age) ? p2 : p1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                 // Scanner 생성

        String name1 = sc.next();                            // 공백/개행으로 구분된 토큰 1개(문자열) 읽어 name1 에 저장
        int age1 = sc.nextInt();                             // 다음 토큰을 int로 읽어 age1에 저장
        String name2 = sc.next();                            // 다음 토큰을 문자열로 읽어 name2에 저장
        int age2 = sc.nextInt();                             // 다음 토큰을 int로 읽어 age2에 저장

        Person p1 = new Person(name1, age1);                 // 새 객체 생성 → 참조를 p1에 저장
        Person p2 = new Person(name2, age2);                 // 새 객체 생성 → 참조를 p2에 저장


        // TODO: olderPerson 메서드 작성 후 주석 해제
        Person older = olderPerson(p1, p2);                   // olderPerson(p1, p2) 메서드 호출하여 older(Person타입)에 저장

        // TODO: older.name과 older.age 출력
        System.out.println(older.name + " " + older.age);    // older의 name , age 출력(공백으로 구분)

        sc.close();                                           // 입력 닫기
    }
}

    /*   1. 인스턴스 필드 (멤버 변수)
             - 클래스 본문에 선언된 static이 아닌 변수
             - 객체마다 따로 존재

         2. 클래스 필드
             - static 으로 선언된 변수
             - 모든 객체가 공유

         3. 생성자 매개변수
             - 생성자 괄호 안에 적는 변수
             - 로컬 변수 (필드 x)
    */
    /*  Person p = new Person(name, age);

         =  name, age를 인자로 갖는 Person 새 객체 생성
              -> 변수 p에 생성된 객체의 참조값을 저장
              - name, age = 인자
              - String name, int age = 매개변수

         1. 자료형으로 Person을 사용하기 위해서 -> Person 클래스가 정의되어 있어야 함

         2. 클래스가 있어도 해당하는 생성자가 없다면 에러 발생
            ex) new Person(name, age)  사용하려면
                  ->  [ Person(name, age) 생성자 존재 해야함 ]

         3. 생성자가 있지만, 필드 대입(this.name = name)을 안했다면?
             - 객체 생성은 되지만, 인자로 전달한 값으로 필드 초기화 안됨
             - 즉 name에 jini 이렇게 보내도 초기값(null)에서 변하지 않음

         4. final 필드라면?
             - 모든 생성자에서 반드시 대입 필요!
    */
