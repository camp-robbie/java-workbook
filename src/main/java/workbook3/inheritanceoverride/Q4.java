package main.java.workbook3.inheritanceoverride;

import java.util.Scanner;

class Person {
    String name;
    Person(String name) {
        this.name = name;
    }                                   // 생성자에서 name 필드 초기화
    void introduce() {
        System.out.println("Hello, I'm " + name + ".");
    }       // 기본 소개 메서드
}

class Student extends Person {
    Student(String name) {
        super(name); // super() 맛보기
    }                   // 부모(Person) 생성자 호출 → name 필드 초기화
    @Override
    void introduce() {
        // TODO: 학생 소개 출력 (부모의 메서드를 오버라이딩)
        System.out.println("Hello, I'm " + name + ".");
    }
}

class Teacher extends Person {
    Teacher(String name) {
        super(name); // super() 맛보기
    }               // 부모(Person) 생성자 호출 → name 필드 초기화
    @Override
    void introduce() {
        // TODO: 교사 소개 출력 (부모의 메서드를 오버라이딩)
        System.out.println("Hello, I'm "+name+".");
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("교사 : 'teacher' 입력 | 학생 : 'student' 입력");
        String type1 = sc.next();
        System.out.println("이름을 입력하세요");
        String name1 = sc.next();
        System.out.println("교사 : 'teacher' 입력 | 학생 : 'student' 입력");
        String type2 = sc.next();
        System.out.println("이름을 입력하세요");
        String name2 = sc.next();
        // 삼항 연산자를 사용해 입력값에 따라 Student 또는 Teacher 객체 생성
        Person p1 = type1.equals("student") ? new Student(name1) : new Teacher(name1);
        Person p2 = type2.equals("student") ? new Student(name2) : new Teacher(name2);
        // 다형성: 참조 타입은 Person이지만 실제 객체 타입(Student/Teacher)의 introduce()가 실행됨
        p1.introduce();
        p2.introduce();
    }
}