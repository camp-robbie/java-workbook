package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: 짝수는 합, 홀수는 곱에 반영 후 최종 결과 출력
        // 1부터 N까지의 수 중 짝수이면 합에 더하고, 홀수이면 곱에 곱하는 프로그램을 작성하시오. 초기 합은 0, 초기 곱은 1이다. 합과 곱을 공백으로 출력한다.
        // for 문과 if-else 문을 함께 사용합니다.

        int sum = 0; // 초기 합은 0
        int mul = 1; // 초기 곱은 1

        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0){ // 짝수
                sum += i;
            } else { // 짝수 아님 -> 홀수
                mul *= i;
            }
        }
        System.out.println(sum + " " + mul); // 합과 곱을 공백으로 출력
    }
}
