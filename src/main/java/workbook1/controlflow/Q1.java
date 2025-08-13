package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: 짝수는 합, 홀수는 곱에 반영 후 최종 결과 출력

        int sum = 0; // 초기 합 : 0
        int mul = 1; // 초기 곱 : 1

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
