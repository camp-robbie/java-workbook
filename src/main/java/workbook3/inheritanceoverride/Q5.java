package main.java.workbook3.inheritanceoverride;

import java.util.Scanner;

abstract class Account {
    int balance;
    Account(int balance) {
        this.balance = balance;
    }

    /** 기본 입금: 수수료·이자 없음 */
    void deposit(int amount) {
        balance += amount;
    }

    /** 기본 인출: 수수료·이자 없음 */
    void withdraw(int amount) {
        balance -= amount;
    }
}

class SavingsAccount extends Account {
    SavingsAccount(int balance) {
        super(balance);
    }

    /** 입금 시 5 % 이자 포함 */
    @Override
    void deposit(int amount) {
        // TODO: 5 % 이자 포함 로직 작성
        balance += amount;
        balance =(int) (balance *1.05);
    }
}

class CheckingAccount extends Account {
    CheckingAccount(int balance) {
        super(balance);
    }

    /** 인출 시 1 % 수수료 차감 */
    @Override
    void withdraw(int amount) {
        // TODO: 1 % 수수료 차감 로직 작성
        balance -= amount;
        balance = (int) (balance*0.99);
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* ---------- 계좌 생성 ---------- */
        String kind = sc.next(); // "saving" or "checking"
        int initBal = sc.nextInt();

        // TODO: 아래 [알맞은 타입 선언]에 알맞은 타입을 선언 후 주석 해제

        Account acc = kind.equals("saving")
                ? new SavingsAccount(initBal)
                : new CheckingAccount(initBal);


        /* ---------- 명령 반복 ---------- */
        while (sc.hasNext()) {
            String cmd = sc.next(); // deposit / withdraw
            int amount = sc.nextInt();

            // TODO: 계좌 생성 주석 해제 후 아래 주석 해제
            if (cmd.equals("deposit")) {
                 acc.deposit(amount);
            } else { // withdraw
                 acc.withdraw(amount);
            }
            System.out.println(acc.balance);
        }
    }
}
