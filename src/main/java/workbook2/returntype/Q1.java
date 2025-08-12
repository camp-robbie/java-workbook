package main.java.workbook2.returntype;

import java.util.Scanner;

public class Q1 {
    // TODO: add 메서드 작성
    public static int add(int a, int b) {     // add 메서드 -> 매개변수 정수 a, b를 받아 합 반환
        return a + b;                         // 합(a+b) 반환
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner 생성
        int a = sc.nextInt();                 // 공백/개행으로 구분된 정수 1개 읽기
        int b = sc.nextInt();                 // 다음 정수 1개 읽기
        // TODO: add 호출 후 결과 출력
        int result = add(a, b);               // add 호출 결과를 변수 result 에 저장

        System.out.println(result);           // result(a+b 값) 출력

        sc.close();                           // 입력 닫기
    }
}