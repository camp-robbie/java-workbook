package main.java.workbook1.operators;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        // TODO: x와 y 중 큰 값에 5를 곱해 출력

        // x 와 y 중 더 큰 값을 max 에 저장.
        int max = (x > y) ? x : y;
        int result = max*5;

        System.out.println(result);
    }
}