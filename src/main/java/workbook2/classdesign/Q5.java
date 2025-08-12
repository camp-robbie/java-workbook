package main.java.workbook2.classdesign;

import java.util.Scanner;

class Account {

    // 필드
    private final String accountNo;
    private int balance;

    // 생성자
    public Account(String accountNo, int balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    // 입금 메서드
    // 메서드 호출 시, 입력한 값만큼 잔액에 더하고 잔액을 출력함.
    public void deposit(int amount) {
        this.balance += amount;
        System.out.println(this.balance);
    }

    // 출금 메서드
    // 메서드 호출 시, 입력한 값보다 잔액이 적으면 "잔액 부족" 출력
    // 잔액이 입력한 값과 같거나 크다면 입력한 값을 잔액에서 뺀 다음 잔액을 출력함.
    public void withdraw(int amount) {
        if (this.balance < amount) {
            System.out.println("잔액 부족");
        }else {
            this.balance -= amount;
            System.out.println(this.balance);
        }
    }
}

public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String accNo = sc.next();
        int bal = sc.nextInt();

        // 객체 생성
        Account acc = new Account(accNo, bal);

        // 커멘드와 조작할 만큼의 값 입력
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
    }
}