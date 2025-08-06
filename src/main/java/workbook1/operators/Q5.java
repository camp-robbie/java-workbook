package main.java.workbook1.operators;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: a += b * c 연산 후 a, b, c 출력
        // 세 개의 정수 입력 받기
        System.out.print("정수 a: ");
        int a = sc.nextInt();
        System.out.print("정수 b: ");
        int b = sc.nextInt();
        System.out.print("정수 c: ");
        int c = sc.nextInt();

        // 복합대입 연산자 사용 a += b * c
        a += b * c;

        // 입력 결과
        System.out.println("결과: " + a + " " + b + " " + c);

        //  main() { 코드 종료 }
        // 코드 종료
        sc.close();
    }
}

///문제 분석
// 입력처리
// 복합대입 연산자 사용 a += b * c
// 입력 테스트
//조건 : 원본 b, c 변경 금지!