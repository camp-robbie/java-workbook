package main.java.workbook3.accesslevel;

import java.util.Scanner;

class LibraryBook {
    //private 변수
    private String title;
    private String author;

    //생성자
    LibraryBook(String title, String author) {
        this.title = title;
        this.author = author;
    }
    //제목 getter 메서드
    public String getTitle() {
        return title;
    }
    //작가 getter 메서드
    public String getAuthor() {
        return author;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryBook[] books = new LibraryBook[3];
        for (int i = 0; i < 3; i++) {
            String t = sc.next();               //책 제목 입력
            String a = sc.next();               //저자 입력
            books[i] = new LibraryBook(t, a);
        }
        for (LibraryBook b : books) {
            System.out.println(b.getTitle() + " " + b.getAuthor());
        }

        sc.close();
    }
}
