package main.java.workbook1.operators;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // TODO: 산술 연산자(+, -, *, /, %) 결과 출력

        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;

        // 계산 결과 한 줄에 출력
        System.out.println(sum + " " + sub + " " + mul + " " + div + " " + mod);

        sc.close();

    }
}