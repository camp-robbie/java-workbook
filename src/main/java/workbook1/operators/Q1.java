package main.java.workbook1.operators;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // TODO: 산술 연산자(+, -, *, /, %) 결과 출력

        Scanner sc = new Scanner(System.in);

        // 스캐너를 통해 숫자를 입력 받는다.
        System.out.print("Num1: ");
        int a = sc.nextInt();
        System.out.print("Num2: ");
        int b = sc.nextInt();

        // 더하기 + 출력
        int plus = a + b;
        System.out.println("plus = " + plus);

        // 빼기 + 출력
        int min = a - b;
        System.out.println("min = " + min);

        // 곱하기 + 출력
        int mul = a * b;
        System.out.println("mul = " + mul);

        // 나누기 + 출력
        double div = (double) a / b;        // 나눗셈을 할 경우 소숫점으로 떨어질 수 있기 때문에 double로 형변환
        System.out.println("div = " + div);

    }
}