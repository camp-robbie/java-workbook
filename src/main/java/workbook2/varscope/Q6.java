package main.java.workbook2.varscope;

import java.util.InputMismatchException;
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
        if (balance < amount) {
            System.out.println("잔액 부족.");
            return;
        }
        balance -= amount;
        totalBalance -= amount;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int bal1 = sc.nextInt();
            int bal2 = sc.nextInt();
            Bank acc1 = new Bank(bal1);
            Bank acc2 = new Bank(bal2);

            String op1 = sc.next();
            int id1 = sc.nextInt();
            int amt1 = sc.nextInt();

            // 첫 번째 명령 처리
            Bank targetAcc1 = (id1 == 1) ? acc1 : acc2;
            if (op1.equals("deposit")) {
                targetAcc1.deposit(amt1);
            } else {
                targetAcc1.withdraw(amt1);
            }

            // 두 번째 명령 처리 후
            String op2 = sc.next();
            int id2 = sc.nextInt();
            int amt2 = sc.nextInt();

            // 첫 번째 명령 처리
            Bank targetAcc2 = (id2 == 1) ? acc1 : acc2;
            if (op2.equals("deposit")) {
                targetAcc2.deposit(amt2);
            } else {
                targetAcc2.withdraw(amt2);
            }

            // Bank.totalBalance 출력
            System.out.println(acc1.balance); // 1번 계좌 잔액 표시
            System.out.println(acc2.balance); // 2번 계좌 잔액 표시
            System.out.println(Bank.totalBalance); // 종합 잔액 표시
        } catch (InputMismatchException e) { // 숫자가 아닌 값을 입력 시
            System.out.println("숫자만 입력해 주세요!"); // 예외 처리
        } finally { // 항상 실행
            sc.close(); // 자원 누수 방지
        }
    }
}
