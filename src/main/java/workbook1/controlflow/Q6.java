package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: 1~n까지 중 자리수 합이 5의 배수인 수의 개수 출력

        int count = 0;

        for (int i = 1; i <= n; i++) {
            int num = i;
            int sum = 0;
            /*
            // solution
            // 변수명을 직관적으로 짓기!
            int digitSum = 0;   // 현재 수의 자릿수 합
            */

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            // 5의 배수가 맞는지 검사
            if (sum % 5 == 0) {
                count++;
            }
        }
        System.out.println(count);

        sc.close();

    }
}