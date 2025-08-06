package main.java.workbook1.operators;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        // TODO: b가 a보다 크고 c보다 작은지 평가하여 출력
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean result = b > a && b < c;

        System.out.println(result);
    }
}