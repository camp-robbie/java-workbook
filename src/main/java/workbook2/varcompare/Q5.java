package main.java.workbook2.varcompare;

import java.util.Scanner;

class Library {
    static int totalBooks = 0;   //전체 대출된 책 권수
    int borrowed = 0;            //각 객체가 대출한 권수
    void borrow(int n) {
        // TODO: borrowed와 totalBooks 증가
        totalBooks += n;
        borrowed += n;
    }
    void returnBooks(int n) {
        // TODO: borrowed와 totalBooks 감소
        totalBooks -= n;
        borrowed -= n;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library user = new Library();
        int commands = sc.nextInt();
        for (int i = 0; i < commands; i++) {
            System.out.println("대출 : 'borrow' 입력");
            String cmd = sc.next();
            System.out.println("대출,반납할 책의 권수를 입력하세요.");
            int n = sc.nextInt();
            if (cmd.equals("borrow")){user.borrow(n);}
            else {user.returnBooks(n);}
        }
        System.out.println(user.borrowed + " " + Library.totalBooks);

        //객체 2를 만들어 인스턴스변수와 스태틱변수 차이 알아보기
        Library user2 = new Library();
        int commands2 = sc.nextInt();
        for (int i = 0; i < commands2; i++) {
            System.out.println("대출 : 'borrow' 입력");
            String cmd = sc.next();
            System.out.println("대출,반납할 책의 권수를 입력하세요.");
            int n = sc.nextInt();
            if (cmd.equals("borrow")){user2.borrow(n);}
            else {user2.returnBooks(n);}
        }
        // TODO: user.borrowed와 Library.totalBooks 출력

        System.out.println(user2.borrowed + " " + Library.totalBooks);
    }
}
