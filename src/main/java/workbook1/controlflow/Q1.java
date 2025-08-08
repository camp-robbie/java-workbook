package main.java.workbook1.controlflow;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: 짝수는 합, 홀수는 곱에 반영 후 최종 결과 출력

        int n;

        // n = 0의 경우 잘못된 결과(0 1)이 출력
        // 재입력문 출력
        while (true) {
            try {
                n = sc.nextInt();

                if (n >= 1) {
                    break;
                } else {
                    System.out.println("n은 1 이상의 정수여야 합니다.\n" + "재입력하시겠습니까? (No 입력 시 종료)");

                    sc.nextLine();
                    String no = sc.nextLine();

                    if ("No".equalsIgnoreCase(no)) {
                        System.out.println("프로그램을 종료합니다.");
                        return;
                    } else {
                        System.out.println("1 이상의 정수로 재입력 바랍니다.");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("n은 1 이상의 정수여야 합니다.\n" + "재입력하시겠습니까? (No 입력 시 종료)");

                sc.nextLine();  // 버퍼 비우기 안 하면, 무한 루프
                String no = sc.nextLine();

                if ("No".equalsIgnoreCase(no)) {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                } else {
                    System.out.println("1 이상의 정수로 재입력 바랍니다.");
                }
            }
        }

        int sum = 0;
        int mul = 1;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            } else {
                mul *= i;
            }
        }

        System.out.println(sum + " " + mul);

        sc.close();
    }
}
