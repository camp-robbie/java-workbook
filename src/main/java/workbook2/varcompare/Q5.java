package main.java.workbook2.varcompare;

import java.util.Scanner;

class Library {

    // 필드
    // 해당 도서관에서 대출중인 책의 갯수
    static int totalBooks = 0;
    // 이 객체를 통해 대출중인 책의 갯수
    int borrowed = 0;

    // 메서드
    // 대출하는 메서드입니다.
    void borrow(int n) {
        this.borrowed += n;
        Library.totalBooks += n;
    }
    // 반납하는 메서드입니다.
    void returnBooks(int n) {
        this.borrowed -= n;
        Library.totalBooks -= n;
    }
}

public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 객체 생성
        Library user = new Library();

        // 반복 횟수를 입력받습니다.
        int commands = sc.nextInt();

        // 실행 구문입니다.
        // 입력 받은 횟수만큼 반복하며,
        // 반납/대출할 책의 갯수(n)와 커멘드를 입력받습니다.
        // 커멘드로 borrow가 입력되었을 때는 대출 메서드를,
        // 아닌 값이 입력되었을 때는 반납 메서드를 실행합니다.
        for (int i = 0; i < commands; i++) {
            String cmd = sc.next();
            int n = sc.nextInt();
            if (cmd.equals("borrow")) user.borrow(n);
            else user.returnBooks(n);
        }

        // 출력합니다.
        System.out.println(user.borrowed + " " + Library.totalBooks);
    }
}
