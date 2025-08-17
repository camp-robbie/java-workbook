package main.java.workbook3.accesslevel;

import java.util.Scanner;

class BankAccount {
    //public 변수 -> 모든 곳에서 접근가능
    public String accountNo;
    //private 변수 -> 같은 클래스 내에서만 접근 가능
    private int balance;
    //private 변수 + 필드 선언
    private String password = "1111";

    BankAccount(String accountNo, int balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public int getBalance(String inputPw) {
        // TODO: 비밀번호가 맞으면 balance 반환, 아니면 -1 반환
        if(this.password.equals(inputPw)){
            return balance;
        }else{
            return -1;
        }
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("계좌번호 입력");
        String accNo = sc.next();
        System.out.println("계좌 현재 금액 입력");
        int bal = sc.nextInt();
        //입력받은 계좌번호,금액을 생성자로 BankAccount 객체 생성
        BankAccount acc = new BankAccount(accNo, bal);

        System.out.println("현재 잔액 확인 : 'get'입력");
        String cmd1 = sc.next();
        System.out.println("비밀번호 입력");
        String pw1 = sc.next();
        if (cmd1.equals("get")) {
            int res = acc.getBalance(pw1);
            //int res가 0보다 크면 res출력, 0보다 작으면 "비밀번호 오류"출력
            System.out.println(res >= 0 ? res : "비밀번호 오류");
        }

        System.out.println("현재 잔액 확인 : 'get'입력");
        String cmd2 = sc.next();
        System.out.println("비밀번호 입력");
        String pw2 = sc.next();
        if (cmd2.equals("get")) {
            int res = acc.getBalance(pw2);
            System.out.println(res >= 0 ? res : "비밀번호 오류");
        }

        sc.close();
    }
}