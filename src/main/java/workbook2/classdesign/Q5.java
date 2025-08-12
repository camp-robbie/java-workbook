package main.java.workbook2.classdesign;

import java.util.Scanner;

class Account {
    String accountNo;   // 계좌번호
    int balance;        // 잔액
    // TODO: 생성자, deposit, withdraw 메서드 작성
    // 생성자 (매개변수: String accountNo, int balance)
    public Account(String accountNo, int balance) {
        this.accountNo = accountNo;     // 매개변수 accountNo 값을 Account 필드 accountNo에 저장함
        this.balance = balance;         // 매개변수 balance 값을 Account 필드 balance에 저장함
    }
    // 입금(deposit) 메서드 (매개변수: int atm)
    void deposit(int atm) {
        balance += atm;     // balance = balance + atm;
    }

    // 출금(withdraw) 메서드
    void withdraw(int atm) {
        if(balance < atm) {                 // 출금 금액이 계좌 잔고보다 크면
            System.out.println(balance);    // 계좌잔고 출력
            System.out.println("잔액 부족"); // 잔액 부족 안내 멘트 출력
        } else {
            balance -= atm;     // balance = balance - atm;
        }
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String accNo = sc.next();
        int bal = sc.nextInt();
         Account acc = new Account(accNo, bal); // TODO: 생성자 작성 후 주석 해제
        String cmd1 = sc.next();
        int amt1 = sc.nextInt();
        if (cmd1.equals("deposit")) {
             acc.deposit(amt1); // TODO: deposit 메서드 작성 후 주석 해제
        } else {
             acc.withdraw(amt1); // TODO: withdraw 메서드 작성 후 주석 해제
        }
        String cmd2 = sc.next();
        int amt2 = sc.nextInt();
        if (cmd2.equals("deposit")) {
             acc.deposit(amt2); // TODO: deposit 메서드 작성 후 주석 해제
        } else {
             acc.withdraw(amt2); // TODO: withdraw 메서드 작성 후 주석 해제
        }
    }
}