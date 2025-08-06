package main.java.workbook1.operators;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        // TODO: x와 y 중 큰 값에 5를 곱해 출력
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int result = x > y ? x*5 : y*5;
        System.out.println(result);
    }
}