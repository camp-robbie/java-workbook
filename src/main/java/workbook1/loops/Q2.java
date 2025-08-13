package main.java.workbook1.loops;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 n까지의 홀수의 합과 짝수의 합을 구하는 프로그램입니다.");
        System.out.print("숫자를 입력해주세요: ");
        int n = sc.nextInt();
        // TODO: 홀수 합과 짝수 합 계산 후 출력

        /// 수미상관?에 맞춰서
        // 입력 - 처리 - 출력
        // 조건 - 합산 - 출력
        // 홀수의 합 - 홀수 조건식
        // 짝수의 합 - 짝수 조건식

        int oddSum = 0;     // 홀수의 합
        int evenSum = 0;    // 짝수의 합

        // 오류 : n= 5 일 때, 2+4 가 맞음
        // 아래 식에서는 4 + 6 + 8 + 10이 되버림..
//        for (int i = 2; i <= n; i++) {  // 입력된 n의 짝수의 합 계산
//            evenSum += i*2;
//        }
//        for (int i = 1; i <= n; i++) {  // 입력된 n의 홀수의 합 계산
//            oddSum += i;
//        }

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {   // 짝수 계산 - 나머지 0이 되면 짝수
                evenSum += i;
            } else  {           // 홀수 계산 나머지 1이 되면 홀수
                oddSum += i;
            }
        }

        System.out.println("홀수의 합: " + oddSum);
        System.out.println("짝수의 합: " + evenSum);

        sc.close();
    }
}
