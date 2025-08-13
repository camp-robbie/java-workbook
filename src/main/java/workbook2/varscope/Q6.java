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
        balance += amount;
        totalBalance += amount;
    }
    void withdraw(int amount) {
        balance -= amount;
        totalBalance -= amount;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //계좌1,2 금액입력
        System.out.println("계좌1에 들어있는 금액을 입력하세요");
        int bal1 = sc.nextInt();
        System.out.println("계좌2에 들어있는 금액을 입력하세요");
        int bal2 = sc.nextInt();

        //계좌 acc1, acc2 생성
        Bank acc1 = new Bank(bal1);
        Bank acc2 = new Bank(bal2);

        for(int i = 1; i<=2; i++){
            System.out.println("입금 : 'deposit'입력 \n출금 : 'withdraw'입력");
            String op1 = sc.next();

            System.out.println("계좌 1번 선택 - '1'입력 \n게좌 2번 선택 = '2'입력");
            int id1 = sc.nextInt();

            System.out.println("원하는 입출금액을 입력하세요");
            int amt1 = sc.nextInt();

            // 명령 두 번 처리
            if ("deposit".equals(op1)) {
                if (id1 == 1) {
                    acc1.deposit(amt1);
                }
                if (id1 == 2) {
                    acc2.deposit(amt1);
                }
            }
            if ("withdraw".equals(op1)) {
                if (id1 == 1) {
                    acc1.withdraw(amt1);
                }
                if (id1 == 2) {
                    acc2.withdraw(amt1);
                }
            }
        }
        // Bank.totalBalance 출력
        System.out.println(Bank.totalBalance);
    }
}
