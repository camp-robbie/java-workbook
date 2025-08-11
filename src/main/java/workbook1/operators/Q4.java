package main.java.workbook1.operators;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        // TODO: b가 a보다 크고 c보다 작은지 평가하여 출력

        Scanner sc = new Scanner(System.in);

        // 스캐너를 통해 세 개의 숫자를 입력 받는다.
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();
        System.out.print("c: ");
        int c = sc.nextInt();

        // b가 a보다 크고 c보다 작다 -> b > a or b < c
        boolean resultB = (b > a) && (b < c);

        // 출력한다.
        System.out.println("resultB = " + resultB);

    }
}