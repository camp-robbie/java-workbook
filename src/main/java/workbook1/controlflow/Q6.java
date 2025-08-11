package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("최대값을 입력하세요 : ");
        int n = sc.nextInt();
        // TODO: 1~n까지 중 자리수 합이 5의 배수인 수의 개수 출력
        int count = 0;
        int sum = 0;
        int a = 0;
        int b = 0;

        for (int i = 1; i < n + 1; i++) {
            a = i / 5;
            b = i - (a * 5);
            if (b == 0) {
                count++;
                sum = sum + i;
            }
        }
        System.out.println("5의 배수의 개수 : " + count);
        System.out.println("5의 배수의 합 : " + sum);
    }
}