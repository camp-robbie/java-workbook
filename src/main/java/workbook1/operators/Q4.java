package main.java.workbook1.operators;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // TODO: b가 a보다 크고 c보다 작은지 평가하여 출력

        // b가 a 보다 크고 = b > a
        // b가 c 보다 작은지 =  b < c
        // 둘 다 만족해야 하기 때문에 && 논리 연산자 사용

        boolean result = b > a && b < c;
        System.out.println("result = " + result);

    }
}