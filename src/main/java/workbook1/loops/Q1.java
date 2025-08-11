package main.java.workbook1.loops;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // TODO: while 문을 이용하여 1부터 n까지의 합 출력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1; // 카운트
        int sum = 0;

        while(i <= n){
            sum += i; // 더하기
            i++; // i증가
        }

        System.out.println(sum);
    }
}


