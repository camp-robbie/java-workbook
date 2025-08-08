package main.java.workbook1.loops;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: 홀수 합과 짝수 합 계산 후 출력

        int oddSum = 0; // 홀수 합
        int evenSum = 0; // 짝수 합

        // 홀수 합 구하기: 1부터 시작, 2씩 증가
        int i = 1;
        while (i <= n) {
            oddSum += i;
            i += 2;
        }
        // 짝수 합 구하기 : 2부터 시작, 2씩 증가
        int j = 2;
        while (j <= n) {
            evenSum += j;
            j += 2;
        }

        System.out.println("홀수 합 = " + oddSum);
        System.out.println("짝수 합 = " + evenSum);

    }
}