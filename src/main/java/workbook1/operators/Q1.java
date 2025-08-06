package main.java.workbook1.operators;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // 산술 연산자(+, -, *, /, %) 결과 출력
        int sum = a + b;
        int diff = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;
        System.out.print(sum + " " + diff + " " + mul + " " + div + " " + mod); // 연산 결과를 한줄로 출력
    }
}