package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: 1~n까지 중 자리수 합이 5의 배수인 수의 개수 출력

        int count = 0;

        // 1부터 N까지 반복
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int temp = i;

            // 각 자리수 합 계산
            while (temp > 0) {
                sum += temp % 10;   // 마지막 자리 추출
                temp /= 10;         // 마지막 자리 제거
            }

            // 자릿수 합이 5의 배수인지 확인
            if (sum % 5 == 0) {
                count++;
            }
        }
        // 결과 출력
        System.out.println(count);
    }
}