package main.java.workbook1.operators;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: b가 a보다 크고 c보다 작은지 평가하여 출력
        // 세 개의 정수 입력 받기
        System.out.print("첫 번째 정수를 입력해주세요: ");
        int a = sc.nextInt();
        System.out.print("두 번째 정수를 입력해주세요: ");
        int b = sc.nextInt();
        System.out.print("세 번째 정수를 입력해주세요: ");
        int c = sc.nextInt();

        // 두 번째 값 b가 첫 번째 값 a보다 크고,
        // 세 번째 값 c보다 작은지 평가
        // 논리 연산자와 비교 연산자를 이용
        // 논리 연산자 && 을 사용해 두 조건이 동시에 참 인경우를 판단.
        boolean result = (b > a) && (b < c);
                        //5 > 2 && 5 < 10
                        //true

        // 평가 결과 출력
        System.out.println(result);

        //  main() { 코드 종료 }
        // 코드 종료
        sc.close();
    }
}

/// 문제 분석
// 세 개의 정수를 입력 받기
// 비교 조건
// 논리 조건
// 출력 결과 true / false