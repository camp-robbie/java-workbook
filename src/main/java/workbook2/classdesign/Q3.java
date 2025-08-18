package main.java.workbook2.classdesign;

import java.util.Scanner;

class Book {          // Book 클래스
    // 멤버 필드(속성)
    String title;
    String author;
    int price;

    // TODO: 생성자 작성
    Book(String title, String author, int price) {    // Book 생성자 정의
        this.title = title;                           // 필드 초기화
        this.author = author;
        this.price = price;
    }

    // 객체 정보 출력 메서드 정의 //
    void printInfo() {
        // TODO: 정보 출력
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price );
    }
}

public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  // Scanner 생성

        String t1 = sc.next();                // 첫 번째 토큰 1개(문자열) 읽어 t1에 저장
        String a1 = sc.next();                // 두 번째 토큰 1개(문자열) 읽어 a1에 저장
        int p1 = sc.nextInt();                // 세 번째 토큰 1개(정수) 읽어 p1에 저장
        String t2 = sc.next();                // 네 번째 토큰 1개(문자열) 읽어 t2에 저장
        String a2 = sc.next();                // 다섯 번째 토큰 1개(문자열) 읽어 a2에 저장
        int p2 = sc.nextInt();                // 여섯 번째 토큰 1개(정수) 읽어 p2에 저장

        Book b1 = new Book(t1, a1, p1);       // 새로운 객체 Book(t1, a1, p1) 생성하여, 참조를 b1(타입:Book)에 저장
        Book b2 = new Book(t2, a2, p2);       // 새로운 객체 Book(t2, a2, p2) 생성하여, 참조를 b2(타입:Book)에 저장

        b1.printInfo();                       // printInfo() 메서드 호출하여 b1이 참조하는 Book 객체 정보 출력
        b2.printInfo();                       // printInfo() 메서드 호출하여 b2이 참조하는 Book 객체 정보 출력
    }
}