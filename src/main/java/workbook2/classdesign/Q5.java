package main.java.workbook2.classdesign;

import java.util.Scanner;

class Account {
    String accountNo;
    int balance;

    // TODO: 생성자, deposit, withdraw 메서드 작성
    // 생성자 정의//
    Account(String accountNo, int balance) {   // Account 생성자 정의
        this.accountNo = accountNo;            // 필드 초기화
        this.balance = balance;
    }

    // deposit 메서드 정의 -> 입금//
    void deposit(int amount) {                 // 입금 메서드 정의
        balance += amount;                     // 잔액에 입금액을 더함
        System.out.println(balance);           // 입금 후 잔액 출력
    }

    // withdraw 메서드 정의 -> 출금 //
    void withdraw(int amount) {                // 출력 메서드 정의
        if (balance >= amount) {               // 만약 balance가 amount 보다 크거나 같으면
            balance -= amount;                 // 잔액에서 출금액을 뺌
            System.out.println(balance);       // 출금 후 잔액 출력
        } else {                               // 만약 balance가 amount 보다 작다면
            System.out.println("잔액 부족");     // "잔액 부족" 출력
        }
    }
}

public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);      // Scanner 생성

        String accNo = sc.next();                 // 공백 전 문자열 1개 읽어 accNo에 저장
        int bal = sc.nextInt();                   // 다음 정수 1개 읽어 bal에 저장
        Account acc = new Account(accNo, bal);    // 새로운 객체(Account(accNo, bal)) 생성하여 참조를 acc(타입 Account)에 저장

        String cmd1 = sc.next();                  // 다음 문자열 1개 읽어 cmd1에 저장
        int amt1 = sc.nextInt();                  // 다음 정수 1개 읽어 atm1에 저장

        if (cmd1.equals("deposit")) {             // 만약 cmd1이 "deposit"이면
            acc.deposit(amt1);                    // acc가 참조하는 deposit(atm1) 호출하여 입금 후 잔액 출력
        } else {                                  // 아니면 (cmd1값이 "withdraw" 이면)
            acc.withdraw(amt1);                   // acc가 참조하는 withdraw(arm1) 호출하여 출금 후 잔액 출력
        }

        String cmd2 = sc.next();                  // 다음 문자열 1개 읽어 cmd2에 저장
        int amt2 = sc.nextInt();                  // 다음 정수 1개 읽어 atm2에 저장

        if (cmd2.equals("deposit")) {             // 만약 cmd2값이 "deposit"과 같으면
            acc.deposit(amt2);                    // acc가 참조하는 deposit(atm2) 호출하여 입금 후 잔액 출력
        } else {                                  // 아니면 (cmd2값이 "withdraw" 이면)
            acc.withdraw(amt2);                   // acc가 참조하는 withdraw(arm2) 호출하여 출금 후 잔액 출력
        }
    }
}
