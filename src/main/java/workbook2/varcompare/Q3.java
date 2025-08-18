package main.java.workbook2.varcompare;

import java.util.Scanner;

class Student {
    static int studentCount = 0;                // 모든 인스턴스가 공유하는 클래스 변수 -> 한번만 0으로 설정(초기화)
    int id;                                     // 인스턴스 변수 선언
    String name;                                // 인스턴스 변수 선언

    Student(String name) {                      // 생성자 정의
        this.name = name;                       // 필드 초기화
        // TODO: studentCount 증가 후 id에 할당
        studentCount++;                         // studentCount +1 증가
        id = studentCount;                      // studentCount를 id에 할당
        // id = ++studentCount;  도 가능

    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                // Scanner 생성

        int n = sc.nextInt();                               // 공백 전 숫자 1개 읽어 n에 저장

        for (int i = 0; i < n; i++) {                       // i=0부터 n 미만까지 1씩 증가하며 반복문 수행
            String name = sc.next();                        // 다음 문자열 1개 읽어 name에 저장
            Student stu = new Student(name);                // 새로운 객체 Student(name) 생성하여 참조를 stu에 저장
            System.out.println(stu.name + " " + stu.id);    // stu가 참조하는 이름과 id를 공백으로 구분하여 출력
        }

        sc.close();                                         // 입력 닫기
    }
}