package main.java.workbook2.classdesign;

import java.util.Scanner;

class Book {
    String title;
    String author;
    int price;
    // TODO: 생성자 작성
    // 생성자 (매개변수: String title, String author, int price)
    public Book(String title, String author, int price) {
        this.title = title;         // 매개변수 title 값을 Book 필드 title에 대입함
        this.author = author;       // 매개변수 author 값을 Book 필드 author에 대입함
        this.price = price;         // 매개변수 price 값을 Book 필드 price에 대입함
    }
    void printInfo() {
        // TODO: 정보 출력
        // Title: JavaProgramming, Author: John, Price: 20000 형태로 출력함
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t1 = sc.next();
        String a1 = sc.next();
        int p1 = sc.nextInt();
        String t2 = sc.next();
        String a2 = sc.next();
        int p2 = sc.nextInt();
        Book b1 = new Book(t1, a1, p1); // TODO: 생성자 작성 후 주석 해제
         Book b2 = new Book(t2, a2, p2); // TODO: 생성자 작성 후 주석 해제
         b1.printInfo(); // TODO: 생성자 작성 후 주석 해제
         b2.printInfo(); // TODO: 생성자 작성 후 주석 해제
    }
}