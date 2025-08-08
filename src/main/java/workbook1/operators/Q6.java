package main.java.workbook1.operators;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        // TODO: x와 y 중 큰 값에 5를 곱해 출력

        // 삼항 연산자 활용
        int i = (x > y) ? x : y;

        System.out.println(i * 5);

        /*
        // solution
        // 2중 삼항 연산자 = 조건1 ? 값1 : (조건2 ? 값2 : 값3)

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a > b ? ( a > c ? a : c) : (b > c ? b : c);
        System.out.println("최댓값: " + max);
        */

        sc.close();
    }
}