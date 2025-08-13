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
        balance -= amount;          // balance = balance - amount
        totalBalance -= amount;     // totalBalance = totalBalance - amount
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
        // 두 번째 명령 처리 후 Bank.totalBalance 출력

    }
}
