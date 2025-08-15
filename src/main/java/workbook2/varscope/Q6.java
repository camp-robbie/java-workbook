package main.java.workbook2.varscope;

import java.util.Scanner;

class Bank {
    // 모든 계좌의 총합(모든 인스턴스가 공유)
    static int totalBalance = 0;

    // 개별 계좌 잔액(각 인스턴스마다 다름)
    int balance;

    Bank(int balance) {
        this.balance = balance;

        // 새로운 개별 계좌가 생기면 총합에 반영
        totalBalance += balance;
    }
    void deposit(int amount) {
        // TODO: balance와 totalBalance 증가
        // 입금: 내 계좌와 전체 총합 모두 증가
        balance += amount;
        Bank.totalBalance += amount;
    }
    void withdraw(int amount) {
        // TODO: balance와 totalBalance 감소
        // 출금: 내 계좌와 전체 총합 모두 감소
        balance -= amount;
        Bank.totalBalance -= amount;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 초기 두 계좌의 잔액 입력 (예: "1000 2000")
        int bal1 = sc.nextInt();
        int bal2 = sc.nextInt();

        Bank acc1 = new Bank(bal1);
        Bank acc2 = new Bank(bal2);

        // 첫 번째 명령 처리
        //  (예: "deposit 1 500")
        String op1 = sc.next();
        int id1 = sc.nextInt();
        int amt1 = sc.nextInt();

        /// 두 번째 명령 처리 후 Bank.totalBalance 출력
        String op2 = sc.next();
        int id2 = sc.nextInt();
        int amt2 = sc.nextInt();

        // --- 첫 번째 명령 처리 ---
        Bank bank1 = (id1 == 1) ? acc1 : acc2;
        if (op1.equals("deposit")) {
            bank1.deposit(amt1);
        } else {    // "withdraw"
            bank1.withdraw(amt1);
        }

        // --- 두 번째 명령 처리 ---
        Bank bank2 = (id2 == 1) ? acc1 : acc2;
        if (op2.equals("deposit")) {
            bank2.deposit(amt2);
        } else {    // "withdraw"
            bank2.withdraw(amt2);
        }

        /// 최종 전체 총합 출력
        System.out.println(Bank.totalBalance);

        sc.close();
    }
}
