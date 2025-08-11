package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // TODO: a, b, c 중 최대값 또는 같은 값 여부 출력
        // 문제 설명: 세 정수 a, b, c를 입력받아 세 수 중 가장 큰 값을 찾는 프로그램을 작성하시오.
        // 단, 같은 값이 있는 경우 “같은 수 존재”를 출력한다.
        // 중첩된 조건문을 활용하여 세 수를 비교합니다.

        // 같은 값이 있는 경우
        if (a == b || a == c || b == c) {
            System.out.println("같은 수 존재");
        } else {
            if (a > b) {
                // a가 b보다 크다
                if (a > c) {
                    // a가 c보다 크다
                    System.out.println("a");
                } else {
                    System.out.println("c");
                }
            } else {
                // b가 a보다 크다
                if (b > c) {
                    System.out.println("b");
                } else {
                    System.out.println("c");
                }
            }
        }
    }
}