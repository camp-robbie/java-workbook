package main.java.workbook2.varcompare;

import java.util.Scanner;

class Library {                                // 클래스 정의
    static int totalBooks = 0;                 // 모든 인스턴스가 공유하는 클래스 변수 -> 1회만 0으로 설정(초기화)
    int borrowed = 0;                          // 인스턴스 변수 선언 및 초기화

    void borrow(int n) {                       // borrow 메서드 정의 -> 대출
        // TODO: borrowed와 totalBooks 증가
        borrowed += n;                         // 각 객체가 대출한 책 수 (현재 대출한 책 수 합)
        totalBooks += n;                       // 전체 대출된 책 수 (현재 대출한 책 수 합)
    }
    void returnBooks(int n) {                  // returnBooks 메서드 정의 -> 반납
        // TODO: borrowed와 totalBooks 감소
        borrowed -= n;                         // 각 객체가 반납한 책 수 (현재 반납한 책 수 합)
        totalBooks -= n;                       // 전체 반납된 책 수 (현재 반납한 책 수 합)
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);         // Scanner 생성

        Library user = new Library();                // 새로운 객체 Library() 생성하여, 참조를 user에 저장
        int commands = sc.nextInt();                 // 정수 1개 읽어 commands 에 저장

        for (int i = 0; i < commands; i++) {         // i=0부터 commands 미만까지 반복문 수행
            String cmd = sc.next();                  // 공백으로 구분된 문자열 1개 읽어 cmd 에 저장
            int n = sc.nextInt();                    // 다음 정수 1개 읽어 n 에 저장
            if (cmd.equals("borrow")) {              // 만약 cmd 값이 "borrow"라면
                user.borrow(n);                      // user가 참조하는 borrow(n) 메서드 호출
            } else if (cmd.equals("return")) {       // 만약 cmd 값이 "return"라면
                user.returnBooks(n);                 // user가 참조하는 returnBooks(n) 메서드 호출
            }
        }
        // TODO: user.borrowed와 Library.totalBooks 출력
        // user가 참조하는 borrowed 값과 Library 클래스의 totalBooks 값 출력 (공백으로 구분)
        System.out.println(user.borrowed + " " + Library.totalBooks);

        sc.close();                                   // 입력 닫기
    }
}
