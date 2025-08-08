package main.java.workbook1.loops;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: 홀수 합과 짝수 합 계산 후 출력

        // 변수 선언을 for문 안에서 해줄 경우
        //  => for문 안에서만 사용되는 지역변수가 되므로
        //     main에서 사용이 불가하여 출력할 경우 오류 발생.

        int oddSum = 0;   // 홀수들의 합을 저장할 oddSum 변수 선언 및 초기화
        int evenSum = 0;  // 짝수들의 합을 저장할 evenSum 변수 선언 및 초기화

        for (int i = 1; i <= n; i++){

            oddSum += i;  // i가 홀수일 때 합 (i=1 부터 시작)

            i++;          // i를 1 증가 -> 짝수로 변경

            evenSum += i; // i가 짝수일 때 합 (i=2 부터 시작)

        }
        System.out.print(oddSum + " " + evenSum); // 홀수합 / 짝수합 출력

    }
}
