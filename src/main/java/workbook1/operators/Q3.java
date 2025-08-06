package main.java.workbook1.operators;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: x &gt; y 결과와 !(x &gt; y) 결과 출력

        // 두 개의 실수를 입력 받음
        System.out.print("첫 번째 실수를 입력하세요:");
        double x = sc.nextDouble();
        System.out.print("두 번째 실수를 입력하세요:");
        double y = sc.nextDouble();

        // 비교 연산자 x > y
        boolean result = x > y;

        // 비교 결과 출력하기
        System.out.print(result + " ");  // false

        // 논리 연산자 !
        System.out.println(!result); // true

        //  main() { 코드 종료 }
        // 코드 종료
        sc.close();
    }
}

/// 문제 분석
// 두 개의 실수 입력 받고
// 비교 연산자 > 를 통해서 첫 번째 값이 두 번째 값보다 큰지 비교하고 true/false
// 논리 NOT 연산 ! 을 통해 결과를 출력
// 결과 출력은 비교 연산 결과와 논리 연산 결과를 공백으로 구분해 출력.

/// 개행문
//        System.out.println(" ");

// 줄넘김차이
//        System.out.print(result + " ");
//        System.out.println(result + " ");