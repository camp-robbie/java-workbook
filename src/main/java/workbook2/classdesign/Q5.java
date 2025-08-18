package main.java.workbook2.classdesign;

import java.util.Scanner;

// Account 클래스를 설계하여 계좌번호(accountNo), 잔액(balance)를 필드로 갖고, 입금(deposit)과 출금(withdraw) 메서드를 작성하시오. 출금 시 잔액보다 큰 금액을 출금하려고 하면 “잔액 부족”을 출력한다.
class Account {
    String accountNo;
    int balance;

    // TODO: 생성자, deposit, withdraw 메서드 작성
    public Account(String accountNo, int balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public void deposit(int money) {
        balance += money;
    }

    public void withdraw(int money) {
        if (balance < money) {
            System.out.println("잔액 부족");
        } else {
            balance -= money;
        }
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String accNo = sc.next();
        int bal = sc.nextInt();

        Account acc = new Account(accNo, bal);

        String cmd1 = sc.next();
        int amt1 = sc.nextInt();

        if (cmd1.equals("deposit")) {
            acc.deposit(amt1);
        } else {
            acc.withdraw(amt1);
        }

        String cmd2 = sc.next();
        int amt2 = sc.nextInt();
        if (cmd2.equals("deposit")) {
            acc.deposit(amt2);
        } else {
            acc.withdraw(amt2);
        }
        System.out.println(acc.balance);
    }
}