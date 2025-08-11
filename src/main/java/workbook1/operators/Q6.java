package main.java.workbook1.operators;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        // TODO: x와 y 중 큰 값에 5를 곱해 출력

        Scanner sc = new Scanner(System.in);

        // 스캐너를 통해 숫자를 입력 받는다.
        System.out.print("Num1: ");
        int x = sc.nextInt();
        System.out.print("Num2: ");
        int y = sc.nextInt();

        // 삼항 연산자를 사용해 x와 y중 큰 값에 5를 곱한다.
        // 조건(x > y)가 true면 값1(x * 5) 선택, 거짓이면 값2(y * 5) 선택
        int sum = (x > y) ? x * 5 : y * 5;

        // 출력한다.
        System.out.println("sum = " + sum);

    }
}