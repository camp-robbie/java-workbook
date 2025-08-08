package main.java.workbook1.loops;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // TODO: 홀수 합과 짝수 합 계산 후 출력
        // N을 입력받아 1부터 N까지 홀수의 합과 짝수의 합을 각각 출력하는 프로그램을 for 문으로 작성하시오.
        // 반복문 내에서 if 문을 사용하지 않고, 반복 변수의 증가 간격을 조절하여 홀수와 짝수를 구분합니다.
        //for문: for (초기식; 조건식; 증감식) { 반복할 코드 }

        int oddSum = 0; // 홀수 합 초기화
        int evenSum = 0; // 홀수 합 초기화

        // 홀수 합
        for (int i = 1; i <= n; i+= 2) {
            oddSum += i;
        }

        // 짝수 합
        for (int i = 2; i <= n; i+= 2) {
            evenSum += i;
        }

        System.out.println(oddSum); // 홀수 합 출력
        System.out.println(evenSum); // 짝수 합 출력
    }
}
