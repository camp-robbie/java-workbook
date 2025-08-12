package main.java.workbook2.varscope;

import java.util.Scanner;

class Bank {

    // 필드
    static int totalBalance = 0;
    int balance;

    // 생성자
    Bank(int balance) {
        this.balance = balance;
        totalBalance += balance;
    }

    // 입금
    void deposit(int amount) {
        this.balance += amount;
        Bank.totalBalance += amount;
    }

    // 출금
    void withdraw(int amount) {
        if(this.balance < amount) {
            System.out.println("잔액 부족");
        }else {
            this.balance -= amount;
            Bank.totalBalance -= amount;
        }
    }
}

public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int bal1 = sc.nextInt();
        int bal2 = sc.nextInt();

        // 객체 생성
        Bank acc1 = new Bank(bal1);
        Bank acc2 = new Bank(bal2);

        // 반복되는 구문 (입력 -> 구문 실행) 은 for 문으로 처리함.
        for(int i = 0; i<2; i++){
            //명령 입력
            String op = sc.next();     // 실행할 명령
            int id = sc.nextInt();     // 계좌
            int amt = sc.nextInt();    // 증감액

            //명령 처리
            if (op.equals("deposit")){
                if (id == 1){
                    acc1.deposit(amt);
                }else{
                    acc2.deposit(amt);
                }
            }else{
                if(id == 1){
                    acc1.withdraw(amt);
                }else{
                    acc2.withdraw(amt);
                }
            }
        }

        // 출력합니다.
        System.out.println(Bank.totalBalance);

        // 비교해서 보면 차이가 더 잘 보입니다.
        System.out.println("계좌 1 잔액 : "+acc1.balance);
        System.out.println("계좌 2 잔액 : "+acc2.balance);
    }
}
