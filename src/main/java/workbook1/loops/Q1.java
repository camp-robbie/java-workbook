package main.java.workbook1.loops;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // TODO: while 문을 이용하여 1부터 n까지의 합 출력
        // while 루프에서 반복 변수를 증가시키며 합산합니다.
        // 반복 변수 : 반복문이 실행될 때마다 값이 변하면서 반복의 흐름을 제어하는 변수

        int sum = 0; // 합계 변수 sum 초기화 -> 0으로 설정
        int i = 1; // 반복 변수 i 초기화 -> 1부터 시작이라 1로 설정

        // while 루프
        while (i <= n) {
            sum += i; // 현재 i 값을 sum에 합산
            i++; // i 값을 후위 증가 연산자를 통해 반복 변수 i의 값을 증가시킴
        }

        System.out.println(sum); // 결과 출력
    }
}


