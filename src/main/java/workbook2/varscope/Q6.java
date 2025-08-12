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
        balance += amount;
        totalBalance += amount;
    }
    void withdraw(int amount) {
        // TODO: balance와 totalBalance 감소
        if (balance >= amount) {
            balance -= amount;
            totalBalance -= amount;
        } else {
            System.out.println("잔액 부족");
        }
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bal1 = sc.nextInt();
        int bal2 = sc.nextInt();
        Bank acc1 = new Bank(bal1);
        Bank acc2 = new Bank(bal2);
        String op1 = sc.next();
        int id1 = sc.nextInt();
        int amt1 = sc.nextInt();
        // 첫 번째 명령 처리
        Bank targetAcc1 = null;
        if (id1 == 1) {
            targetAcc1 = acc1;
        } else if (id1 == 2) {
            targetAcc1 = acc2;
        }
        if (targetAcc1 != null) {
            if (op1.equals("deposit")) {
                targetAcc1.deposit(amt1);
            } else {
                targetAcc1.withdraw(amt1);
            }
        }
        //두 번째 연산 입력
        String op2 = sc.next();
        int id2 = sc.nextInt();
        int amt2 = sc.nextInt();
        //두 번째 명령 처리
        Bank targetAcc2 = null;
        if (id2 == 1) {
            targetAcc2 = acc1;
        }  else if (id2 == 2) {
            targetAcc2 = acc2;
        }
        if (targetAcc2 != null) {
            if (op2.equals("deposit")) {
                targetAcc2.deposit(amt2);
            }  else {
                targetAcc2.withdraw(amt2);
            }
        }
        // 두 번째 명령 처리 후 Bank.totalBalance 출력
        System.out.println(Bank.totalBalance);
        sc.close();
    }
}
