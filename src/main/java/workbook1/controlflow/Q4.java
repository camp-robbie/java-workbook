package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num;

        System.out.println("정수들을 입력하세요. 0을 입력하면 종료됩니다.");

        do {
            System.out.print("0입력 전까지 정수입력이 가능합니다: ");
            num = scanner.nextInt();

            if (num > 0) {
                sum += num;
            }
        } while (num != 0);

        System.out.println("양수들의 합: " + sum);
        scanner.close();
    }
}