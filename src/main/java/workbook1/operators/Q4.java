package main.java.workbook1.operators;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean result = a < b && b < c; // b가 a보다 크고 b가 c보다 작은지 논리 연산 후 결과 저장
        System.out.println(result);

        sc.close(); // 자원 누수 방지
    }
}