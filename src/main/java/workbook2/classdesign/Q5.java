package main.java.workbook2.classdesign;

import java.util.Scanner;

/**
 * 은행 계좌(Account)를 표현하는 클래스입니다.
 * - 필드: 계좌번호(accountNo), 잔액(balance)
 * - 메서드:
 *   - deposit(amount): amount만큼 입금 후 현재 잔액 반환
 *   - withdraw(amount): amount만큼 출금 시도.
 *       * 잔액 부족이면 false 반환 (잔액 변경 없음)
 *       * 충분하면 차감하고 true 반환
 *
 * 메서드의 반환값을 main에서 해석해 출력합니다.
 */

class Account {
    String accountNo;
    int balance;
    // TODO: 생성자, deposit, withdraw 메서드 작성

    Account(String accountNo, int balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    /**
     * 여기서는 양수 입력만 들어온다고 가정합니다.
     */
    int deposit(int amount) {
        balance += amount;
        return balance;
    }

    /**
     * 출금: 잔액이 부족하면 실패(false), 충분하면 차감 후 성공(true)
     */
    boolean withdraw(int amount) {
        if (amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }
}

public class Q5 {       // Account (입출금 처리)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String accNo = sc.next();
        int bal = sc.nextInt();

        Account acc = new Account(accNo, bal); // TODO: 생성자 작성 후 주석 해제

        /// 입금 후 잔액을 출력하고,
        /// 출금 요청 시 잔액 미만이면 메시지를 출력합니다.

        // 첫 번째 명령
        String cmd1 = sc.next();
        int amt1 = sc.nextInt();

        if (cmd1.equals("deposit")) {
            // 입금은 성공 시 새 잔액을 반환하도록 구현했으니, 그 값을 그대로 출력
            System.out.println(acc.deposit(amt1));      // 입금 후 잔액 출력
        } else {
            // 출금은 성공/실패 여부(boolean)만 반환. "한 번만" 호출해야 중복 차감이 없음!
            boolean ok = acc.withdraw(amt1);            // 출금 시도(단 한 번)
            if (!ok) {
                System.out.println("잔액 부족");
            } else {
                System.out.println(acc.withdraw(amt1));     // 성공 시 현재 잔액 출력
            }
        }

        // 두 번째 명령
        String cmd2 = sc.next();
        int amt2 = sc.nextInt();

        if (cmd2.equals("deposit")) {
            // acc.deposit(amt2); // TODO: deposit 메서드 작성 후 주석 해제
            System.out.println(acc.deposit(amt2));
        } else {
            // acc.withdraw(amt2); // TODO: withdraw 메서드 작성 후 주석 해제\
            boolean ok = acc.withdraw(amt2);
            if (!ok) {
                System.out.println("잔액 부족");
            } else {
                System.out.println(acc.balance);
            }
        }

        sc.close();
    }
}