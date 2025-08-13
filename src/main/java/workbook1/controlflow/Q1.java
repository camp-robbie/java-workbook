package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // TODO: 짝수는 합, 홀수는 곱에 반영 후 최종 결과 출력

        // 스캐너를 통해 숫자를 입력 받는다
        Scanner sc = new Scanner(System.in);
        System.out.print("Num: ");
        int n = sc.nextInt();

        // 합을 저장할 변수와 곱을 저장할 변수를 만든다.
        int evenSum = 0;
        int oddSum = 1;

        // 나누기2를 하여 홀수와 짝수를 구분하는 조건문을 만든다.
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum *= i;
            }
        }
        System.out.println(evenSum + " " + oddSum);

    }
}
