package main.java.workbook2.varscope;

import java.util.Scanner;

class Bank {
    static int totalBalance = 0;
    int balance;

    Bank(int balance) {
        this.balance = balance;
        totalBalance += balance;
    }

    void deposit(int amount) {
        // TODO: balance와 totalBalance 증가
        balance += amount;          // balance = balance + amount
        totalBalance += amount;     // totalBalance = totalBalance + amount
    }

    void withdraw(int amount) {
        // TODO: balance와 totalBalance 감소
        if (balance < amount) {
            System.out.println("잔액 부족");
        } else {
            balance -= amount;          // balance = balance - amount
            totalBalance -= amount;     // totalBalance = totalBalance - amount
        }
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bal1 = sc.nextInt();        // 금액1
        int bal2 = sc.nextInt();        // 금액2
        Bank acc1 = new Bank(bal1);     // 금액1을 가지고 있는 Bank 객체 acc1
        Bank acc2 = new Bank(bal2);     // 금액2를 가지고 있는 Bank 객체 acc2
        String op1 = sc.next();         // 입금과 출금 중 어떤 것을 수행할 것인지 입력받음
        int id1 = sc.nextInt();         // 어느 계좌에서 꺼내올 건지 선택함
        int amt1 = sc.nextInt();        // 입금하거나 출금할 금액

        // 첫 번째 명령 처리
        if ("deposit".equals(op1)) {    // 만약 op1에 deposit(입금)가 입력된다면
            if (id1 == 1) {             // 만약 id1이 1이라면
                acc1.deposit(amt1);     // acc1에 deposit 메서드를 실행함
            }

            if (id1 == 2) {             // 만약 id1이 2이라면
                acc2.deposit(amt1);     // acc2에 deposit 메서드를 실행함
            }
        }

        // 두 번째 명령 처리 후 Bank.totalBalance 출력
        String op2 = sc.next();         // 입금과 출금 중 어떤 것을 수행할 것인지 입력받음
        int id2 = sc.nextInt();         // 어느 계좌에서 꺼내올 건지 선택함
        int amt2 = sc.nextInt();        // 입금하거나 출금할 금액

        if ("withdraw".equals(op2)) {   // 만약 op2에 withdraw(출금)가 입력된다면
            if (id2 == 1) {             // 만약 id2이 1이라면
                acc1.withdraw(amt2);    // acc2에 deposit 메서드를 실행함
            }

            if (id2 == 2) {             // 만약 id2이 2이라면
                acc2.withdraw(amt2);    // acc2에 withdraw 메서드를 실행함
            }
        }
        System.out.println(Bank.totalBalance);      // 전체 계좌 금액 출력
        sc.close();                                 // 스캐너 닫기
    }
}
