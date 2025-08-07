package main.java.workbook1.loops;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: 홀수 합과 짝수 합 계산 후 출력

        int sum1 = 0;   // 홀수
        int sum2 = 0;   // 짝수

        for (int i = 1; i <= n; i += 2) {
            sum1 += i;
        }
        for (int i = 2; i <= n; i += 2) {
            sum2 += i;
        }

        System.out.println(sum1 + " " + sum2);

        sc.close();

    }
}
