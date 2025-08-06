package main.java.workbook1.operators;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 정수를 입력하세요 : ");
        int a = sc.nextInt();
        System.out.println("두 번째 정수를 입력하세요 : ");
        int b = sc.nextInt();
        // TODO: 산술 연산자(+, -, *, /, %) 결과 출력

        //조건상 공백으로 구분..........
        System.out.println("(+)연산결과 : " + (a + b) + " (-)연산결과 : " + (a - b) + " (*)연산결과 : " + (a * b) + " (/)연산결과 : " + (a / b));
    }
}