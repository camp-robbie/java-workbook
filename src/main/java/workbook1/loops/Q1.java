package main.java.workbook1.loops;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 n까지의 합을 구하는 프로그램입니다.");
        System.out.print("숫자를 입력해주세요: ");
        int n = sc.nextInt();
        // TODO: while 문을 이용하여 1부터 n까지의 합 출력

        /// 문제 분석
        // 1부터 N까지의 합
        // while 문 사용

        int num = 1; // 문제에서 1부터 계산하니 1로 초기화
                    // 입력되는 n과 구별하기 위해서 num으로 표시.
        int sum = 0; // 누적 합을 초기화할 상자 선언

        while (num <= n){
            sum += num;
            num++;
        }

        System.out.println("1부터 n까지의 합: " + sum);

        // 스캐너 객체가 나오면 메모리 절약을 위해서
        // 무지성 sc.close();
        sc.close();
    }
}


