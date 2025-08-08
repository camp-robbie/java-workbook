package main.java.workbook1.operators;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = (x > y) ? x : y;

        System.out.print(a * 5);
        // TODO: x와 y 중 큰 값에 5를 곱해 출력
    }
}