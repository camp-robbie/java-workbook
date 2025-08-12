package main.java.workbook2.classdesign;

import java.util.Scanner;

class Book {

    //필드
    private final String title;
    private final String author;
    private final int price;

    //생성자
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // 책 정보 출력 메서드
    void printInfo() {
        System.out.println("Title: " + this.title+",  Author: " + this.author+",  Price: " + this.price);
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

        // 객체를 생성합니다.
        Book b1 = new Book(t1, a1, p1);
        Book b2 = new Book(t2, a2, p2);

        // 메서드를 통해 출력합니다.
        b1.printInfo();
        b2.printInfo();
    }
}