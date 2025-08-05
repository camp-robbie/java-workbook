package main.java.workbook1.operators;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // TODO: 산술 연산자(+, -, *, /, %) 결과 출력
        int sum = a + b;    // a와 b를 더한 결과를 sum에 저장함

        int sub = a - b;    // a와 b를 뺀 결과를 sub에 저장함

        int mul = a * b;    // a와 b를 곱한 결과를 mul에 저장함

        int div = a / b;    // a와 b를 나눈 결과를 div에 저장함

        System.out.printf("%d %d %d %d", sum, sub, mul, div);   // 결과를 확인하기 위해서 출력함
    }
}