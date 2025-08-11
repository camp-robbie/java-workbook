package main.java.workbook1.loops;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: 홀수 합과 짝수 합 계산 후 출력

        //홀수의 합과 짝수의 합을 저장할 변수 선언
        int oddSum = 0;
        int evenSum = 0;
        //홀수의 합 구하는 식 작성
        for (int i = 1; i <= n; i = i + 2) {
            oddSum += i;
        }
        //짝수의 합 구하는 식 작성
        for (int i = 2; i <= n; i = i + 2) {
            evenSum += i;
        }
        //두 식의 결과 각각 출력
        System.out.println(oddSum + " " + evenSum);

        sc.close();
    }
}
