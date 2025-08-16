package main.java.workbook2.classdesign;

import java.util.Scanner;

class Book {
    String title;
    String author;
    int price;

    // TODO: 생성자 작성
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void printInfo(String title, String author, int price) {
        // TODO: 정보 출력
        System.out.println("title: " + title + ", author: " + author + ", price: " + price);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String t1 = sc.next(); // 제목
            String a1 = sc.next();

            String t2 = sc.next(); // 저자
            String a2 = sc.next();

            int p1 = sc.nextInt(); // 가격
            int p2 = sc.nextInt();

            Book b1 = new Book(t1, a1, p1); // TODO: 생성자 작성 후 주석 해제
            Book b2 = new Book(t2, a2, p2); // TODO: 생성자 작성 후 주석 해제

            b1.printInfo(t1, a1, p1); // TODO: 생성자 작성 후 주석 해제
            b2.printInfo(t2, a2, p2); // TODO: 생성자 작성 후 주석 해제
        } finally { // 항상 실행
            sc.close(); // 자원 누수 방지
        }
    }
}