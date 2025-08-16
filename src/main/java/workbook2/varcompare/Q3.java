package main.java.workbook2.varcompare;

import java.util.Scanner;

// `Student` 클래스에 클래스 변수 `studentCount`와 인스턴스 변수 `name`을 선언하고, 학생 생성 시 번호를 부여하여 이름과 번호를 출력하는 프로그램을 작성
class Student {
    static int studentCount = 0;       // 학생 번호를 부여하는 클래스 변수 studentCount
    int id;                            // 생성된 객체의 학생 번호를 나타낼 인스턴스 변수 id
    String name;                       // 생성된 객체의 이름을 나타낼 인스턴스 변수 name

    // 생성자
    Student(String name) {
        this.name = name;                           // 생성자 매개변수 name을 인스턴스 변수 name에 저장함
        // TODO: studentCount 증가 후 id에 할당
        id = ++studentCount;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                                   // 반복할 횟수(생성할 학생 수)를 입력받음
        for (int i = 0; i < n; i++) {                           // i는 0이고, i가 n보다 작을 동안 1씩 증가시키며 반복 수행
            String name = sc.next();                            // name을 입력받음
            Student stu = new Student(name);                    // 입력받은 name을 바탕으로 Student 객체 stu를 생성함
            System.out.println(stu.name + " " + stu.id);        // stu 객체의 인스턴스 변수 name과 인스턴스 변수 id를 출력함
        }
    }
}