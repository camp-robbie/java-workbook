package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: num의 부호를 판단하여 출력
        // 정수 한 개 입력 받기
        System.out.print("정수를 입력해주세요: ");
        int num = sc.nextInt();

        //입력된 정수가 음수, 0, 양수인지 확인하기
        if ( num < 0) {
            System.out.println("음수");   // num이 0 보다 작으면 "음수" 출력
        } else if ( num == 0) {
            System.out.println("0");     // num이 0 과 같으면 "0" 출력
        } else if ( num > 0 ) {
            System.out.println("양수");   // num이 0 보다 크면 "양수" 출력
        }
        // Scanner 객체 종료 (메모리 자원 절약)
        sc.close();
    }
}

///  문제 분석
// 1개의 정수 입력 받기
// 입력값이 음수인지, 0 인지, 양수 인지 구분
// if, else if, if 사용
// 결과값 출력
