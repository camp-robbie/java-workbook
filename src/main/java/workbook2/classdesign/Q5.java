package main.java.workbook2.classdesign;


import java.util.InputMismatchException;
import java.util.Scanner;

class Account {
    String accountNo;
    int balance;

    // TODO: 생성자, deposit, withdraw 메서드 작성
    public Account(String accountNo, int balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public void deposit(int atm) { // 입금 시
        balance += atm; // 잔액에 입금액을 더한 후 저장
        System.out.println(balance); // 거래 후 잔액 출력
    }

    public void withdraw(int atm) {
        if (balance >= atm) { // 잔액이 출금액보다 작다면
            balance -= atm; // 잔액이 부족하지 않다면 출금
            System.out.println(balance); // 거래 후 잔액 출력
        } else {
            System.out.println(balance); // 거래 전 잔액 출력
            System.out.println("잔액 부족"); // 메세지 출력
        }
    }
}
/*
계좌번호와, 잔액을 먼저 입력 받아 Account에 값을 전달하여 객체를 생성한다.
그 후 거래 유형을 입력하고 입금 또는 출금액을 입력한다.
조건문을 활용하여 거래 유형별 메서드를 호출하여 처리한다.
이후 한번더 위의 동작을 진행한다.
 */
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String accNo = sc.next();
            int bal = sc.nextInt();

            Account acc = new Account(accNo, bal); // TODO: 생성자 작성 후 주석 해제

            String cmd1 = sc.next();
            int amt1 = sc.nextInt();

            if (cmd1.equals("deposit")) {
                acc.deposit(amt1); // TODO: deposit 메서드 작성 후 주석 해제
            } else {
                acc.withdraw(amt1); // TODO: withdraw 메서드 작성 후 주석 해제
            }

            String cmd2 = sc.next();
            int amt2 = sc.nextInt();

            if (cmd2.equals("deposit")) {
                acc.deposit(amt2); // TODO: deposit 메서드 작성 후 주석 해제
            } else {
                acc.withdraw(amt2); // TODO: withdraw 메서드 작성 후 주석 해제
            }
        } catch (InputMismatchException e) { // 숫자 이외의 값을 입력 시
            System.out.println("숫자만 입력해 주세요!"); // 예외 처리
        } finally { // 항상 실행
            sc.close(); // 자원 누수 방지
        }
    }
}