package main.java.workbook1.loops;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: 홀수 합과 짝수 합 계산 후 출력

        // 첫 번째 시도 - 출력 결과가 5가 나와서 실패, , ,
//        int evenSum = 0;
//        int oddSum = 0;
//
//        for (int i = 1; i <= n; i+=2) {
//            oddSum = i;
//        }
//        System.out.println("oddSum = " + oddSum);

        // 두 번째 시도 - 성공 했지만 += 같은 복합 대입 연산자 공부가 더 필요하다.
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <= n; i +=2) {
            oddSum += i;
        }

        for (int i = 2; i <= n; i += 2) {
            evenSum += i;
        }
        System.out.println(oddSum + " " + evenSum);
    }
}
