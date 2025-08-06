package main.java.workbook1.operators;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: 산술 연산자(+, -, *, /, %) 결과 출력
        //1. 두 개의 정수 입력 받기
        System.out.print("첫 번째 정수를 입력해주세요: ");
        int a = sc.nextInt();
        System.out.print("첫 번째 정수를 입력해주세요: ");
        int b = sc.nextInt();

        //2. 산술 연산자(+, -, *, /, %) 적용하기
        int sum = a + b;
        int diff = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a%b;

        //3.결과는 공백으로 구분해서 출력하기
        System.out.println("결과: " + sum + " " + diff + " " + mul + " " + div + " " + mod);

        //  main() { 코드 종료 }
        // 코드 종료
        sc.close();
    }
}