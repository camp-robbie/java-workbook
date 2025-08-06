package main.java.workbook1.operators;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 비교를 두 번 해야 합니다.
        // b가 a보다 큰 동시에 c보다 작아야 합니다.
        // && 연산자는 두 개의 boolean 값이 참일 때는 참,
        // 아닐 경우(0 0, 0 1, 1 0) 에는 거짓을 반환합니다.
        System.out.println(a<b && b<c);
    }
}