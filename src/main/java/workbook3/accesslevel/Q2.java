package main.java.workbook3.accesslevel;

import java.util.Scanner;

class Student {
    //private변수 -> 다른 클래스에서 접근 불가 -> getter와 setter 메서드 필요
    private String name;
    //setter
    public void setName(String name) {
        // TODO: name 설정
        this.name=name;
    }
    //getter
    public String getName() {
        // TODO: name 반환
        return name;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("학생의 이름을 입력하세요");
        String n = sc.next();
        Student s = new Student();
        //입력한 학생이름(n)으로 student의 name 설정
        s.setName(n);
        //getter를 이용해 학생 이름 가져와 출력하기
        System.out.println(s.getName());

        sc.close();
    }
}