package main.java.workbook1.operators;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // TODO: 산술 연산자(+, -, *, /, %) 결과 출력

        int sum = a + b;
        int min = a - b;
        int mul = a * b;
        double div = a / b;
        int mod = a % b;

        System.out.println("sum = " + sum);
        System.out.println("min = " + min);
        System.out.println("mul = " + mul);
        System.out.println("div = " + div);
        System.out.println("mod = " + mod);


    }
}