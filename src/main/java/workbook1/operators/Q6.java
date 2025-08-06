package main.java.workbook1.operators;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: x와 y 중 큰 값에 5를 곱해 출력
        // 두 정수 입력 처리
        System.out.print("정수 x: ");
        int x = sc.nextInt();
        System.out.print("정수 y: ");
        int y = sc.nextInt();

        // 삼항 연산자 (x > y ? x : y)를 사용
        // 큰 값을 선택하고, 그 값에 5을 곱한다.
        int result = (x > y ? x : y) * 5;
        /// x 가 y 보다 크면 x를 선택하고, 아니면 y를 선택한다.

        // x: 7
        // y: 9
        // x > y, y가 크므로 9에 5를 곱한다.

        // 결과 출력
        System.out.println("결과 : " + result); // 45

        //  main() { 코드 종료 }
        // 코드 종료
        sc.close();
    }
}

/// 문제분석
// 입력 처리
// 삼항연산자
// 결과 출력
