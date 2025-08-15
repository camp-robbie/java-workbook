package main.java.workbook3.constructor;

import java.util.Scanner;

class Student {
    String name;
    Student() {
        // TODO: name 초기화
        this.name = "Unknown";
    }
    Student(String name) {
        // TODO: name 초기화
        this.name = name;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("학생의 이름을 입력하세요");
        String name = sc.next();
        Student s1 = new Student();         //기본생성자로 객체 생성
        Student s2 = new Student(name);     //생성자로 객체 생성
        // TODO: s1.name과 s2.name 출력
        System.out.println(s1.name +" "+s2.name);
    }
}
