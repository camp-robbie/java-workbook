package main.java.workbook2.varcompare;

import java.util.Scanner;

// `Library` 클래스에 클래스 변수 `totalBooks`와 인스턴스 변수 `borrowed`를 선언하고, 책을 대출/반납할 때 각 변수 값이 적절히 수정되도록 하는 프로그램을 작성
// 여러 학생이 책을 대출한 후 반납하는 과정을 처리
class Library {
    static int totalBooks = 0;                      // 전체 대출된 책 수를 나타낼 클래스 변수 totalBooks (0으로 초기화)
    int borrowed = 0;                               // 각 객체가 대출한 책 수를 나타낼 인스턴스 변수 borrowed (0으로 초기화)

    void borrow(int n) {                            // 대출 메서드
        // TODO: borrowed와 totalBooks 증가
        borrowed += n;                              // borrowed = borrowed + n;
        totalBooks += n;                            // totalBooks = totalBooks + n;
    }
    void returnBooks(int n) {                       // 반납 메서드
        // TODO: borrowed와 totalBooks 감소
        if(borrowed < n) {                                                                          // 대출한 책보다 많은 책(n)을 반납하려고 한다면
            System.out.println("반납할 책보다 많습니다. 잘못 반납하는 책이 있는지 확인하시길 바랍니다.");     // 해당 내용을 출력함
            return;                                                                                 // 종료함
        }

        borrowed -= n;                              // borrowed = borrowed - n;
        totalBooks -= n;                            // totalBooks = totalBooks - n;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 스캐너 시작

        Library user = new Library();           // Library 객체 user 생성
        int commands = sc.nextInt();            // 실행할 명령어 개수를 입력받음

        for (int i = 0; i < commands; i++) {    // i는 0이고, i가 commands보다 작은 동안 i를 1씩 증가시키며 반복 수행
            String cmd = sc.next();             // 대여할지, 반납할지를 입력받음
            int n = sc.nextInt();               // 대여 또는 반납할 책 수를 입력받음
            if (cmd.equals("borrow")) user.borrow(n);       // cmd에 borrow가 입력되었다면, 매개변수로 n을 받는 user의 borrow 메서드를 실행함
            else user.returnBooks(n);                       // 그렇지 않으면 user의 returnBooks 메서드를 실행함
        }

        // TODO: user.borrowed와 Library.totalBooks 출력
        System.out.println(user.borrowed + " " + Library.totalBooks);   // user의 인스턴스 변수 borrowed과 Library의 클래스 변수 totalBooks를 출력함

        sc.close();                             // 스캐너 닫기
    }
}
