package main.java.workbook3.accesslevel;

import java.util.Scanner;

class LibraryBook {
    String title;
    String author;

    LibraryBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // TODO: title getter
    // TODO: author getter
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryBook[] books = new LibraryBook[3];
        for (int i = 0; i < 3; i++) {
            String t = sc.next();
            String a = sc.next();
            books[i] = new LibraryBook(t, a);
        }
        // TODO: 등록한 모든 도서들의 title, author를 출력
    }
}
