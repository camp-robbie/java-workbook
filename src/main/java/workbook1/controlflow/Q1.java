package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요.");
        int n = sc.nextInt();
        // TODO: 짝수는 합, 홀수는 곱에 반영 후 최종 결과 출력

        int sum = 0;
        int mul = 0;

        if (n % 2 == 0) {
            for (int i = 0; i <= n; i++) {
                sum = i + n;
            }
            System.out.println("짝수이므로 합을 구했습니다." + sum);
        } else {
            for (int i = 1; i <= n; i++) {
                mul = i * n;
            }
            System.out.println("홀수이므로 곱을 구했습니다." + mul);
        }
    }
}
