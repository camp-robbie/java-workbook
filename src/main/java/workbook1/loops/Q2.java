package main.java.workbook1.loops;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // TODO: 홀수 합과 짝수 합 계산 후 출력
        // 반복문 내에서 if 문을 사용하지 않고, 반복 변수의 증가 간격을 조절하여 홀수와 짝수를 구분
        int evenSum = 0;    // 짝수 합계를 저장할 변수
        int oddSum = 0;     // 홀수 합계를 저장할 변수

        for(int i = 2; i <= n; i += 2) {    // i는 2부터 2씩 증가하여 i가 n보다 작거나 같을 때 까지 반복함
            evenSum += i;                   // evenSum = evenSum + i;
        }

        for(int i = 1; i <= n; i += 2) {    // i는 1부터 2씩 증가하여 i가 n보다 작거나 같을 때 까지 반복함
            oddSum += i;                    // oddSum = oddSum + i;
        }

        System.out.printf("%d %d", oddSum, evenSum);    // 결과를 확인하기 위해 출력함
    }
}
