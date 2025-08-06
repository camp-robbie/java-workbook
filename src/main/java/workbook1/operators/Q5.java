package main.java.workbook1.operators;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 정수를 입력하세요 : ");
        int a = sc.nextInt();
        System.out.println("두 번째 정수를 입력하세요 : ");
        int b = sc.nextInt();
        System.out.println("세 번째 정수를 입력하세요 : ");
        int c = sc.nextInt();
        // TODO: a += b * c 연산 후 a, b, c 출력

        System.out.println("[a += b * c 연산 전] a:" + a + ", b:" + b + ", c:" + c + "입니다.");
        a += b * c;  // += 가 조건상의 복합대입연산자
        System.out.println("[a += b * c 연산 후] a:" + a + ", b:" + b + ", c:" + c + "입니다.");
    }
}
