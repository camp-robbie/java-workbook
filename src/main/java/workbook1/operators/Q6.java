package main.java.workbook1.operators;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 정수를 입력하세요 : ");
        int x = sc.nextInt();
        System.out.println("두 번째 정수를 입력하세요 : ");
        int y = sc.nextInt();
        // TODO: x와 y 중 큰 값에 5를 곱해 출력

        //삼항연산자..      조건   ? 반환값1 : 반환값2
        Integer result = x > y ? x * 5 : y * 5;
        System.out.println(result);
    }
}