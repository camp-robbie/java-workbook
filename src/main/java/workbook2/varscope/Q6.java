package main.java.workbook2.varscope;

import java.util.Scanner;

class Bank {
    static int totalBalance = 0;                   // 모든 인스턴스에서 공유되는 클래스 변수 선언 -> 한번만 0으로 초기화
    int balance;                                   // 인스턴스 변수 선언 -> 각 계좌의 잔액

    Bank(int balance) {                            // 생성자 정의
        this.balance = balance;                    // 필드 초기화 -> 초기 잔액 저장
        totalBalance += balance;                   // static 변수 totalBalance에 잔액 합산 -> 초기 잔액을 총잔액에 합산
    }
    void deposit(int amount) {                     // deposit 메서드 -> 입금
        // TODO: balance와 totalBalance 증가
        balance += amount;                         // 잔액에 입금액 합산 (계좌 잔액 증가)
        totalBalance += amount;                    // 총잔액에 입금액 합산(총 잔액도 똑같이 갱신)
    }
    void withdraw(int amount) {                    // withdraw 메서드 -> 출금
        // TODO: balance와 totalBalance 감소
        balance -= amount;                         // 잔액에서 출금액 차감 (계좌 잔액 감소)
        totalBalance -= amount;                    // 총잔액에서 출금액 차감 (총 잔액도 똑같이 갱신)
    }
}

public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);        // Scanner 생성

        int bal1 = sc.nextInt();                    // 첫 번째 금액(정수) 읽어 bal1에 저장 -> 1번 계좌 초기 잔액
        int bal2 = sc.nextInt();                    // 두 번째 금액(정수) 읽어 bal2에 저장 -> 2번 계좌 초기 잔액
        Bank acc1 = new Bank(bal1);                 // 새로운 객체 Bank(bal1) 생성하여, 참조를 acc1에 저장
        Bank acc2 = new Bank(bal2);                 // 새로운 객체 Bank(bal2) 생성하여, 참조를 acc2에 저장

        String op1 = sc.next();                     // 공백으로 구분된 문자열 1개 읽어 op1에 저장  => 입/출금 구분
        int id1 = sc.nextInt();                     // 다음 정수 1개 읽어 id1에 저장  => 계좌 구분 (계좌번호)
        int amt1 = sc.nextInt();                    // 다음 정수 1개 읽어 atm1에 저장  => 입금액 또는 출금액 (금액)

        // 첫 번째 명령 처리
        if (op1.equals("deposit")) {                        // op1이 "deposit" 이라면
            (id1 == 1 ? acc1 : acc2).deposit(amt1);         // 그리고 id1 == 1 이면 acc1이 참조하는 deposit(amt1) 메서드 호출
        } else if (op1.equals("withdraw")) {                // op1이 "withdraw" 이라면
            (id1 == 1 ? acc1 : acc2).withdraw(amt1);        // 그리고 id1 == 1 이면 acc1이 참조하는 withdraw(amt1) 메서드 호출
        }
        // 두 번째 명령 처리 후 Bank.totalBalance 출력
        String op2 = sc.next();                     // 공백/개행 전 문자열 1개 읽어 op2에 저장  => 입/출금 구분
        int id2 = sc.nextInt();                     // 다음 정수 1개 읽어 id2에 저장  => 계좌 구분 (계좌번호)
        int amt2 = sc.nextInt();                    // 다음 정수 1개 읽어 atm2에 저장  => 입금액 또는 출금액 (금액)

        if (op2.equals("deposit")) {                        // op2이 "deposit" 이라면
            (id2 == 2 ? acc1 : acc2).deposit(amt2);         // 그리고 id1 == 2 이면 acc2이 참조하는 deposit(amt2) 메서드 호출
        } else if (op2.equals("withdraw")) {                // op2이 "withdraw" 이라면
            (id2 == 2 ? acc1 : acc2).withdraw(amt2);        // 그리고 id1 == 2 이면 acc1이 참조하는 withdraw(amt2) 메서드 호출
        }

        System.out.println(Bank.totalBalance);       // 최종 총 잔액 출력

        sc.close();                                  // 입력 닫기
    }
}
