package main.java.workbook3.accesslevel;

import java.util.Scanner;

class Account {
    //private 변수 -> 같은 클래스 내에서만 접근 가능
    private int balance;
    Account(int balance) {
        this.balance = balance;
    }
    //public 메서드 -> 모든 곳에서 접근 가능
    public void deposit(int amount) {
        // TODO: balance 증가
        balance += amount;
    }
    public void withdraw(int amount) {
        // TODO: balance 감소
        balance -= amount;
    }
    public int getBalance() {
        return balance;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("계좌 현재 잔액 입력");
        int bal = sc.nextInt();
        System.out.println("입금: 'deposit' 입력 | 출금: 'withdraw' 입력");
        String cmd1 = sc.next();
        System.out.println("입금 혹은 출금할 금액 입력");
        int amt1 = sc.nextInt();
        System.out.println("입금: 'deposit' 입력 | 출금: 'withdraw' 입력");
        String cmd2 = sc.next();
        System.out.println("입금 혹은 출금할 금액 입력");
        int amt2 = sc.nextInt();
        Account acc = new Account(bal);
        if (cmd1.equals("deposit")) {
            acc.deposit(amt1);                  //deposit()메서드 -> public 메서드 -> 모든 곳에서 접근 가능
        } else {
            acc.withdraw(amt1);                 //withdraw()메서드 -> public 메서드 -> 모든 곳에서 접근 가능
        }
        if (cmd2.equals("deposit")) {
            acc.deposit(amt2);
        } else {
            acc.withdraw(amt2);
        }
        System.out.println(acc.getBalance());       //getBalance()는 public 메서드이므로 모든 곳에서 접근이 가능하다.

        sc.close();
    }
}